/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.callablestament;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ProductoApp {

    public Connection conexion = null;
    public CallableStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public void insertarProducto(Producto prod) throws SQLException {
        String sql = "CALL tiendaenlinea.agreProducto("
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, prod.getIdProducto());
            sentencia.setString(2, prod.getNombre());
            sentencia.setString(3, prod.getMarca());
            sentencia.setString(4, prod.getReferencia());
            sentencia.setString(5, prod.getDescripcion());
            sentencia.setString(6, prod.getMaterial());
            sentencia.setString(7, prod.getColor());
            sentencia.setInt(8, prod.getCantidad());
            sentencia.setShort(9, prod.getActivo());
            sentencia.setDouble(10, prod.getPreciounitario());
            sentencia.setDouble(11, prod.getDescuento());
            sentencia.setInt(12, prod.getIdCategoria());
            sentencia.setInt(13, prod.getIdCatalogo());

            System.out.println("sentencia ejecutada " + sql);

            sentencia.execute();

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

    public static void main(String[] args) throws SQLException{

        Producto pro= new Producto();
        pro.setIdProducto("A145");
        pro.setNombre("guitarra electrica");
        pro.setMarca("yamaha");
        pro.setReferencia("rgx121z");
        pro.setDescripcion("Hecho con 3 piezas de caoba para mayor estabilidad");
        pro.setMaterial("madera de pino");
        pro.setColor("roja");
        pro.setCantidad(12);
        pro.setActivo(new Short("1"));
        pro.setPreciounitario(660000);
        pro.setDescuento(0);
        pro.setIdCategoria(6);
        pro.setIdCatalogo(1);
        
        ProductoApp prod= new ProductoApp();
        prod.insertarProducto(pro);
        
    }
}
