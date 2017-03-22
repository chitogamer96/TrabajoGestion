/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class FRM_MENU extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MENU
     */
    public FRM_MENU() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_Estudiantes = new javax.swing.JMenu();
        sbmn_controlEstudiantes = new javax.swing.JMenuItem();
        sbmn_cuentaEstudiante = new javax.swing.JMenuItem();
        mn_Bibliotecarios = new javax.swing.JMenu();
        sbmn_gestionBibliotecario = new javax.swing.JMenuItem();
        mn_Documentos = new javax.swing.JMenu();
        sbmn_gestionDocumentos = new javax.swing.JMenuItem();
        sbmn_consultaLibros = new javax.swing.JMenuItem();
        mn_Reservas = new javax.swing.JMenu();
        sbmn_gestionReservas = new javax.swing.JMenuItem();
        sbmn_consultasReservas = new javax.swing.JMenuItem();
        mn_Administracion = new javax.swing.JMenu();
        sbmn_configuracion = new javax.swing.JMenuItem();
        sbmn_cambioContraseña = new javax.swing.JMenuItem();
        sbmn_reportes = new javax.swing.JMenuItem();
        sbmn_cosultaUsuario = new javax.swing.JMenuItem();
        mn_acercade = new javax.swing.JMenu();
        sbmn_acercade = new javax.swing.JMenuItem();
        mn_ayuda = new javax.swing.JMenu();
        sbmn_ayuda = new javax.swing.JMenuItem();
        mn_Salir = new javax.swing.JMenu();
        sbmn_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("MISION\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("VISION");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mn_Estudiantes.setText("Estudiantes");
        mn_Estudiantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_controlEstudiantes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_controlEstudiantes.setText("Control de Estudiantes");
        sbmn_controlEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_controlEstudiantesActionPerformed(evt);
            }
        });
        mn_Estudiantes.add(sbmn_controlEstudiantes);

        sbmn_cuentaEstudiante.setText("Mi Cuenta");
        sbmn_cuentaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_cuentaEstudianteActionPerformed(evt);
            }
        });
        mn_Estudiantes.add(sbmn_cuentaEstudiante);

        jMenuBar1.add(mn_Estudiantes);

        mn_Bibliotecarios.setText("Bibliotecarios");
        mn_Bibliotecarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_gestionBibliotecario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_gestionBibliotecario.setText("Gestion de Bibliotecarios");
        sbmn_gestionBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_gestionBibliotecarioActionPerformed(evt);
            }
        });
        mn_Bibliotecarios.add(sbmn_gestionBibliotecario);

        jMenuBar1.add(mn_Bibliotecarios);

        mn_Documentos.setText("Documentos");
        mn_Documentos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mn_Documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_DocumentosActionPerformed(evt);
            }
        });

        sbmn_gestionDocumentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_gestionDocumentos.setText("Gestion de Documentos");
        sbmn_gestionDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_gestionDocumentosActionPerformed(evt);
            }
        });
        mn_Documentos.add(sbmn_gestionDocumentos);

        sbmn_consultaLibros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_consultaLibros.setText("Consultar Libros/Revistas");
        sbmn_consultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_consultaLibrosActionPerformed(evt);
            }
        });
        mn_Documentos.add(sbmn_consultaLibros);

        jMenuBar1.add(mn_Documentos);

        mn_Reservas.setText("Reservas");
        mn_Reservas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_gestionReservas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_gestionReservas.setText("Registrar Reserva");
        sbmn_gestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_gestionReservasActionPerformed(evt);
            }
        });
        mn_Reservas.add(sbmn_gestionReservas);

        sbmn_consultasReservas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_consultasReservas.setText("Gestion de Reservas");
        sbmn_consultasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_consultasReservasActionPerformed(evt);
            }
        });
        mn_Reservas.add(sbmn_consultasReservas);

        jMenuBar1.add(mn_Reservas);

        mn_Administracion.setText("Administracion");
        mn_Administracion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_configuracion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_configuracion.setText("Configuracion");
        sbmn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_configuracionActionPerformed(evt);
            }
        });
        mn_Administracion.add(sbmn_configuracion);

        sbmn_cambioContraseña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_cambioContraseña.setText("Cambio de Contraseña");
        sbmn_cambioContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_cambioContraseñaActionPerformed(evt);
            }
        });
        mn_Administracion.add(sbmn_cambioContraseña);

        sbmn_reportes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_reportes.setText("Reportes");
        sbmn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_reportesActionPerformed(evt);
            }
        });
        mn_Administracion.add(sbmn_reportes);

        sbmn_cosultaUsuario.setText("Consultar Estudiantes/Bibliotecarios");
        sbmn_cosultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_cosultaUsuarioActionPerformed(evt);
            }
        });
        mn_Administracion.add(sbmn_cosultaUsuario);

        jMenuBar1.add(mn_Administracion);

        mn_acercade.setText("Acerca de");
        mn_acercade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_acercade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_acercade.setText("Informacion");
        sbmn_acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_acercadeActionPerformed(evt);
            }
        });
        mn_acercade.add(sbmn_acercade);

        jMenuBar1.add(mn_acercade);

        mn_ayuda.setText("Ayuda");
        mn_ayuda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_ayuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_ayuda.setText("Ayuda");
        mn_ayuda.add(sbmn_ayuda);

        jMenuBar1.add(mn_ayuda);

        mn_Salir.setText("Salir");
        mn_Salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_cerrarSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sbmn_cerrarSesion.setText("Cerrar Sesion");
        sbmn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_cerrarSesionActionPerformed(evt);
            }
        });
        mn_Salir.add(sbmn_cerrarSesion);

        jMenuBar1.add(mn_Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbmn_controlEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_controlEstudiantesActionPerformed
        FRM_REGISTRO_ESTUDIANTES registroestu = new FRM_REGISTRO_ESTUDIANTES();
        registroestu.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_controlEstudiantesActionPerformed

    private void sbmn_gestionBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_gestionBibliotecarioActionPerformed
        FRM_REGISTRO_BIBLIOTECARIOS regibibli = new FRM_REGISTRO_BIBLIOTECARIOS();
        regibibli.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_gestionBibliotecarioActionPerformed

    private void mn_DocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_DocumentosActionPerformed
        FRM_Registro_Documentos doc = new FRM_Registro_Documentos();
        doc.setVisible(true);
        dispose();
    }//GEN-LAST:event_mn_DocumentosActionPerformed

    private void sbmn_consultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_consultaLibrosActionPerformed
        FRM_CONSULTA cosudoc = new FRM_CONSULTA();
        cosudoc.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_consultaLibrosActionPerformed

    private void sbmn_gestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_gestionReservasActionPerformed
        FRM_RESERVA reser = new FRM_RESERVA();
        reser.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_gestionReservasActionPerformed

    private void sbmn_consultasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_consultasReservasActionPerformed
        FRM_CONSULTAS_RESERVAR conreser = new FRM_CONSULTAS_RESERVAR();
        conreser.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_consultasReservasActionPerformed

    private void sbmn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_cerrarSesionActionPerformed
        int valor=JOptionPane.showConfirmDialog( this,"Seguro que desea de la aplicacion?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sbmn_cerrarSesionActionPerformed

    private void sbmn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_reportesActionPerformed
        FRM_REPORTE report = new FRM_REPORTE();
        report.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_reportesActionPerformed

    private void sbmn_acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_acercadeActionPerformed
        FRM_INFORMACION i = new FRM_INFORMACION();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_acercadeActionPerformed

    private void sbmn_gestionDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_gestionDocumentosActionPerformed
        FRM_Registro_Documentos r = new FRM_Registro_Documentos();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_gestionDocumentosActionPerformed

    private void sbmn_cuentaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_cuentaEstudianteActionPerformed
        FRM_CUENTAESTUDIANTE d = new FRM_CUENTAESTUDIANTE();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_cuentaEstudianteActionPerformed

    private void sbmn_cosultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_cosultaUsuarioActionPerformed
        FRM_CONSULTAS_USUARIOS cu = new FRM_CONSULTAS_USUARIOS();
        cu.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_cosultaUsuarioActionPerformed

    private void sbmn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_configuracionActionPerformed
         FRM_CONFIGURACION confi = new FRM_CONFIGURACION();
         confi.setVisible(true);
         dispose();
    }//GEN-LAST:event_sbmn_configuracionActionPerformed

    private void sbmn_cambioContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_cambioContraseñaActionPerformed
        FRM_CAMBIOCONTRASENIA contra = new FRM_CAMBIOCONTRASENIA();
        contra.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_cambioContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JMenu mn_Administracion;
    private javax.swing.JMenu mn_Bibliotecarios;
    private javax.swing.JMenu mn_Documentos;
    private javax.swing.JMenu mn_Estudiantes;
    private javax.swing.JMenu mn_Reservas;
    private javax.swing.JMenu mn_Salir;
    private javax.swing.JMenu mn_acercade;
    private javax.swing.JMenu mn_ayuda;
    private javax.swing.JMenuItem sbmn_acercade;
    private javax.swing.JMenuItem sbmn_ayuda;
    private javax.swing.JMenuItem sbmn_cambioContraseña;
    private javax.swing.JMenuItem sbmn_cerrarSesion;
    private javax.swing.JMenuItem sbmn_configuracion;
    private javax.swing.JMenuItem sbmn_consultaLibros;
    private javax.swing.JMenuItem sbmn_consultasReservas;
    private javax.swing.JMenuItem sbmn_controlEstudiantes;
    private javax.swing.JMenuItem sbmn_cosultaUsuario;
    private javax.swing.JMenuItem sbmn_cuentaEstudiante;
    private javax.swing.JMenuItem sbmn_gestionBibliotecario;
    private javax.swing.JMenuItem sbmn_gestionDocumentos;
    private javax.swing.JMenuItem sbmn_gestionReservas;
    private javax.swing.JMenuItem sbmn_reportes;
    // End of variables declaration//GEN-END:variables
}