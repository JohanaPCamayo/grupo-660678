/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.method;

/**
 *
 * @author maicolsteven
 */
public class PedidoLuxemburgo extends Pedido {

    @Override
    protected void calculaIVA() {

        importeIVA = importeSinIVA * 0.15;
    }

}
