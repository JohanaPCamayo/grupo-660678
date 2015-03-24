/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.memento;

/**
 *
 * @author admin
 */
public class Usuario {
    public static void main(String[] args) {
        
        Memento memento;
        OpcionVehiculo opc1 = new OpcionVehiculo("Asisento en cuero ");
        OpcionVehiculo opc2 = new OpcionVehiculo("Reclinable");
        OpcionVehiculo opc3 = new OpcionVehiculo("Asientos deportivos ");
        opc1.agregarOpcionIncompatible(opc3);
        opc2.agregarOpcionIncompatible(opc3);
        
        CarritoOpciones carroOpc = new CarritoOpciones();
        carroOpc.agregarOpcion(opc1);
        carroOpc.agregarOpcion(opc2);
        carroOpc.visualiza();
        
        memento = carroOpc.agregarOpcion(opc3);
        carroOpc.visualiza();
        carroOpc.anula(memento);
        carroOpc.visualiza();
        
    }
}
