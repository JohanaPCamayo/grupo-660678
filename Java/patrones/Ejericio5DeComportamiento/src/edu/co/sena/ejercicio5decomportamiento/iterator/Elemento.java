/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.iterator;

/**
 *
 * @author maicolsteven
 */
public abstract class Elemento {
    
    protected String descripcion;

    public Elemento(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean palabraClaveValida(String palabraClave){
    
    return  descripcion.indexOf(palabraClave)!= -1;
    }
}
