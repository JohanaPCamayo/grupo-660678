/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferentesconexiones;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD5 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://172.16.4.142/pijamax";
            String usuarioDB = "nicolas";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente en Mysql");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }

                // POSTGRESQL
        System.out.println("_____________________");
        
        
        java.sql.Connection conexion2 = null;

        try {
//            Class.forName("com.oracle.jdbc.Driver");
            String servidor2 = "jdbc:postgresql://localhost:5432/Jeje";
            String usuarioDB2 = "postgres";
            String passwordDB2 = "123456789";
            conexion2 = DriverManager.getConnection(servidor2, usuarioDB2, passwordDB2);
            System.out.println("Se conecto correctamente en postgreSQL");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (conexion2 != null) {
                conexion2.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
        

        // ORACLE
        System.out.println("_____________________");

        java.sql.Connection conexion3 = null;

        try {
//            Class.forName("com.oracle.jdbc.Driver");
            String servidor3 = "jdbc:oracle:thin:@172.16.4.142:1521/XE";
            String usuarioDB3 = "SENA";
            String passwordDB3 = "Sena2014";
            conexion3 = DriverManager.getConnection(servidor3, usuarioDB3, passwordDB3);
            System.out.println("Se conecto correctamente en oracle");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (conexion3 != null) {
                conexion3.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
    }
}
