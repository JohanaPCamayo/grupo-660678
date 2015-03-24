/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5;

/**
 *
 * @author admin
 */
public class Usuario {
    public static void main(String[] args) {
        
        Pedido pediEspa = new PedidoEspana();
        pediEspa.setImporteSinIVA(10000);
        pediEspa.calculaPrecioConIVA();
        pediEspa.visualiza();
        
        Pedido pediLuxe = new PedidoLuxemburgo();
        pediLuxe.setImporteSinIVA(10000);
        pediLuxe.calculaPrecioConIVA();
        pediLuxe.visualiza();
    }
}
