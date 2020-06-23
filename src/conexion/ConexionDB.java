package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    private static Connection con = null;

    /**
     * Establece los valores en los parametros y crea una nueva conexion.
     * @return
     */
    public static Connection tomarConexion() {

        try {
            if (con == null) {
                Runtime.getRuntime().addShutdownHook(new GanchoApagado());
                String usr = "root";
                String pass = "";
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/seguros";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pass);
            }
        } catch (Exception ex) {
            System.out.println("error de conexion" + ex);
        }
        return con;
    }

    public static class GanchoApagado extends Thread {

        public void run() {
            try {
                Connection con = ConexionDB.tomarConexion();
                con.close();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
