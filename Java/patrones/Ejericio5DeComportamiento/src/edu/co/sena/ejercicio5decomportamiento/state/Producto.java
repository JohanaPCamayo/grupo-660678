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
public class Producto {
    
    protected  String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    
    public void visualiza(){
    
        System.out.println("Producto: " + nombre);
    }
}
