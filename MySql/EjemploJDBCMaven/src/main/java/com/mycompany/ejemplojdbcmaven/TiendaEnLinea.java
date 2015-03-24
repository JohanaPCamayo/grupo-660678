/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplojdbcmaven;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;                                    
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class TiendaEnLinea {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String servidor = "jdbc:mysql://localhost/tiendaenlinea";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            String p = JOptionPane.showInputDialog("Escriba el documento");
            String m = JOptionPane.showInputDialog("Escriba el numero de documento");
            String sql = "select * from tiendaenlinea.cuenta where tipoDocumento= '" + p + "' and numeroDocumento= '" + m + "'";
            System.out.println(sql);
            rs = sentencia.executeQuery(sql);
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Tipo de documento:" + rs.getString("tipoDocumento"));
                    System.out.println("Numero de documento:" + rs.getString("numeroDocumento"));
                    System.out.println("Primer nombre:" + rs.getString("primerNombre"));
                    System.out.println("Segundo nombre:" + rs.getString("segundoNombre"));
                     System.out.println("Primer apellido:" + rs.getString("primerApellido"));
                    System.out.println("Segundo segundo:" + rs.getString("segundoApellido"));
                    System.out.println("Contrasena :" + rs.getString("contrasena"));
                    System.out.println("Correo:" + rs.getString("email"));
                    System.out.println("Id usuario:" + rs.getString("Usuario_idUsuario"));
                }
            } else {
                System.out.println("no hay datos");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());

        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de MySql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el RS");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de MySql");
            }
        }
    }
}
