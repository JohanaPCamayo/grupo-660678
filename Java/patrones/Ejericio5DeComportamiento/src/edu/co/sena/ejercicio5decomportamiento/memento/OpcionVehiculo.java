/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class OpcionVehiculo {

    protected String nombre;
    protected List<OpcionVehiculo> opcionesIncompatibles = new ArrayList<>();

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public void agregaOpcionIncompatible(OpcionVehiculo opcionImcompatible) {

        if (!opcionesIncompatibles.add(opcionImcompatible)) {

            opcionesIncompatibles.add(opcionImcompatible);
            opcionImcompatible.agregaOpcionIncompatible(this);
        }
    }

    public List<OpcionVehiculo> getOpcionesIncompatibles() {
        return opcionesIncompatibles;
    }
    
    public  void visualiza(){
    
        System.out.println("opcion: " + nombre);
    }
    
}
