/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.command;

/**
 *
 * @author maicolsteven
 */
public class Vehiculo {

    protected String nombre;
    protected long fechaEntradaStock;
    protected double precioVenta;

    public Vehiculo(String nombre, long fachaEntradaStock, double precioVenta) {
        this.nombre = nombre;
        this.fechaEntradaStock = fachaEntradaStock;
        this.precioVenta = precioVenta;
    }

    public long getTiempoEnStock(long hoy) {

        return hoy - fechaEntradaStock;
    }

    public void modificaPrecio(double coeficiente) {

        this.precioVenta = 0.01 * Math.round(coeficiente * this.precioVenta * 100);
    }

    public void visualiza() {

        System.out.println(nombre + " precio: " + precioVenta + "fecha entrada stock " + fechaEntradaStock);
    }
}
