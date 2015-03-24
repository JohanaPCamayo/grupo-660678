/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.flyweight;

import java.util.*;

/**
 *
 * @author maicolsteven
 */
public class FabricaOpcion {

    protected Map<String, opcionVehiculo> opciones = new TreeMap<>();

    public opcionVehiculo getOpcion(String nombre) {

        opcionVehiculo resultado;
        if (opciones.containsKey(nombre)) {
            return opciones.get(nombre);
        } else {
            resultado = new opcionVehiculo(nombre);
            opciones.put(nombre, resultado);
        }
        return resultado;
    }
}
