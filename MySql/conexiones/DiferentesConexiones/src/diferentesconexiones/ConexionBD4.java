/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferentesconexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD4 {

    public static void main(String[] args) throws SQLException {
        Connection conexion = null;
        Properties propiedades = new Properties();
        propiedades.setProperty("user", "root");
        propiedades.setProperty("password", "123456789");

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/akuavida", propiedades);
            System.out.println("Se conecto correctamente");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
        
            if (conexion!=null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        
        }
    }
}
