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
public class PedidoCredito extends Pedido{
    
    public PedidoCredito(double importe){
    
        super(importe);
    }

    @Override
    public boolean valida() {
        return ( importe >=100.00 ) && (importe <= 500.00);
    }

    @Override
    public void pagar() {
        System.out.println("pago a credito " + importe + "se ha realizado");
    }
    
}
