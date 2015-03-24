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
public class CarritoOpciones {

    protected List<OpcionVehiculo> opciones = new ArrayList<>();

    public Memento agregaOpcion(OpcionVehiculo opcionVehiculo) {

        MementoImpl resultado = new MementoImpl();
        resultado.setEstado(opciones);
        opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());
        opciones.add(opcionVehiculo);
        return resultado;
    }

    public void anula(Memento memento) {

        MementoImpl mementoImplInstance;
        try {
            mementoImplInstance = (MementoImpl) memento;
        } catch (ClassCastException e) {
            return;
        }
        opciones = mementoImplInstance.getEstado();
    }

    public void visualiza() {

        System.out.println("Contenido del carrito de opciones");
        for (OpcionVehiculo opcion : opciones) {
            opcion.visualiza();           
        }
        System.out.println();
    }
}
