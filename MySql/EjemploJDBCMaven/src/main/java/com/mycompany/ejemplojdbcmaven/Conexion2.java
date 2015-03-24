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
public class Conexion2 {
    public static void main(String[] args) {
        java.sql.Connection conexion = null;
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/maicol?" + 
                    "user=root&password=123456789");
 
            System.out.println("se conecto");                  
        } catch (SQLException  e) {
            System.out.println(e.toString());
        }
    }
}
