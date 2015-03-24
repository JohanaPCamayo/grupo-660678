/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.factorymethod;

/**
 *
 * @author admin
 */
public class Usuario {
    public static void main(String[] args) {
        
        Cliente clie;
        clie = new ClienteContado();
        clie.nuevoPedido(2000.0);
        clie.nuevoPedido(10000.0);
        clie = new ClienteCredito();
        clie.nuevoPedido(2000.0);
        clie.nuevoPedido(10000.0);
    }
}
