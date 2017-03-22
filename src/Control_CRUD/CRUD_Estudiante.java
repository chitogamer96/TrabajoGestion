/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_CRUD;

import Modelo_CRUD.Conexion_BD;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jefferson
 */
public class CRUD_Estudiante extends javax.swing.JFrame {

    Conexion_BD conexion;
    public DefaultTableModel model;
    String columnas = "cedula_est, nombre_est, telefono_est, direccion_est, semestre_est, T_MAE_FACULTAD_BIB_id_fac, mail_est, clave_est";

    public CRUD_Estudiante() {

        conexion = new Conexion_BD();
    }

    public boolean insertar(String cedula, String nombre, int facultad, String mail,
            String direcion, int semestre, String telefono, String clave) {
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            SQL.executeUpdate("insert into t_mae_estudiante_bib(" + columnas + ") values ('" + cedula + "', '" + nombre + "','" + telefono + "', '" + direcion + "', '" + semestre + "', '" + facultad + "', '" + mail + "', '" + clave + "');");
            return false;
        } catch (Exception e) {
            System.out.println("" + e);
            return true;
        }

    }

    public void cargarIntefaz() {
        String data[][] = {};
        String col[] = {"CODIGO", "CEDULA", "NOMBRE", "TELEFONO", "DIRECIÓN", "FACULTAD",
            "SEMESTRE", "MAIL", "CLAVE"};
        model = new DefaultTableModel(data, col);
        //  consulta_estudiante.Tbl_estudiante.setModel(model);
    }

    public void BusquedaSQL(String respuesta) {
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            ResultSet rs = SQL.executeQuery("select*from estudiante inner join facultad on facultad.id_fac=estudiante.id_est ");
            int con = 0;
            while (rs.next()) {
                model.insertRow(con, new Object[]{});
                model.setValueAt(rs.getString("id_est"), con, 0);
                model.setValueAt(rs.getString("cedula_est"), con, 1);
                model.setValueAt(rs.getString("nombre_est"), con, 2);
                model.setValueAt(rs.getString("telefono_est"), con, 3);
                model.setValueAt(rs.getString("direccion_est"), con, 4);
                model.setValueAt(rs.getString("nombre_fac"), con, 5);
                model.setValueAt(rs.getString("semestre_est"), con, 6);
                model.setValueAt(rs.getString("mail_est"), con, 7);
                model.setValueAt(rs.getString("clave_est"), con, 8);
                con++;
            }
            if (respuesta != "") {
                JOptionPane.showMessageDialog(null, "Se encontraron " + con + " registros con " + respuesta.substring(5));
            }
            rs.close();
            SQL.close();
            accesoBD.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han encontrado datos , vuelva a  intentar"
                    + "Inténtelo nuevamente.", "Error en la operación",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void insertar_facultad(String imput) {
        try {
            Connection accesoBD = conexion.getConexion();
            Statement SQL = (Statement) accesoBD.createStatement();
            SQL.executeUpdate("insert into t_mae_facultad_bib (nombre_fac) values ('" + imput + "');");
                JOptionPane.showMessageDialog(null, "Se agrego la facultad de "+imput+" correctamente");
            } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
