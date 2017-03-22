package Modelo_CRUD;



import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jefferson
 */
public class Conexion_BD {
    Connection co;
    Statement stm;

    public Conexion_BD() {
    }

    public Connection getConexion() {
        Connection conexion = null;
        String url = "jdbc:mysql://localhost:3306/bd_biblioteca";
        String usuario = "root";
        String contrasenia = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, usuario, contrasenia);
           /* Statement stm=conexion.createStatement();
            ResultSet rs=stm.executeQuery("select*from T_MAE_ESTUDIANTE_BIB");
            while(rs.next())
            {
                System.out.println(rs.getString("nombre_est"));
                 System.out.println(rs.getString("cedula_est"));
            }
*/
            if (conexion != null) {
                System.out.println("Conexión Existosa..!!"
                        + "\n " + url);
            } else {
                System.out.println("no se conecto ");
            }

        } catch (Exception e) {
            String errordeconecion = "org.postgresql.util.PSQLException: Connection to localhost:8081 refused. Check that the hostname and port are correct and that the postmaster is accepting TCP/IP connections.";
            if (errordeconecion.equals(String.valueOf(e))) {
                JOptionPane.showMessageDialog(null, "Verifique la conecion con el servidor de base de datos", "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("error desconocido " + e);
            }

        }
        return conexion;
    }

}
