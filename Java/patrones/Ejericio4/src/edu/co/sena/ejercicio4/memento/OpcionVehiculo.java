/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.memento;

import java.util.*;

/**
 *
 * @author admin
 */
public class OpcionVehiculo {
    
    protected String nombre;
    protected List<OpcionVehiculo> opcionesIncompatibles = new ArrayList<>();
    
    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarOpcionIncompatible(OpcionVehiculo opcionIncompatible) {
        
        if (!opcionesIncompatibles.contains(opcionIncompatible)) {
            opcionesIncompatibles.add(opcionIncompatible);
            opcionIncompatible.agregarOpcionIncompatible(this);
            
        }
    }
    
    public List<OpcionVehiculo> getOpcionesIncompatibles(){
    
        return opcionesIncompatibles;
    }
    
    public void visualiza(){
    
        System.out.println("opcion : " + nombre);
    }
    
    
}