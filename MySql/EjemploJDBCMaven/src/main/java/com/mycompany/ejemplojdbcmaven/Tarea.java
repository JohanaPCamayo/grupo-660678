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
public class Tarea {

    public static void main(String[] args) throws SQLException {

        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            String i = JOptionPane.showInputDialog("Escriba el documento");
            String o = JOptionPane.showInputDialog("Escriba el numero de documento");
            String sql = "select * from akuavida.cuenta where Tipo_Documento= '" + i + "' and Numero_Documento= '" + o + "'";
            System.out.println(sql);
            rs = sentencia.executeQuery(sql);
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Tipo de documento:" + rs.getString("Tipo_Documento"));
                    System.out.println("Numero de documento:" + rs.getString("Numero_Documento"));
                    System.out.println("Primer nombre:" + rs.getString("Primer_Nombre"));
                    System.out.println("Segundo nombre:" + rs.getString("Segundo_Nombre"));
                     System.out.println("Primer apellido:" + rs.getString("Primer_Apellido"));
                    System.out.println("Segundo segundo:" + rs.getString("Segundo_Apellido"));
                    System.out.println("Contrasena :" + rs.getString("Contrasena"));
                    System.out.println("Correo:" + rs.getString("Correo"));
                    System.out.println("Direccion:" + rs.getString("Direccion"));
                    System.out.println("Telefono:" + rs.getString("Telefono"));
                    System.out.println("Rool:" + rs.getString("Rool"));
                    System.out.println("Activo:" + rs.getString("Activo"));
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
