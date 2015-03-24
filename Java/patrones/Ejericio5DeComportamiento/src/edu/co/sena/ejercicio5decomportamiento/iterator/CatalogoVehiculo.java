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
public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> {

    public CatalogoVehiculo() {

        contenido.add(new Vehiculo("vehiculo economico"));
        contenido.add(new Vehiculo("peqeño vehiculo economico"));
        contenido.add(new Vehiculo("vehiculo de gran calidad"));
    }

    @Override
    protected IteradorVehiculo creaIterador() {

        return new IteradorVehiculo();
    }

}
