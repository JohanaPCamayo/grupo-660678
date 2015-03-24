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
public class PedidoValido extends EstadoPedido {

    public PedidoValido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregaProducto(Producto producto) {

    }

    @Override
    public void borra() {
        pedido.getProductos().clear();
    }

    @Override
    public void suprimeProducto(Producto producto) {

    }

    @Override
    public EstadoPedido estadoSiguiente() {
        return new PedidoEntregado(pedido);
    }

}
