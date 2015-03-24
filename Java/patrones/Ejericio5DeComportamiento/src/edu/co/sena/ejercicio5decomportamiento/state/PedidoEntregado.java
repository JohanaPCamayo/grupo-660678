/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.state;

/**
 *
 * @author maicolsteven
 */
public class PedidoEntregado extends EstadoPedido{

    public PedidoEntregado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregaProducto(Producto producto) {}

    @Override
    public void borra() {}

    @Override
    public void suprimeProducto(Producto producto) {}

    @Override
    public EstadoPedido estadoSiguiente() {

    return  this;
    }
    
    
}
