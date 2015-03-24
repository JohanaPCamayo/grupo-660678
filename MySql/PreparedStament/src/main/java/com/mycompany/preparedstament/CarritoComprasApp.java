/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preparedstament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class CarritoComprasApp {

    public Connection conexion = null;
    public PreparedStatement sentencia = null;
    public ResultSet axl = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public static void main(String[] args) throws SQLException {

        
        CarritoComprasDTO carri = new CarritoComprasDTO();
        carri.setIdCarrito(3);
        carri.setTotal(0);
        carri.setSubtotal(0);
    

        CarritoComprasApp car = new CarritoComprasApp();
        car.insertarCarritoCompras(carri);

    }

    public void insertarCarritoCompras(CarritoComprasDTO carrito) throws SQLException {

        try {

            String sql = "INSERT INTO akuavida.carrito_de_compras "
                    + " (`ID_Carrito`,"
                    + "`Total`,"
                    + "`Subtotal`) "
                    + " VALUES "
                    + " (?,"
                    + "?,"
                    + "?);";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, carrito.getIdCarrito());
            sentencia.setDouble(2, carrito.getTotal());
            sentencia.setDouble(3, carrito.getSubtotal());
           

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se insertaron " + resultado);
            } else {
                System.out.println("no se inserto");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }
}




