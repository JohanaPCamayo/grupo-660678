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
public class MementoImpl implements Memento {

    protected List<OpcionVehiculo> opciones = new ArrayList<>();

    public void setEstado(List<OpcionVehiculo> opciones) {

        this.opciones.clear();
        this.opciones.addAll(opciones);
    }

    public List<OpcionVehiculo> getEstado() {

        return opciones;
    }

}
