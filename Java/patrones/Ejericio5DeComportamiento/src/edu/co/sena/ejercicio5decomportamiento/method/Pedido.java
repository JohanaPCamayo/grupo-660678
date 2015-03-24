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
public abstract class Pedido {

    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;

    protected abstract void calculaIVA();

    public void calculaPrecioIVA() {

        this.calculaIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }

    public void setImporteSinIVA(double importeSinIVA) {

        this.importeSinIVA = importeSinIVA;
    }

    public void visualiza() {

        System.out.println("Pedido");
        System.out.println("Importe sin IVA " + importeSinIVA);
        System.out.println("Importe con IVA " + importeConIVA);
    }
}
