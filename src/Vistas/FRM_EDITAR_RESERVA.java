/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import Modelos.Estudiante;
import Modelos.Documento;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Operaciones.Reservaop;
import Modelos.Reserva;
import Operaciones.Validaciones;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Stalin Proaño
 */
public class FRM_EDITAR_RESERVA extends javax.swing.JFrame {
    public Documento doc_global=new Documento();
    public Estudiante est_global=new Estudiante();
    public Reserva reserva_global=new Reserva();

    /**
     * Creates new form FRM_Registro_Documentos
     */
    public FRM_EDITAR_RESERVA() {
        initComponents();
        cerrar();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
 public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               public void windowClosing(WindowEvent e){                    
                Salir();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void Salir()
    {
             this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_autorReserva = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_precioReserva = new javax.swing.JTextField();
        txt_cedu_est2 = new javax.swing.JTextField();
        txt_tituloReserva = new javax.swing.JTextField();
        date_fechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_guardarContinuar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_isbnReserva2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_buscarest = new javax.swing.JButton();
        btn_buscardoc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id_res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 255, 204));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jToolBar1ComponentAdded(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(204, 255, 204));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setFocusable(false);
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_regresar);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR RESERVA");

        txt_autorReserva.setEditable(false);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("FECHA DE RESERVA");

        txt_precioReserva.setEditable(false);

        txt_cedu_est2.setBackground(new java.awt.Color(204, 255, 255));
        txt_cedu_est2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedu_est2ActionPerformed(evt);
            }
        });

        txt_tituloReserva.setEditable(false);

        date_fechaReserva.setBackground(new java.awt.Color(204, 255, 255));
        date_fechaReserva.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("PRECIO");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("AUTOR");

        btn_guardarContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diskette_save_saveas_1514.png"))); // NOI18N
        btn_guardarContinuar.setText("Actualizar Reserva");
        btn_guardarContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarContinuarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("TIPO");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("TITULO");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("C.I ESTUDIANTE");

        txt_tipo.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("ISBM");

        txt_isbnReserva2.setBackground(new java.awt.Color(204, 255, 255));
        txt_isbnReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnReserva2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("NOMBRES");

        txt_nombres.setEditable(false);

        txt_telefono.setEditable(false);

        txt_correo.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("CORREO");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("TELEFONO");

        btn_buscarest.setText("Buscar");
        btn_buscarest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarestActionPerformed(evt);
            }
        });

        btn_buscardoc.setText("Buscar");
        btn_buscardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscardocActionPerformed(evt);
            }
        });

        jLabel2.setText("Nº DE RESERVA:");

        txt_id_res.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cedu_est2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarest, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_tituloReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_autorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 51, Short.MAX_VALUE))
                                    .addComponent(txt_isbnReserva2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_precioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btn_guardarContinuar)
                                .addGap(79, 79, 79)
                                .addComponent(btn_cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(109, 109, 109)
                                .addComponent(date_fechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id_res)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_res))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedu_est2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_buscarest))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel15)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_isbnReserva2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscardoc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tituloReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_autorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_fechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarContinuar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToolBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jToolBar1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jToolBar1ComponentAdded
