/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Tarea3 {

    public static void main(String[] args) throws SQLException {

        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        try {

            Cuenta cue = new Cuenta();

            String servidor = "jdbc:mysql://localhost/tiendaenlinea";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            String pm = JOptionPane.showInputDialog("Escriba el documento");
            String mp = JOptionPane.showInputDialog("Escriba el numero de documento");
            String sql = "select * from tiendaenlinea.cuenta where tipoDocumento= '" + pm + "' and numeroDocumento= '" + mp + "'";
            System.out.println(sql);

            rs = sentencia.executeQuery(sql);
            while (rs.next()) {

                cue.setTipodocumento(rs.getString("tipoDocumento"));
                cue.setNumeroDocumento(rs.getString("numeroDocumento"));
                cue.setPrimerNombre(rs.getString("primerNombre"));
                cue.setSegundoNombre(rs.getString("segundoNombre"));
                cue.setPrimerApellido(rs.getString("primerApellido"));
                cue.setSegundoApellido(rs.getString("segundoApellido"));
                cue.setContrasena(rs.getString("contrasena"));
                cue.setEmail(rs.getString("email"));
                cue.setUsuario_idUsusario(rs.getString("Usuario_idUsuario"));

            }

            System.out.println(cue.toString());
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
