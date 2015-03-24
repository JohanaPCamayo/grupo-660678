/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.strategy;

import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {

    @Override
    public void dibuja(List<VistaVehiculo> contenido) {

        System.out.println("Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vistaVehiculo : contenido) {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
