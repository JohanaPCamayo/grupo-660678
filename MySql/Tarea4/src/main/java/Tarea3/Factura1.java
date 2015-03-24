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
 * @author ColsutecR
 */
public class Factura1 {
    public static void main(String[] args) throws SQLException {
        
         java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        try {

            Factura fac = new Factura();
            String servidor = "jdbc:mysql://localhost/tiendaenlinea";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            String pm = JOptionPane.showInputDialog("Escriba el Id factura");
           
            String sql = "select * from Tiendaenlinea.factura where  idFactura= '" + pm + "' ";
            System.out.println(sql);

            rs = sentencia.executeQuery(sql);
            while (rs.next()) {

                fac.setIdFactura(rs.getInt("idFactura"));
                fac.setFecha(rs.getDate("fecha"));
                fac.setTotal(rs.getFloat("total"));
                fac.setCuenta_tipoDocumento(rs.getString("cuenta_tipoDocumento"));
                fac.setCuenta_numeroDocumento(rs.getString("cuenta_numeroDocumento"));
                

            }
             System.out.println(fac.toString());
             
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
