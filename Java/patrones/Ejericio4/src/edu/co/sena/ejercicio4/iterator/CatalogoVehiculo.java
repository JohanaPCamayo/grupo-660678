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
public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> {

    public CatalogoVehiculo() {

        contenido.add(new Vehiculo("vehiculo economico "));
        contenido.add(new Vehiculo("pequeño vehiculo economico "));
        contenido.add(new Vehiculo("vehiculo de gran calida "));
    }

    @Override
    public IteradorVehiculo creaIterador() {
       return new IteradorVehiculo();
    }

   

}
