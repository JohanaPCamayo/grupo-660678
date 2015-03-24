/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplojdbcmaven;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ColsutecR
 */
public class Conexion4 {

    public static void main(String[] args) {

        java.sql.Connection conexion = null;
        Properties propiedades = new Properties();
        propiedades.setProperty("user", "root");
        propiedades.setProperty("password", "123456789");
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/maicol",propiedades);

            System.out.println("se conecto");
        } catch (SQLException e) {
            System.err.println(e.toString());
            
        }
    }
}
