/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.co.sena.ejercicio4.iterator;

/**
 *
 * @author admin
 */
public class Usuario {

    public static void main(String[] args) {

        CatalogoVehiculo cata = new CatalogoVehiculo();
        IteradorVehiculo ite = cata.busqueda("econimico ");
        Vehiculo vehiculo;
        ite.inicio();
        vehiculo = ite.item();
        while (vehiculo != null) {
            vehiculo.visualiza();
            ite.siguiente();
            vehiculo = ite.item();
        }
    }
}
