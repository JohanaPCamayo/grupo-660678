/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class VehiculoSolicitado {

    protected List<opcionVehiculo> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentasOpciones = new ArrayList<>();

    public void agregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica) {

        opciones.add(fabrica.getOpcion(nombre));
        precioDeVentasOpciones.add(precioDeVenta);
    }

    public void muestraOpciones() {

        int indice, tamaño;
        tamaño = opciones.size();
        for (indice = 0; indice < tamaño; indice++) {

            opciones.get(indice).visualiza(precioDeVentasOpciones.get(indice));
            System.out.println();
        }
    }

}
