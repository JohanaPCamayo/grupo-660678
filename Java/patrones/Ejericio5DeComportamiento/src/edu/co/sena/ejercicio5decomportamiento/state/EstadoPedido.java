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
public abstract class EstadoPedido {
    
    protected  Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public  abstract  void agregaProducto(Producto producto);
    public  abstract  void borra();
    public  abstract  void suprimeProducto(Producto producto);
    public  abstract  EstadoPedido estadoSiguiente();
    
}
