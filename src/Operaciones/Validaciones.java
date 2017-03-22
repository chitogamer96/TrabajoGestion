/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Modelo_CRUD.Conexion_BD;
import Modelos.Estudiante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author JOSESTALIN
 */
public class Validaciones {     
     Conexion_BD conexion;
    public Validaciones() {
           conexion = new Conexion_BD();
    }
    
    

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    public boolean validarnombre(String n) {
        String regex = "[A-Z-Ã‘ÃÃ‰ÃÃ“Ãš][[a-z-Ã±Ã¡Ã©Ã­Ã³Ãº]+]{3,20}\\s[A-Z-Ã‘ÃÃ‰ÃÃ“Ãš][[a-z-Ã±Ã¡Ã©Ã­Ã³Ãº]+]{3,20}"
                + "\\s[A-Z-Ã‘ÃÃ‰ÃÃ“Ãš][[a-z-Ã±Ã¡Ã©Ã­Ã³Ãº]+]{3,20}\\s[A-Z-Ã‘ÃÃ‰ÃÃ“Ãš][[a-z-Ã±Ã¡Ã©Ã­Ã³Ãº]+]{3,20}";
        if (n.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validartelefono(String n) {
        String regex = "^[0][[0-9]+]{9}";
        if (n.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validartipo(int n) {
        if (n == -1) {
            return false;
        } else {
            return true;
        }

    }

    public boolean validarplaca(String n) {
        String regex = "^([A-Z]{3}-[[0-9]+]{4})";
        if (n.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarMarca(String n) {
        String regex = "[A-Z-Ã‘ÃÃ‰ÃÃ“Ãš][[a-z-Ã±Ã¡Ã©Ã­Ã³Ãº]+]{2,20}";
        if (n.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean ExisteStock(String isbn)
    {
         String query="select*from t_mae_documento_bib where isbn_doc='"+isbn+"';";
         int stock=0;
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            ResultSet rs=SQL.executeQuery(query);
            while(rs.next())
           {
               stock=Integer.parseInt(rs.getString("disponibilidad_doc"));
           }
            SQL.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        if (stock>0) 
        {
            return true;            
        }else
        {
            return false;
        }
        
    }
        public boolean ExisteReserva(String id_docu,String id_estu)
    {
         String query="select*from t_mov_reserva_bib where T_MAE_DOCUMENTO_BIB_id_doc='"+id_docu+"' and T_MAE_ESTUDIANTE_BIB_id_est='"+id_estu+"';";
         String stock="";
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            ResultSet rs=SQL.executeQuery(query);
            while(rs.next())
           {
               stock=rs.getString("id_res");
           }
            SQL.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        if (stock.equals("")) 
        {
            return false;            
        }else
        {
            return true;
        }
        
    }

    public boolean validarCosto(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public boolean validadorDeDNI(String n) {
        String regex = "^([[0-9]+]{8}[A-ZÃ‘ÃÃ‰ÃÃ“Ãš]{1})";
        if(n.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

}
