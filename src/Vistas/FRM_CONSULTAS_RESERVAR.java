/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Reserva;
import Operaciones.Reservaop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alberto
 */
public class FRM_CONSULTAS_RESERVAR extends javax.swing.JFrame {
    ArrayList<Reserva> reservasconsultadasrec=new ArrayList<Reserva>();
    int tipo_global;
    String consul_global;

    /**
     * Creates new form FRM_CONSULTAS_RESERVAR
     */
    public FRM_CONSULTAS_RESERVAR() {
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

        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxttotal = new javax.swing.JPanel();
        txt_consultaReservas = new javax.swing.JTextField();
        btn_buscarReservas = new javax.swing.JButton();
        C_opciones = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxttotalX = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_vercomp = new javax.swing.JButton();
        btn_vercomp1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn_ingresar = new javax.swing.JButton();
        btn_editar2 = new javax.swing.JButton();
        btn_eliminar2 = new javax.swing.JButton();
        btn_comprobante = new javax.swing.JButton();
        btn_devolucion = new javax.swing.JButton();
        btn_entrega = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        sbmn_imprimirFactura = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mi_cerrarSesion = new javax.swing.JMenuItem();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°  RESERVA", "CEDULA ESTUDIANTE", "NOMBRE ESTUDIANTE", "CODIGO LIBRO", "TITULO LIBRO", "DESDE", "HASTA", "$ TOTAL"
            }
        ));
        jTable3.setDragEnabled(true);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS DE RESERVAS");

        jtxttotal.setBackground(new java.awt.Color(204, 255, 204));
        jtxttotal.setPreferredSize(new java.awt.Dimension(824, 1353));

        txt_consultaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultaReservasActionPerformed(evt);
            }
        });

        btn_buscarReservas.setText("BUSCAR RESERVAS");
        btn_buscarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarReservasActionPerformed(evt);
            }
        });

        C_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo de Reserva", "Cedula del Estudiante", "Codigo del Libro", "Todas Las Reservas" }));
        C_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_opcionesActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°  RESERVA", "CEDULA ESTUDIANTE", "NOMBRE ESTUDIANTE", "CODIGO LIBRO", "TITULO LIBRO", "DESDE", "HASTA", "$ TOTAL"
            }
        ));
        jTable1.setDragEnabled(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 12)); // NOI18N
        jLabel2.setText("TOTAL RESERVAS: ");

        jtxttotalX.setText("0");

        btn_nuevo.setText("NUEVO");
        btn_nuevo.setMaximumSize(new java.awt.Dimension(121, 23));
        btn_nuevo.setMinimumSize(new java.awt.Dimension(121, 23));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_vercomp.setText("VER COMPROBANTE");
        btn_vercomp.setEnabled(false);
        btn_vercomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vercompActionPerformed(evt);
            }
        });

        btn_vercomp1.setText("AÑADIR DEVOLUCIÓN");
        btn_vercomp1.setEnabled(false);
        btn_vercomp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vercomp1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO DE RESERVA", "CEDULA DE ESTUDIANTE", "NOMBRES DE ESTUDIANTE", "CODIGO DE LIBRO", "TITULO DEL LIBRO", "RESERVA", "HASTA", "TOTAL"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        btn_ingresar.setText("NUEVO");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_editar2.setText("EDITAR");
        btn_editar2.setEnabled(false);
        btn_editar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar2ActionPerformed(evt);
            }
        });

        btn_eliminar2.setText("ELIMINAR");
        btn_eliminar2.setEnabled(false);
        btn_eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar2ActionPerformed(evt);
            }
        });

        btn_comprobante.setText("RESERVA");
        btn_comprobante.setEnabled(false);
        btn_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobanteActionPerformed(evt);
            }
        });

        btn_devolucion.setText("DEVOLUCION");
        btn_devolucion.setEnabled(false);
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
            }
        });

        btn_entrega.setText("ENTREGA");
        btn_entrega.setEnabled(false);
        btn_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtxttotalLayout = new javax.swing.GroupLayout(jtxttotal);
        jtxttotal.setLayout(jtxttotalLayout);
        jtxttotalLayout.setHorizontalGroup(
            jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxttotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtxttotalLayout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(60, 60, 60)
                        .addComponent(btn_editar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar2)
                        .addGap(71, 71, 71)
                        .addComponent(btn_entrega)
                        .addGap(50, 50, 50)
                        .addComponent(btn_devolucion)
                        .addGap(56, 56, 56)
                        .addComponent(btn_comprobante))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jtxttotalLayout.createSequentialGroup()
                        .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jtxttotalLayout.createSequentialGroup()
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jtxttotalLayout.createSequentialGroup()
                                        .addGap(219, 219, 219)
                                        .addComponent(jLabel3))
                                    .addGroup(jtxttotalLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btn_editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                        .addComponent(btn_eliminar))))
                            .addGroup(jtxttotalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(btn_vercomp)
                        .addGap(59, 59, 59)
                        .addComponent(btn_vercomp1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxttotalLayout.createSequentialGroup()
                        .addComponent(txt_consultaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(C_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtxttotalLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtxttotalX))
                            .addComponent(btn_buscarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        jtxttotalLayout.setVerticalGroup(
            jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxttotalLayout.createSequentialGroup()
                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxttotalX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_consultaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_editar2)
                    .addComponent(btn_eliminar2)
                    .addComponent(btn_comprobante)
                    .addComponent(btn_devolucion)
                    .addComponent(btn_entrega))
                .addGap(581, 581, 581)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jtxttotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vercomp)
                    .addComponent(btn_vercomp1))
                .addGap(281, 281, 281)
                .addComponent(jLabel3)
                .addGap(365, 365, 365)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(666, 666, 666)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxttotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtxttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuItem3.setText("Gestion de Documentos");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Consultas");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Acciones");
        jMenu7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        sbmn_imprimirFactura.setText("Imprimir");
        sbmn_imprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmn_imprimirFacturaActionPerformed(evt);
            }
        });
        jMenu7.add(sbmn_imprimirFactura);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Regresar");
        jMenu8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        mi_cerrarSesion.setText("Volver");
        mi_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cerrarSesionActionPerformed(evt);
            }
        });
        jMenu8.add(mi_cerrarSesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 924, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cerrarSesionActionPerformed
        FRM_MENU s = new FRM_MENU();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_mi_cerrarSesionActionPerformed

    private void sbmn_imprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmn_imprimirFacturaActionPerformed
        FRM_MULTA m = new FRM_MULTA();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_sbmn_imprimirFacturaActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        btn_eliminar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_vercomp.setEnabled(true);
    }//GEN-LAST:event_jTable1MousePressed

    private void btn_vercomp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vercomp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vercomp1ActionPerformed

    private void btn_vercompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vercompActionPerformed
        // TODO add your handling code here:
        Reserva rseleccionada =reservasconsultadasrec.get(jTable1.getSelectedRow());
        System.out.println("CLICK COMPROBANTE");
        FRM_COMPROBANTE_RESERVA compreser = new FRM_COMPROBANTE_RESERVA();
        compreser.txtnombre_est.setText(rseleccionada.getId_doc());
        compreser.txtdoc_res.setText(rseleccionada.getTitulo_doc());
        compreser.txtfecha_res.setText(String.valueOf(rseleccionada.getFecha_reserva()));
        compreser.txtfecha_entregra.setText(String.valueOf(rseleccionada.getFecha_entrega()));
        compreser.txtisbn_doc.setText(rseleccionada.getIsbn_doc());
        compreser.id_res.setText(rseleccionada.getId_res());
        compreser.setVisible(true);
    }//GEN-LAST:event_btn_vercompActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int v = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas Eliminar la Reserva?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(v == JOptionPane.YES_OPTION){
            Reserva rseleccionada =reservasconsultadasrec.get(jTable1.getSelectedRow());
            Reservaop operaciones=new Reservaop();
            operaciones.EliminarReserva(rseleccionada.getId_res(),rseleccionada.getIsbn_doc());
            LlenarTabla(tipo_global,consul_global);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        FRM_EDITAR_RESERVA editar_reserva = new FRM_EDITAR_RESERVA();
        Reserva rseleccionada =reservasconsultadasrec.get(jTable1.getSelectedRow());
        editar_reserva.txt_cedu_est2.setText(rseleccionada.getId_estudiante());
        editar_reserva.txt_isbnReserva2.setText(rseleccionada.getIsbn_doc());
        editar_reserva.txt_id_res.setText(rseleccionada.getId_res());
        editar_reserva.ConsultarEstud(rseleccionada.getId_estudiante());
        editar_reserva.ConsultarDocum(rseleccionada.getIsbn_doc());
        editar_reserva.date_fechaReserva.setDate(rseleccionada.getFecha_reserva());
        // editar_reserva.date_fechaEntregaReserva.setDate(rseleccionada.getFecha_entrega());
        // Le decimos que por defecto el la reserva actual sera esta
        editar_reserva.reserva_global.setId_res(rseleccionada.getId_res());
        editar_reserva.reserva_global.setId_estudiante(rseleccionada.getId_estudiante());
        editar_reserva.reserva_global.setIsbn_doc(rseleccionada.getIsbn_doc());
        editar_reserva.reserva_global.setFecha_reserva(rseleccionada.getFecha_reserva());
        editar_reserva.reserva_global.setFecha_entrega(rseleccionada.getFecha_entrega());
        editar_reserva.est_global.setCedula(rseleccionada.getId_estudiante());
        editar_reserva.doc_global.setIsbn(rseleccionada.getIsbn_doc());
        editar_reserva.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_editarActionPerformed
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        System.out.println("CLICK NUEVO");
        FRM_RESERVA conreser = new FRM_RESERVA();
        conreser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void C_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_opcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_opcionesActionPerformed

    private void btn_buscarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarReservasActionPerformed
        int xxx=ObtenerOpcion();
        LlenarTabla(xxx,txt_consultaReservas.getText());
    }//GEN-LAST:event_btn_buscarReservasActionPerformed

    private void txt_consultaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultaReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultaReservasActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        System.out.println("CLICK NUEVO");
        FRM_RESERVA conreser = new FRM_RESERVA();
        conreser.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_editar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar2ActionPerformed
        FRM_EDITAR_RESERVA editar_reserva = new FRM_EDITAR_RESERVA();
        Reserva rseleccionada =reservasconsultadasrec.get(jTable2.getSelectedRow());
        editar_reserva.txt_cedu_est2.setText(rseleccionada.getId_estudiante());
        editar_reserva.txt_isbnReserva2.setText(rseleccionada.getIsbn_doc());
        editar_reserva.txt_id_res.setText(rseleccionada.getId_res());
        editar_reserva.ConsultarEstud(rseleccionada.getId_estudiante());
        editar_reserva.ConsultarDocum(rseleccionada.getIsbn_doc());
        editar_reserva.date_fechaReserva.setDate(rseleccionada.getFecha_reserva());
        // editar_reserva.date_fechaEntregaReserva.setDate(rseleccionada.getFecha_entrega());
        // Le decimos que por defecto el la reserva actual sera esta
        editar_reserva.reserva_global.setId_res(rseleccionada.getId_res());
        editar_reserva.reserva_global.setId_estudiante(rseleccionada.getId_estudiante());
        editar_reserva.reserva_global.setIsbn_doc(rseleccionada.getIsbn_doc());
        editar_reserva.reserva_global.setFecha_reserva(rseleccionada.getFecha_reserva());
        editar_reserva.reserva_global.setFecha_entrega(rseleccionada.getFecha_entrega());
        editar_reserva.est_global.setCedula(rseleccionada.getId_estudiante());
        editar_reserva.doc_global.setIsbn(rseleccionada.getIsbn_doc());
        editar_reserva.setVisible(true);
    }//GEN-LAST:event_btn_editar2ActionPerformed

    private void btn_eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar2ActionPerformed
         int v = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas Eliminar la Reserva?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(v == JOptionPane.YES_OPTION){
            Reserva rseleccionada =reservasconsultadasrec.get(jTable2.getSelectedRow());
            Reservaop operaciones=new Reservaop();
            operaciones.EliminarReserva(rseleccionada.getId_res(),rseleccionada.getIsbn_doc());
            LlenarTabla(tipo_global,consul_global);
        }
    }//GEN-LAST:event_btn_eliminar2ActionPerformed

    private void btn_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobanteActionPerformed
        Reserva rseleccionada =reservasconsultadasrec.get(jTable2.getSelectedRow());
        System.out.println("CLICK COMPROBANTE");
        FRM_COMPROBANTE_RESERVA compreser = new FRM_COMPROBANTE_RESERVA();
        compreser.txtnombre_est.setText(rseleccionada.getId_doc());
        compreser.txtdoc_res.setText(rseleccionada.getTitulo_doc());
        compreser.txtfecha_res.setText(String.valueOf(rseleccionada.getFecha_reserva()));
        compreser.txtfecha_entregra.setText(String.valueOf(rseleccionada.getFecha_entrega()));
        compreser.txtisbn_doc.setText(rseleccionada.getIsbn_doc());
        compreser.id_res.setText(rseleccionada.getId_res());
        compreser.setVisible(true);
    }//GEN-LAST:event_btn_comprobanteActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
        btn_eliminar2.setEnabled(true);
        btn_editar2.setEnabled(true);
        btn_comprobante.setEnabled(true);
        btn_entrega.setEnabled(true);
        btn_devolucion.setEnabled(true);
       
    }//GEN-LAST:event_jTable2MousePressed

    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        Reserva rseleccionada =reservasconsultadasrec.get(jTable2.getSelectedRow());
        System.out.println("CLICK DEVOLUCION");
        FRM_MULTA comp_dev = new FRM_MULTA();
        comp_dev.reserva_global=rseleccionada;        
        comp_dev.IniciarValores();
        comp_dev.setVisible(true);
    }//GEN-LAST:event_btn_devolucionActionPerformed

    private void btn_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entregaActionPerformed
        Reserva rseleccionada =reservasconsultadasrec.get(jTable2.getSelectedRow());
        System.out.println("CLICK ENTREGA");
        FRM_COMPROBANTE_ENTREGA_LIBRO comp_entrega = new FRM_COMPROBANTE_ENTREGA_LIBRO();
        comp_entrega.txt_nombre_est.setText(rseleccionada.getId_doc());
        comp_entrega.txt_titulo_doc.setText(rseleccionada.getTitulo_doc());
        comp_entrega.txt_fecha_prestamo.setDate(rseleccionada.getFecha_prestamo());
        System.out.println(rseleccionada.getFecha_prestamo());
        System.out.println(rseleccionada.getFecha_entrega());
        comp_entrega.txt_fecha_entrega.setDate(rseleccionada.getFecha_entrega());
        comp_entrega.txt_cod_libro.setText(rseleccionada.getIsbn_doc());
        comp_entrega.txt_precio_doc.setText(String.valueOf(rseleccionada.getPrecio()));
        System.out.println(rseleccionada.getPrecio());
        comp_entrega.txt_subtotal.setText(String.valueOf(rseleccionada.getSubtotal()));
        comp_entrega.txt_total.setText(String.valueOf(rseleccionada.getTotal()));
        comp_entrega.ComprobarFechas();
        comp_entrega.res_global=rseleccionada;
        comp_entrega.MostrarValores();
        comp_entrega.setVisible(true);
    }//GEN-LAST:event_btn_entregaActionPerformed

    private void LlenarTabla(int tipo,String texto_busqueda)
    {        
        DefaultTableModel modelo= new DefaultTableModel()
        {
        public boolean isCellEditable(int rowIndex, int vColIndex) {
        return false;
        }}; //return false: Desabilitar edición de celdas. 
        
    //    JScrollPane scrollPane = new JScrollPane(jTable1);
        modelo.addColumn("CODIGO DE RESERVA");
        modelo.addColumn("CEDULA DE ESTUDIANTE");
        modelo.addColumn("NOMBRES DE ESTUDIANTE");
        modelo.addColumn("CODIGO DE LIBRO");
        modelo.addColumn("TITULO DE LIBRO");
        modelo.addColumn("RESERVA");
        modelo.addColumn("HASTA");
        modelo.addColumn("TOTAL $");
        
     //   modelo.setAutoResizeMode(DefaultTableModel.AUTO_RESIZE_OFF);
     
        int con=0;
        jTable2.setModel(modelo);
        Reservaop operaciones=new Reservaop();
        reservasconsultadasrec=operaciones.ConsultarReservas(tipo,texto_busqueda);

        tipo_global=tipo;
        consul_global=texto_busqueda;
        try {
            for (Reserva reserva : reservasconsultadasrec) { 
                // DecimalFormat decimales = new DecimalFormat("0.00");
               // x = formatoSalidaDecimal.format(String.valueOf(reserva.getTotal());              
                modelo.insertRow(con, new Object[]{});
                modelo.setValueAt(reserva.getId_res(), con, 0);
                modelo.setValueAt(reserva.getId_estudiante(), con, 1);
                modelo.setValueAt(reserva.getId_doc(), con, 2);
                modelo.setValueAt(reserva.getIsbn_doc(), con, 3);
                modelo.setValueAt(reserva.getTitulo_doc(), con, 4);
                modelo.setValueAt(reserva.getFecha_reserva(), con, 5);
                modelo.setValueAt(reserva.getPrecio(), con, 6);
                modelo.setValueAt((reserva.getTotal()), con, 7);
                con++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        jtxttotalX.setText(String.valueOf(con));
        btn_eliminar2.setEnabled(false);
        btn_editar2.setEnabled(false);
        btn_comprobante.setEnabled(false);
        btn_entrega.setEnabled(false);
        btn_entrega.setEnabled(false);
    }
    private void ValidarButton()
    {
      /*   Reserva rseleccionada =reservasconsultadasrec.get(jTable1.getSelectedRow());
         if(rseleccionada.getId_res().equals(""))
         {
             btn_editar.setEnabled(true);
         }
        */
    }
    
    private int ObtenerOpcion()
       {
           int result=0;
           switch(C_opciones.getSelectedItem().toString())
           {
               case "Codigo de Reserva":
                   result=1;
                   break;
               case "Cedula del Estudiante":
                   result=2;
                   break;
               case "Codigo del Libro":
                   result=3;
                   break;
               case "Todas Las Reservas":
                   result=4;
                   break;
           }
           return result;
       }
     //Reserva rseleccionada =reservasconsultadasrec.get(jTable1.getSelectedRow());
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
            java.util.logging.Logger.getLogger(FRM_CONSULTAS_RESERVAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_CONSULTAS_RESERVAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_CONSULTAS_RESERVAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_CONSULTAS_RESERVAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_CONSULTAS_RESERVAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C_opciones;
    private javax.swing.JButton btn_buscarReservas;
    private javax.swing.JButton btn_comprobante;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_editar2;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminar2;
    private javax.swing.JButton btn_entrega;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_vercomp;
    private javax.swing.JButton btn_vercomp1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel jtxttotal;
    private javax.swing.JLabel jtxttotalX;
    private javax.swing.JMenuItem mi_cerrarSesion;
    private javax.swing.JMenuItem sbmn_imprimirFactura;
    private javax.swing.JTextField txt_consultaReservas;
    // End of variables declaration//GEN-END:variables
}