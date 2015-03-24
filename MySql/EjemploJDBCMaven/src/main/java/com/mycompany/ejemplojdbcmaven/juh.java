/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplojdbcmaven;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class juh {

    public static void main(String[] args) {
        java.sql.Connection conexion = null;
        try {

            String servidor = "jdbc:mysql://localhost/johana";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("se conecto");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
