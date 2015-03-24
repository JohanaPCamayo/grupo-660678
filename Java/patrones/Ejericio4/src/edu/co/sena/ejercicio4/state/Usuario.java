/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.state;

/**
 *
 * @author admin
 */
public class Usuario {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.agregaProducto(new Producto("Vehiculo 1"));
        pedido.agregaProducto(new Producto("accesorio 2"));
        pedido.visualiza();
        pedido.estadoSiguiente();
        pedido.agregaProducto(new Producto("accesorio 3"));
        pedido.borra();
        pedido.visualiza();
        
        Pedido pedido2 = new Pedido();
        pedido2.agregaProducto(new Producto(null));
        pedido2.agregaProducto(new Producto(null));
        pedido2.visualiza();
        pedido2.estadoSiguiente();
        pedido2.visualiza();
        pedido2.estadoSiguiente();
        pedido2.borra();
        pedido2.visualiza();

    }
}