public void ActualizarReserva()
{
    // DEFINIMOS EL IVA
//        HaraCambios();
      /*  Validaciones validador=new Validaciones(); 
        if (DatosCorrectos()) {
            
      
        if (!validador.ExisteReserva(doc_global.getId_doc(), est_global.getId_estudiante())) {
            
        if (validador.ExisteStock(doc_global.getIsbn())) {
        Double iva=0.14;
        Double subtotal;
        Double total;
        // INSTANCIAMOS EL OBJETO DE RESERVA PARA PODER CREAR UNO Y ENVIARLO COMO PARAMETRO
        Reserva reservaguardar=new Reserva();
        //INSTANCIAMOS LA CLASE DE LAS OPERACIONES DE LA RESERVA Y CREAMOS UN OBJETO DE RESERVA Y LO VAMOS LLENANDO
        Reservaop operaciones=new Reservaop();   
        reservaguardar.setId_estudiante(est_global.getId_estudiante());
        reservaguardar.setId_doc(doc_global.getId_doc());
        reservaguardar.setId_bibliotecario("1");
        reservaguardar.setTitulo_doc(doc_global.getTitulo());
        reservaguardar.setIsbn_doc(doc_global.getIsbn());
        reservaguardar.setPrecio(doc_global.getPrecio());        
        Date ffrr = convertJavaDateToSqlDate(date_fechaReserva.getDate());
        Date ffee = convertJavaDateToSqlDate(date_fechaEntregaReserva.getDate());
        reservaguardar.setFecha_entrega(ffee);
        reservaguardar.setFecha_reserva(ffrr);
        // CALCULAMOS LA CANTIDAD DE DIAS QUE  TUVO EL LIBRO EL ESTUDIANTE
        long difms=ffee.getTime() - ffrr.getTime();
        long dias=difms / (1000 * 60 * 60 * 24);
        //CALCULAMOS EL SUBTOTAL (LOS DIAS* EL PRECIO)
        subtotal=Double.parseDouble(doc_global.getPrecio())*dias;
        total=subtotal+(subtotal*iva);
        // GUARDAMOS LO VALORES DE LA RESERVA
        reservaguardar.setSubtotal((double) subtotal);
        reservaguardar.setTotal((double) total);
        // MANDAMOS A GUARDAR LA RESERVA
        operaciones.Actualizar_Reserva(reservaguardar);
            
        }else
        {
                           JOptionPane.showMessageDialog(null, "No hay Stock para este libro"
                            + "Reserve otro ejemplar pero no este", "Espere a que alguno tenga libros disponibles",
                            JOptionPane.ERROR_MESSAGE);
        }
    }else
        {
                                       JOptionPane.showMessageDialog(null, "Este estudiante ya reservo un libro de estos,"
                            + "Lo sentimos", "El Sistema no permite reservar 2 Veces el mismo libro",
                            JOptionPane.ERROR_MESSAGE);
        }
        }else
                {
                       JOptionPane.showMessageDialog(null, "Hace Falta Algun Dato Para hacer una reserva,"
                            + "Lo sentimos", "Verifiique los datos e intente nuevamente",
                            JOptionPane.ERROR_MESSAGE);
                }
        */
        Double iva=0.14;
        Double subtotal;
        Double total;
        // INSTANCIAMOS EL OBJETO DE RESERVA PARA PODER CREAR UNO Y ENVIARLO COMO PARAMETRO
        Reserva reservaguardar=new Reserva();
        //INSTANCIAMOS LA CLASE DE LAS OPERACIONES DE LA RESERVA Y CREAMOS UN OBJETO DE RESERVA Y LO VAMOS LLENANDO
        Reservaop operaciones=new Reservaop();   
        reservaguardar.setId_estudiante(est_global.getId_estudiante());
        reservaguardar.setId_doc(doc_global.getId_doc());
        reservaguardar.setId_res(reserva_global.getId_res());
        reservaguardar.setId_bibliotecario("1");
        reservaguardar.setTitulo_doc(doc_global.getTitulo());
        reservaguardar.setIsbn_doc(doc_global.getIsbn());
        reservaguardar.setPrecio(doc_global.getPrecio());        
        Date ffrr = convertJavaDateToSqlDate(date_fechaReserva.getDate());
       // Date ffee = convertJavaDateToSqlDate(date_fechaentrega.getDate());
        //Date ffpp = convertJavaDateToSqlDate(date_fechaprestamo.getDate());
       // reservaguardar.setFecha_entrega(ffee);
        reservaguardar.setFecha_reserva(ffrr);
       // reservaguardar.setFecha_entrega(ffee);
        //reservaguardar.setFecha_prestamo(ffpp);
        // CALCULAMOS LA CANTIDAD DE DIAS QUE  TUVO EL LIBRO EL ESTUDIANTE
        //long difms=ffee.getTime() - ffpp.getTime();
        //long dias=difms / (1000 * 60 * 60 * 24);
        //CALCULAMOS EL SUBTOTAL (LOS DIAS* EL PRECIO)
        //subtotal=Double.parseDouble(doc_global.getPrecio())*dias;
       // total=subtotal+(subtotal*iva);
        // GUARDAMOS LO VALORES DE LA RESERVA
        //reservaguardar.setSubtotal((double) subtotal);
        //reservaguardar.setTotal((double) total);
        // MANDAMOS A GUARDAR LA RESERVA
        operaciones.Actualizar_Reserva(reservaguardar);
  
}
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
}
       private boolean DatosCorrectos()
    {
       /*   DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String frconvertido = fechaHora.format(date_fechaEntregaReserva.getDate());
            String feconvertido = fechaHora.format(date_fechaEntregaReserva.getDate());
          frconvertido.equals("")||feconvertido.equals("")&&!frconvertido.equals("")&&!feconvertido.equals("")) {
          return true;
            
        }else
           {
               return false;
               
           }
        */
        if (!est_global.getNombres().equals("")&&!doc_global.getTitulo().equals("")) {            
        return true;
        }else
        {
            return false;
        }
    }
       private boolean HaraCambios()
       {
           if (est_global.getCedula().equals(reserva_global.getId_estudiante())&&doc_global.getIsbn().equals(reserva_global.getIsbn_doc())){ 
               System.out.println("No hay Cambios");
               return false;
           }else{
               System.out.println("si hay Cambios");
               return true;
           }
           
       }

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"se ha cancelado la accion");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        FRM_MENU m = new FRM_MENU();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txt_cedu_est2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedu_est2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedu_est2ActionPerformed

    private void btn_buscarestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarestActionPerformed
        // TODO add your handling code here:

        //Ejecutamos el metodo de busqueda
        ConsultarEstud(txt_cedu_est2.getText());
       
        
        
        
    }//GEN-LAST:event_btn_buscarestActionPerformed
    public void ConsultarEstud(String cedula)
    {
       Reservaop crudreserva=new Reservaop();
       est_global=crudreserva.Consultar_Est(cedula); 
       txt_nombres.setText(est_global.getNombres());       
       txt_telefono.setText(est_global.getTelefono());
       txt_correo.setText(est_global.getMail());
        if (est_global.getNombres().equals("")) 
       {
           
       JOptionPane.showMessageDialog(this,"Estudiante no Encontrado");
       txt_nombres.setText("");       
       txt_telefono.setText("");
       txt_correo.setText("");
       }
    }
    public void ConsultarDocum(String isbn)
    {
       Reservaop crudreserva=new Reservaop();
       //Documento doc_recibido= crudreserva.Consultar_Doc(txt_isbnReserva1.getText());  
       doc_global= crudreserva.Consultar_Doc(isbn); 
       txt_tituloReserva.setText(doc_global.getTitulo());       
       txt_autorReserva.setText(doc_global.getAutor());
       txt_tipo.setText(doc_global.getTipo_doc());
       txt_precioReserva.setText(doc_global.getPrecio());
       
           if (doc_global.getTitulo().equals("")) 
       {
           
       JOptionPane.showMessageDialog(this,"Documento no Encontrado");
       txt_tituloReserva.setText("");       
       txt_autorReserva.setText("");
       txt_tipo.setText("");
       txt_precioReserva.setText("");
       }
    }
    private void btn_buscardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscardocActionPerformed
        // TODO add your handling code here:
        // Ejecutamos la Busqueda de Documento
      ConsultarDocum(txt_isbnReserva2.getText());     
    }//GEN-LAST:event_btn_buscardocActionPerformed

    private void txt_isbnReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnReserva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnReserva2ActionPerformed

    private void btn_guardarContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarContinuarActionPerformed
        ActualizarReserva();
    }//GEN-LAST:event_btn_guardarContinuarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_EDITAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_EDITAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_EDITAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_EDITAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_EDITAR_RESERVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscardoc;
    private javax.swing.JButton btn_buscarest;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardarContinuar;
    private javax.swing.JButton btn_regresar;
    public com.toedter.calendar.JDateChooser date_fechaReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txt_autorReserva;
    public javax.swing.JTextField txt_cedu_est2;
    private javax.swing.JTextField txt_correo;
    public javax.swing.JLabel txt_id_res;
    public javax.swing.JTextField txt_isbnReserva2;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_precioReserva;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_tituloReserva;
    // End of variables declaration//GEN-END:variables
}
