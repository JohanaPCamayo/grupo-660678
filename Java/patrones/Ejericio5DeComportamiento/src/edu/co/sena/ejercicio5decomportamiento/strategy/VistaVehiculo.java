/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.strategy;

/**
 *
 * @author maicolsteven
 */
public class VistaVehiculo {
    
    protected  String descripcion;

    public VistaVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void dibuja(){
    
        System.out.println(descripcion);
    }
}
