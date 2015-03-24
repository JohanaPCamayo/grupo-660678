/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.memento;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Memento memento;
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        OpcionVehiculo opcion2 = new OpcionVehiculo("Reclinables");
        OpcionVehiculo opcion3 = new OpcionVehiculo("Asientos deportivos");
        opcion1.agregaOpcionIncompatible(opcion3);
        opcion2.agregaOpcionIncompatible(opcion3);
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        carritoOpciones.agregaOpcion(opcion1);
        carritoOpciones.agregaOpcion(opcion2);
        carritoOpciones.visualiza();
        memento = carritoOpciones.agregaOpcion(opcion3);
        carritoOpciones.visualiza();
        carritoOpciones.anula(memento);
        carritoOpciones.visualiza();

    }

}
