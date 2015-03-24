/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.observer;

/**
 *
 * @author admin
 */
public class Usuario {
    public static void main(String[] args) {
        
        Vehiculo vehi = new Vehiculo();
        vehi.setDescripcion("Vehiculo economico ");
        vehi.setPrecio(5000.0);
        VistaVehiculo visVehi = new VistaVehiculo(vehi);
        visVehi.reDibuja();
        vehi.setPrecio(4500.0);
        VistaVehiculo vistVehi2 = new VistaVehiculo(vehi);
        vehi.setPrecio(5500.0);
    }
}
