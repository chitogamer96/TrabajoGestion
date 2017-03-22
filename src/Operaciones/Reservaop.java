/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Modelo_CRUD.Conexion_BD;
import Modelos.Documento;
import Modelos.Estudiante;
import Modelos.Reserva;
import Vistas.*;
import java.awt.List;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author JOSESTALIN
 */
public class Reservaop extends javax.swing.JFrame{                 
    Conexion_BD conexion;
    Statement SQL=null;
    public Reservaop()
    {
          conexion = new Conexion_BD();
    }    
    public void RegistrarReserva(Reserva obj){
        String columnas = "T_MAE_ESTUDIANTE_BIB_id_est,T_MAE_BIBLIOTECARIO_BIB_id_bib,T_MAE_DOCUMENTO_BIB_id_doc,titulodocumento_res,isbdocumento_res,preciodocumento_res,fechareserva_res";   
        // Ingresar reserva a la Bd y disminuirle la disponibilidad -1 al libro y aumentarle +1 al reservados_doc
          try {
              // ESTABLLECEMOS LA CONECCION
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            //GUARDAMOS EN LA BD
            SQL.executeUpdate("insert into t_mov_reserva_bib(" + columnas + ") values ("+obj.getId_estudiante()+",1,"+obj.getId_doc()+",'"+obj.getTitulo_doc()+"','"+obj.getIsbn_doc()+"',"+obj.getPrecio()+",'"+obj.getFecha_reserva()+"');"); 
            // ACTUALIZAMOS EL STOCK
            ActualizarStock(1, obj.getIsbn_doc());
            // MOSTRAMOS MENSAJE DE EXITO AL GUARDAR
            JOptionPane.showMessageDialog(null, "Reserva Guardada Correctamente");
            } catch (Exception e)
            {
            JOptionPane.showMessageDialog(null, "No se  Pudo Ingresar La reserva , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);     
              System.out.println(e.getMessage());
            }
        
        
    }

    public void EliminarReserva(String idreserva,String id_docu)
    {
        // Eliminar reserva a la Bd y aumentarle la disponibilidad +1 al libro y disminuirle -1 al reservados_doc  
              String query="delete from  t_mov_reserva_bib where id_res='"+idreserva+"';"; 
        try {
              // ESTABLLECEMOS LA CONECCION
              Connection accesoBD = conexion.getConexion();
              Statement SQL = (Statement) accesoBD.createStatement();
              //GUARDAMOS EN LA BD
              SQL.executeUpdate(query);
              // Le decimos que eliminamos la reserva
              ActualizarStock(2,id_docu);
              System.out.println("Reserva Eliminada Correctamente");
             }     catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No se  Pudo Eliminar La reserva , vuelva a  intentar"
                    + "Inténtelo nuevamente.    ", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
             System.out.println(e.getMessage());
             }
              
    }
    public void Actualizar_Reserva(Reserva res_act)
    {
         // Eliminar reserva a la Bd y aumentarle la disponibilidad +1 al libro y disminuirle -1 al reservados_doc  
            String ReservaActualizada=res_act.getId_res()+","+res_act.getId_estudiante()+","+1+","+res_act.getId_doc()
                    +",'"+res_act.getTitulo_doc()+"','"+res_act.getIsbn_doc()+"','"+res_act.getPrecio()+"'";
            String query="call ActualizarReserva("+ReservaActualizada+");";
        try {
            System.out.println("Actualizando"+res_act.getIsbn_doc());
            System.out.println("Actualizando id de reserva->"+res_act.getId_res());
              // ESTABLLECEMOS LA CONECCION
              Connection accesoBD = conexion.getConexion();
              Statement SQL = (Statement) accesoBD.createStatement();
              //GUARDAMOS EN LA BD
              SQL.executeUpdate(query);
              System.out.println("Reserva Actualizada Correctamente");
             }     catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No se  Pudo Actualizar La reserva , vuelva a  intentar"
                    + "Inténtelo nuevamente.    ", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
             System.out.println(e.getMessage());
             }        
    }
     public ArrayList<Reserva> ConsultarReservas(int tipo,String codigo)
     {  
              // Consultar Reserva por su codigo
         String query="";
         ArrayList<Reserva> reservasconsultadas=new ArrayList<Reserva>();
          switch(tipo)
          {
              // Hay varios procedimientos almacenados para las busquedas
              case 1:                  
               query="call CONSULTARESERVAisbn_idreser("+codigo+");";
               reservasconsultadas=SelectReservas(query);
                  break;
              case 2:
                query="call CONSULTARESERVAcedula("+codigo+");";
               reservasconsultadas=SelectReservas(query);
                  break;
              case 3:
               query="call CONSULTARESERVAisbn_doc('"+codigo+"');";
                 reservasconsultadas=SelectReservas(query);
                  break;
              case 4:
               query="call CONSULTARESERVA();";
                 reservasconsultadas=SelectReservas(query);
                  break;
          }         
          // retornamos una lista de reservas consultadas
         return reservasconsultadas;
     }
        
        
     public ArrayList<Reserva> SelectReservas(String query)
     {            
           ArrayList<Reserva> lreservas=new ArrayList<Reserva>();      
         try {
                      // ESTABLLECEMOS LA CONECCION
                        Connection accesoBD = conexion.getConexion();
                        Statement SQL = (Statement) accesoBD.createStatement();
                        ResultSet rs=SQL.executeQuery(query);
                        // Preguntamos y hacemos para cada registro consultado que se haga lo siguiente
                        while(rs.next())
                       {
                           
                            java.util.Date fr,fe,fp,fd;
                            Date ffee,ffrr,ffpp,ffdd;                           
                           Reserva obj_reserva=new Reserva();
                           SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");                              
                           fr=formatoDelTexto.parse(rs.getString("fechareserva_res"));                           
                           ffrr = convertJavaDateToSqlDate(fr);
                           String sfp=rs.getString("fechaprestamo_res");  
                           String sfe=rs.getString("fechaentrega_res");  
                           String sfd=rs.getString("fechadevolucion_res");
                           if (!(sfe==null&&sfp==null)) {
                                fe=formatoDelTexto.parse(sfe); 
                                fp=formatoDelTexto.parse(sfp); 
                                ffee = convertJavaDateToSqlDate(fe);                                
                                ffpp = convertJavaDateToSqlDate(fp);
                                obj_reserva.setFecha_entrega(ffee);
                                obj_reserva.setFecha_prestamo(ffpp);                              
                           }
                           if (sfd!=null) {
                               fd=formatoDelTexto.parse(sfd);
                               ffdd=convertJavaDateToSqlDate(fd);
                               obj_reserva.setFecha_devolucion(ffdd);
                           }
                           obj_reserva.setId_res(rs.getString("id_res"));
                           obj_reserva.setId_estudiante(rs.getString("cedula_est"));
                           obj_reserva.setId_doc(rs.getString("nombre_est"));
                           obj_reserva.setIsbn_doc(rs.getString("isbn_doc"));
                           obj_reserva.setTitulo_doc(rs.getString("titulo_doc"));
                           obj_reserva.setFecha_reserva(ffrr);
                           obj_reserva.setPrecio(rs.getString("precio_doc"));
                          // obj_reserva.setTotal(Double.parseDouble((rs.getString("total_res"))));                           
                           lreservas.add(obj_reserva);   
                       }
                        SQL.close();
            }                         
            catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Nnno se  Pudo Encontrar La reserva , vuelva a  intentar"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());                       
         }
         // retornamos la lisa de reservas consultadas
         return lreservas;
     }
     // Metodo para convertir un date util a date sql(Para poder guardarlo en la bd)
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date)
    {
        return new java.sql.Date(date.getTime());
    }
    public void IngresarEntrega(Reserva obj_recibido)
    {
        String valores=obj_recibido.getId_res()+",'"+obj_recibido.getFecha_prestamo()+"','"+obj_recibido.getFecha_entrega()+"',"+obj_recibido.getSubtotal()+","+obj_recibido.getTotal();
        String procedimiento="call ActualizarReserva2("+valores+")";
          try {
              // ESTABLLECEMOS LA CONECCION
              Connection accesoBD = conexion.getConexion();
              Statement SQL = (Statement) accesoBD.createStatement();
              //GUARDAMOS EN LA BD
              SQL.executeUpdate(procedimiento);
              System.out.println("Reserva Actualizada Correctamente");
             }     catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No se  Pudo Actualizar La reserva , vuelva a  intentar"
                    + "Inténtelo nuevamente.    ", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
             System.out.println(e.getMessage());
             }     
        
    }
    // Metodo para ingresar devolucion a una reserva
        public void IngresarDevolucion(Reserva obj_recibido)
    {
        String queryfinal=" update t_mov_reserva_bib set fechadevolucion_res='"+obj_recibido.getFecha_devolucion()+"',multa="+obj_recibido.getMulta()+" where id_res="+obj_recibido.getId_res()+";";  
          try {
              // ESTABLLECEMOS LA CONECCION
              Connection accesoBD = conexion.getConexion();
              Statement SQL = (Statement) accesoBD.createStatement();
              //ACTUALIZAMOS
              SQL.executeUpdate(queryfinal);
              System.out.println("Reserva Actualizada Correctamente");
             }     catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No se  Pudo Actualizar La reserva , vuelva a  intentar"
                    + "Inténtelo nuevamente.    ", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
             System.out.println(e.getMessage());
             }  
        
    }
        // Metodo para consultar un  estudiante (al momento de ingresar una reserva)
     public Estudiante Consultar_Est(String cedula)
     {
         String query="select*from T_MAE_ESTUDIANTE_BIB WHERE cedula_est= '"+cedula+"'; ";
         String[] est=new String[3];
         Estudiante student= new Estudiante();
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            ResultSet rs=SQL.executeQuery(query);
            while(rs.next())
           {
               student.setId_estudiante(rs.getString("id_est"));
               student.setNombres(rs.getString("nombre_est"));
               student.setTelefono(rs.getString("telefono_est"));
               student.setMail(rs.getString("mail_est"));

           }

            SQL.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
        }
        return student;
     }
     
     
        // Metodo para consultar un  documento (al momento de ingresar una reserva)
     public Documento Consultar_Doc(String codigo)
     {
           Documento documento= new Documento();
         String query="select*from T_MAE_DOCUMENTO_BIB WHERE isbn_doc= '"+codigo+"'; ";
         //String[] doc=new String[4];
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            ResultSet rs=SQL.executeQuery(query);
            while(rs.next())
           {
                // Guardamos el ID
                 documento.setId_doc(rs.getString("id_doc")); 
                // Guardamos el ISBN
                 documento.setIsbn(rs.getString("isbn_doc")); 
                // Guardamos el Titulo
                documento.setTitulo(rs.getString("titulo_doc"));                
                // Guardamos el Autor
                documento.setAutor(rs.getString("autor_doc"));                
                // Guardamos el Tipo
                documento.setTipo_doc(rs.getString("tipo_doc"));   
                // Guardamos el Precio
                documento.setPrecio(rs.getString("precio_doc"));
           }
            if (documento.getTitulo().equals("")) {
                 JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
                
            }

            SQL.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
        }
        return documento;
     }
     // Metodos para actualizar stock (reservados y disponibles de docs)
    private void ActualizarStock(int tipo_operacion,String id)
    {
        System.out.println("Aqui   ------>"+id);
        String query="";
        switch(tipo_operacion)
        {
            case 1:
                // reserva
                System.out.println(id);
                
                query="update  t_mae_documento_bib set disponibilidad_doc=disponibilidad_doc-1,reservados_doc=reservados_doc+1 where isbn_doc='"+id+"';"; 
                try {
                      // ESTABLLECEMOS LA CONECCION
                      Connection accesoBD = conexion.getConexion();
                      Statement SQL = (Statement) accesoBD.createStatement();
                      //GUARDAMOS EN LA BD
                      SQL.executeUpdate(query);
                      System.out.println("Stock Modificado correctamente");
                     }     catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "No se  Pudo Ingresar La reserva , vuelva a  intentar"
                            + "Inténtelo nuevamente.", "Error en la operación",
                            JOptionPane.ERROR_MESSAGE);
                     }
                break;
            case 2:
                //eliminar reserva
                 query="update  t_mae_documento_bib set disponibilidad_doc=disponibilidad_doc+1,reservados_doc=reservados_doc-1 where isbn_doc='"+id+"';";
                                try {
                      // ESTABLLECEMOS LA CONECCION
                      Connection accesoBD = conexion.getConexion();
                      Statement SQL = (Statement) accesoBD.createStatement();
                      //GUARDAMOS EN LA BD
                      SQL.executeUpdate(query);
                      System.out.println("Stock Modificado correctamente");
                     }     catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "No se  Pudo Ingresar La reserva , vuelva a  intentar"
                            + "Inténtelo nuevamente.", "Error en la operación",
                            JOptionPane.ERROR_MESSAGE);
                     }
                 break;
        }
        

    }
          

}
