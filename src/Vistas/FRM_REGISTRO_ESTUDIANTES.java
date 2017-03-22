/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Adonis
 */
public class FRM_REGISTRO_ESTUDIANTES extends javax.swing.JFrame {
    /**
     * Creates new form FRM_Registro_Documentos
     */
    public FRM_REGISTRO_ESTUDIANTES() {
        initComponents();
        cerrar();
        this.setLocationRelativeTo(null);
        setResizable(false);
        RestrictedTextField res = new RestrictedTextField(txt_cedulaEstudiante);
        res.setLimit(10);
        res.setOnlyNums(true);
    }
    
    public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void confirmarSalida(){
        int v = JOptionPane.showConfirmDialog(this, "¿Seguro que desea de la aplicacion?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if(v == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Gracias por su Visita","Gracias!!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
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
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jToolBar1 = new javax.swing.JToolBar();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_cedulaEstudiante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_semestreEstudiante = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        txt_telefonoEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_direccionEstudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_correoEstudiante = new javax.swing.JTextField();
        cmb_facultadEstudiante = new javax.swing.JComboBox<String>();
        txt_nombreEstudiante = new javax.swing.JTextField();
        btn_eliminarRegistro = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_guardarRegresar = new javax.swing.JButton();
        btn_guardarContinuar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(204, 255, 204));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jToolBar1ComponentAdded(evt);
            }
        });

        btn_nuevo.setBackground(new java.awt.Color(204, 255, 204));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nuevo);

        btn_guardar.setBackground(new java.awt.Color(204, 255, 204));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardar);

        btn_eliminar.setBackground(new java.awt.Color(204, 255, 204));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setFocusable(false);
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_eliminar);

        btn_modificar.setBackground(new java.awt.Color(204, 255, 204));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_modificar);

        btn_buscar.setBackground(new java.awt.Color(204, 255, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_buscar);

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

        txt_cedulaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaEstudianteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("TELEFONO");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("SEMESTRE");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("DIRECCIÓN");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("CORREO");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("FACULTAD");

        cmb_semestreEstudiante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("CÉDULA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL DE ESTUDIANTES");

        txt_correoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoEstudianteActionPerformed(evt);
            }
        });
        txt_correoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoEstudianteKeyTyped(evt);
            }
        });

        cmb_facultadEstudiante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_facultadEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_facultadEstudianteActionPerformed(evt);
            }
        });

        txt_nombreEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreEstudianteKeyTyped(evt);
            }
        });

        btn_eliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btn_eliminarRegistro.setText("Eliminar Registro");
        btn_eliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarRegistroActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardarRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar_retornar.png"))); // NOI18N
        btn_guardarRegresar.setText("Guardar/Salir");
        btn_guardarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarRegresarActionPerformed(evt);
            }
        });

        btn_guardarContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diskette_save_saveas_1514.png"))); // NOI18N
        btn_guardarContinuar.setText("Guardar/Continuar");
        btn_guardarContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btn_guardarContinuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guardarRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_direccionEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_telefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_facultadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_correoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_semestreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 12, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarContinuar)
                    .addComponent(btn_guardarRegresar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminarRegistro))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(txt_nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(cmb_facultadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_correoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(txt_direccionEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_semestreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(txt_telefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(141, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoEstudianteActionPerformed

    private void txt_cedulaEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaEstudianteKeyTyped
        char n = evt.getKeyChar();
        if(n<'0'||n>'9')evt.consume();
    }//GEN-LAST:event_txt_cedulaEstudianteKeyTyped

    private void btn_guardarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarRegresarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Datos guardados!!!");
        FRM_MENU a = new FRM_MENU();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_guardarRegresarActionPerformed

    private void jToolBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jToolBar1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jToolBar1ComponentAdded

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void cmb_facultadEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_facultadEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_facultadEstudianteActionPerformed

    private void txt_nombreEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreEstudianteKeyTyped
        char n = evt.getKeyChar();
        if((n<'a'|| n>'z')&&(n<'A'||n>'Z')&&(n<' ' || n>' '))evt.consume();
    }//GEN-LAST:event_txt_nombreEstudianteKeyTyped

    private void txt_correoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoEstudianteKeyTyped
        
    }//GEN-LAST:event_txt_correoEstudianteKeyTyped

    private void btn_guardarContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarContinuarActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,"seguro que desea guardar");
        int valor=JOptionPane.showConfirmDialog( this,"Seguro que desea guardar los datos?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
       if(valor==JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(this,"Datos guardados!!!... Puede continuar");  
        }
        
        
    }//GEN-LAST:event_btn_guardarContinuarActionPerformed

    private void btn_eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarRegistroActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Datos eliminados!!!");
    }//GEN-LAST:event_btn_eliminarRegistroActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Se ha cancelado la accion!!!");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        FRM_MENU a = new FRM_MENU();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_REGISTRO_ESTUDIANTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_REGISTRO_ESTUDIANTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_REGISTRO_ESTUDIANTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_REGISTRO_ESTUDIANTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FRM_REGISTRO_ESTUDIANTES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarRegistro;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardarContinuar;
    private javax.swing.JButton btn_guardarRegresar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cmb_facultadEstudiante;
    private javax.swing.JComboBox<String> cmb_semestreEstudiante;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txt_cedulaEstudiante;
    private javax.swing.JTextField txt_correoEstudiante;
    private javax.swing.JTextField txt_direccionEstudiante;
    private javax.swing.JTextField txt_nombreEstudiante;
    private javax.swing.JTextField txt_telefonoEstudiante;
    // End of variables declaration//GEN-END:variables
}
