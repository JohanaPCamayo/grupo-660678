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
public class Tarea1 {

    public static void main(String[] args) throws SQLException {

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        Statement sentencia = null;
        ResultSet rs = null;
        java.sql.Connection conexion = null;
        String a1 = JOptionPane.showInputDialog("Escriba el id del producto");
        String a2 = JOptionPane.showInputDialog("Escriba la categoria");
        String a3 = JOptionPane.showInputDialog("Escriba el nombre ");
        String a4 = JOptionPane.showInputDialog("Escriba el precio");
        String a5 = JOptionPane.showInputDialog("Escriba la descripcion");
        String a6 = JOptionPane.showInputDialog("Escriba la cantidad");
        String a7 = JOptionPane.showInputDialog("Escriba si esta activo?");
        String a8 = JOptionPane.showInputDialog("Escriba el impúesto");
        String sql = "INSERT INTO akuavida.producto"
                + "("
                + "`ID_producto`,"
                + "`Categorias_ID_Categoria`,"
                + "`Nombre`,"
                + "`Precio`,"
                + "`Descripcion`,"
                + "`Cantidad`,"
                + "`Activo`,"
                + "`impuesto`)"
                + "VALUES"
                + "('" + a1 + "',"
                + "'" + a2 + "',"
                + "'" + a3 + "',"
                + "" + a4 + ","
                + "'" + a5 + "',"
                + "" + a6 + ","
                + "" + a7 + ","
                + "" + a8 + ");";
        System.out.println(sql);
        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia= conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        
            boolean resul = sentencia.execute(sql);
            if (resul=true) {
                System.out.println("Se inserto");
            } else {
                System.out.println("no se inserto");
            }
        } catch (SQLException e) {

            System.out.println(e.toString());
        }finally{
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }
            if (conexion!=null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamente");
            }
        }
    }
}
