/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preparedstament;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class CuentaApp {

    public Connection conexion = null;
    public PreparedStatement sentencia = null;
    public ResultSet axl = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public static void main(String[] args) throws SQLException {

        CuentaDTO cuenta1 = new CuentaDTO();
        cuenta1.setTipoDeDocumento("C.C");
        cuenta1.setNumeroDeDocumento("10230064587");
        cuenta1.setPrimerNombre("Ana");
        cuenta1.setSegundoNombre("Mariia");
        cuenta1.setPrimerApellido("Hoyos");
        cuenta1.setSegundoApellido("Rodriguez");
        cuenta1.setContrasena("4512gjgsd");
        cuenta1.setCorreo("anaHoy@yahoo.es");
        cuenta1.setDireccion("calle 45 b 56-56");
        cuenta1.setTelefono("7546824");
        cuenta1.setRool("Cliente");
        cuenta1.setActivo(new Short("1"));
        cuenta1.setIdusuario("4");

        CuentaApp cu = new CuentaApp();
        cu.insertarCuenta(cuenta1);

        System.out.println("---------------------------------------------------");

        CuentaDTO cuenta2 = new CuentaDTO();

        cuenta2.setSegundoNombre("Gabriel");
        cuenta2.setCorreo("anaHoy@hotmail.com");
        cuenta2.setTelefono("3125124832");
        cuenta2.setTipoDeDocumento("C.C");
        cuenta2.setNumeroDeDocumento("10230064587");

        CuentaApp cu1 = new CuentaApp();
        cu1.actualizarCuenta(cuenta2);

        System.out.println("---------------------------------------------------");

        CuentaDTO cuenta3 = new CuentaDTO();
        cuenta3.setTipoDeDocumento("C.C");
        cuenta3.setNumeroDeDocumento("10230064587");

        CuentaApp cu2 = new CuentaApp();
        cu2.borrarCuenta(cuenta3);

        System.out.println("---------------------------------------------------");

        CuentaDTO cuenta4 = new CuentaDTO();
        cuenta4.setTipoDeDocumento("C.C");
        cuenta4.setNumeroDeDocumento("1033757632");

        CuentaApp cu3 = new CuentaApp();
        CuentaDTO cuen=cu3.buscarCuenta(cuenta4);
        System.out.println(cuen.toString());

    }

    public void insertarCuenta(CuentaDTO cuenta) throws SQLException {

        try {

            String sql = "INSERT INTO tiendaenlinea.cuenta"
                    + "(`tipoDocumento`,"
                    + "`numeroDocumento`,"
                    + "`primerNombre`,"
                    + "`segundoNombre`,"
                    + "`primerApellido`,"
                    + "`segundoApellido`,"
                    + "`contraseña`,"
                    + "`correo`,"
                    + "`direccion`,"
                    + "`telefono`,"
                    + "`rool`,"
                    + "`activo`,"
                    + "`ususario_idUsusario`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?);";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, cuenta.getTipoDeDocumento());
            sentencia.setString(2, cuenta.getNumeroDeDocumento());
            sentencia.setString(3, cuenta.getPrimerNombre());
            sentencia.setString(4, cuenta.getSegundoNombre());
            sentencia.setString(5, cuenta.getPrimerApellido());
            sentencia.setString(6, cuenta.getSegundoApellido());
            sentencia.setString(7, cuenta.getContrasena());
            sentencia.setString(8, cuenta.getCorreo());
            sentencia.setString(9, cuenta.getDireccion());
            sentencia.setString(10, cuenta.getTelefono());
            sentencia.setString(11, cuenta.getRool());
            sentencia.setShort(12, cuenta.isActivo());
            sentencia.setString(13, cuenta.getIdusuario());

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

    public void actualizarCuenta(CuentaDTO cuenta) throws SQLException {

        try {

            String sql = "UPDATE tiendaenlinea.cuenta"
                    + " SET "
                    + "`segundoNombre` = ?,"
                    + "`Correo` = ?,"
                    + "`telefono` = ? "
                    + "WHERE `tipoDocumento` = ? AND `numeroDocumento` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, cuenta.getSegundoNombre());
            sentencia.setString(2, cuenta.getCorreo());
            sentencia.setString(3, cuenta.getTelefono());
            sentencia.setString(4, cuenta.getTipoDeDocumento());
            sentencia.setString(5, cuenta.getNumeroDeDocumento());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se actualizo " + resultado);
            } else {
                System.out.println("no se actualizo");
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

    public void borrarCuenta(CuentaDTO cuenta) throws SQLException {

        try {

            String sql = "DELETE FROM tiendaenlinea.cuenta"
                    + " WHERE `tipoDocumento` = ? AND `numeroDocumento` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, cuenta.getTipoDeDocumento());
            sentencia.setString(2, cuenta.getNumeroDeDocumento());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se borro " + resultado);
            } else {
                System.out.println("no se borro");
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

    public CuentaDTO buscarCuenta(CuentaDTO cuenta) throws SQLException {
        CuentaDTO ct = new CuentaDTO();
        try {

            String sqlSelect = "SELECT * FROM tiendaenlinea.cuenta WHERE tipoDocumento = ? and numeroDocumento = ?";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareStatement(sqlSelect);

            sentencia.setString(1, cuenta.getTipoDeDocumento());
            sentencia.setString(2, cuenta.getNumeroDeDocumento());

            System.out.println("sentencia ejecutada " + sqlSelect);

            axl = sentencia.executeQuery();

            while (axl.next() == true) {
                ct.setTipoDeDocumento(axl.getString("tipoDocumento"));
                ct.setNumeroDeDocumento(axl.getString("numeroDocumento"));
                ct.setPrimerNombre(axl.getString("primerNombre"));
                ct.setSegundoNombre(axl.getString("segundoNombre"));
                ct.setPrimerApellido(axl.getString("primerApellido"));
                ct.setSegundoApellido(axl.getString("segundoApellido"));
                ct.setContrasena(axl.getString("contraseña"));
                ct.setCorreo(axl.getString("correo"));
                ct.setDireccion(axl.getString("direccion"));
                ct.setTelefono(axl.getString("telefono"));
                ct.setRool(axl.getString("rool"));
                ct.setActivo(axl.getShort("activo"));
                ct.setIdusuario(axl.getString("ususario_idUsusario"));
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
        return ct;
    }
}
