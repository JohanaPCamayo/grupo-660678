/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferentesconexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD3 {

    public static void main(String[] args) throws SQLException {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/akuavida?"
                    + "user=root&password=123456789");

            System.out.println("Se conecto correctamente");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
    }

}
