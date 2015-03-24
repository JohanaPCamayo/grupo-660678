/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.factorymethod;

/**
 *
 * @author ColsutecR
 */
public class PedidoContado extends Pedido{
    
    public PedidoContado(double importe){
    
        super(importe);
    
    }

    @Override
    public boolean valida() {
        
       return true;
    }

    @Override
    public void pagar() {
        
        System.out.println("pago del pedido por importe de : " + importe + " se ha realizado");
    }
    
}
