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
public class TiendaEnLinea2 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/tiendaenlinea";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        String idProducto = JOptionPane.showInputDialog("digite el ID del producto");
        String sql = "Select * from tiendaenlinea.producto pro where pro.idProducto= '" + idProducto + "';";

        System.out.println(sql);

        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(sql);

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    System.out.println("id producto" + rs.getString(1));
                    System.out.println("nombre producto" + rs.getString(2));
                    System.out.println("marca del producto" + rs.getString(3));
                    System.out.println("referencia del producto" + rs.getString(4));
                    System.out.println("descripcion del producto" + rs.getString(5));
                    System.out.println("material del producto" + rs.getString(6));
                    System.out.println("color del producto" + rs.getString(7));
                    System.out.println("cantidad del producto" + rs.getString(9));
                    System.out.println("activo del producto" + rs.getString(10));
                    System.out.println("precio unitario del producto" + rs.getString(11));
                    System.out.println("descuento del producto" + rs.getString(12));
                    System.out.println("id de categoria" + rs.getString(13));
                    System.out.println("-----------------------------------------------------------------------");
                }
            } else {
                System.out.println("no existe el producto");
            }

            String b1 = JOptionPane.showInputDialog("Escriba el nombre ");
            String b2 = JOptionPane.showInputDialog("Escriba la marca");
            String b3 = JOptionPane.showInputDialog("Escriba la referencia ");
            String b4 = JOptionPane.showInputDialog("Escriba la descripcion ");
            String b5 = JOptionPane.showInputDialog("Escriba el material ");
            String b6 = JOptionPane.showInputDialog("Escriba el color");
            String b7 = JOptionPane.showInputDialog("Escriba el cantidad ");
            String b8 = JOptionPane.showInputDialog("Escriba si esta activo ");
            String b9 = JOptionPane.showInputDialog("Escriba el precio unitario ");
            String b10 = JOptionPane.showInputDialog("Escriba el descuento ");
            String b11 = JOptionPane.showInputDialog("Escriba el id de categoria ");
            String ax = JOptionPane.showInputDialog("Escriba el id");
            String sql2 = "UPDATE tiendaenlinea.producto "
                    + "SET "
                    + "nombre = '" + b1 + "',"
                    + "marca = '" + b2 + "',"
                    + "referencia = '" + b3 + "',"
                    + "descripcion = '" + b4 + "',"
                    + "material = '" + b5 + "',"
                    + "color = '" + b6 + "',"
                    + "cantidad = " + b7 + ","
                    + "activo = " + b8 + ","
                    + "precioUnitario = " + b9 + ","
                    + "descuento = " + b10 + ","
                    + "Categoria_idCategoria= " + b11 + " "
                    + "WHERE idProducto = '" + ax + "';";

            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            int resul = sentencia.executeUpdate(sql2);

            if (resul == 1) {
                System.out.println("Se modifico el producto");
            } else {
                System.out.println("no se pudo modificar el producto");
            }

        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamente");
            }
        }
    }
}
