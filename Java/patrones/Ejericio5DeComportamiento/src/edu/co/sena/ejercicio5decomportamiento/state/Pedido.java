/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.state;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class Pedido {

    protected List<Producto> productos = new ArrayList<>();
    protected EstadoPedido estadoPedido;

    public Pedido() {

        estadoPedido = new PedidoEnCurso(this);
    }

    public void agregaProducto(Producto producto) {

        estadoPedido.agregaProducto(producto);
    }

    public void suprimeProducto(Producto producto) {

        estadoPedido.suprimeProducto(producto);
    }

    public void borra() {

        estadoPedido.borra();
    }

    public void estadoSiguiente() {

        estadoPedido = estadoPedido.estadoSiguiente();
    }

    public List<Producto> getProductos() {

        return productos;
    }

    public void visualiza() {

        System.out.println("Contenido del pedido");
        for (Producto producto : productos) {
            producto.visualiza();
        }
        System.out.println();
    }
}
