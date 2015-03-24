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
 * @author admin
 */
public class CuentaApp {

    public Connection conexion = null;
    public CallableStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public void insertarCuenta(Cuenta cuent) throws SQLException {
        String sql = "CALL tiendaenlinea.agreCuen(?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?, "
                + "?, "
                + "?, "
                + "? );";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, cuent.getTipoDocumento());
            sentencia.setString(2, cuent.getNumeroDocumento());
            sentencia.setString(3, cuent.getPrimerNombre());
            sentencia.setString(4, cuent.getSegundoNombre());
            sentencia.setString(5, cuent.getPrimerApellido());
            sentencia.setString(6, cuent.getSegundoApellido());
            sentencia.setString(7, cuent.getContrasena());
            sentencia.setString(8, cuent.getEmail());
            sentencia.setString(9, cuent.getIdUsusario());

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

    public static void main(String[] args) throws SQLException {

        Cuenta cu = new Cuenta();
        cu.setTipoDocumento("C.C");
        cu.setNumeroDocumento("1023006469");
        cu.setPrimerNombre("Jeferson");
        cu.setSegundoNombre("Felipe");
        cu.setPrimerApellido("Marquez");
        cu.setSegundoApellido("Rojas");
        cu.setContrasena("445xdfd");
        cu.setEmail("Jef45@hotmail.com");
        cu.setIdUsusario("Nico");

        CuentaApp cu1 = new CuentaApp();
        cu1.insertarCuenta(cu);

    }
}
