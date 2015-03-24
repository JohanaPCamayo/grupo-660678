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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class PatronApp {
    public static void main(String[] args) throws SQLException {
        
        List<PatronTO> lis24 = new ArrayList<>();

        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        double totalFactura=0;
        
        try {
            String servidor = "jdbc:mysql://localhost/tiendaenlinea";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto");
            sentencia = conexion.createStatement();
            String ax = JOptionPane.showInputDialog("Escriba el id");
            String sql = "select item.cantidad, pro.nombre, item.costoUnitario, item.costoTotal from tiendaenlinea.producto pro inner join  tiendaenlinea.item item inner join tiendaenlinea.pedido ped inner join tiendaenlinea.factura fac on  pro.idProducto=item.Producto_idProducto and ped.Factura_idFactura=item.Pedido_Factura_idFactura and fac.idFactura=item.Pedido_Factura_idFactura where fac.idFactura= '" + ax + "';";

            System.out.println(sql);
            rs = sentencia.executeQuery(sql);
            if (!rs.wasNull()) {

                while (rs.next() == true) {
                    PatronTO to1 = new PatronTO();
                    to1.setNombre(rs.getString("pro.nombre"));
                    to1.setCantidad(rs.getInt("item.cantidad"));
                    to1.setCostoUnitario(rs.getDouble("item.costoUnitario"));
                    to1.setCostoTotal(rs.getDouble("item.costoTotal"));
                    lis24.add(to1);

                   
                    
                }
            } else {
                System.out.println("no existe el producto");
            }

            for (PatronTO lis241 : lis24) {
                System.out.println(lis241.toString());
                totalFactura= totalFactura+lis241.getCostoTotal();
            }
            System.out.println("valor total es: " + totalFactura);
        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el RS");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamente");
            }
        }

    }
}
