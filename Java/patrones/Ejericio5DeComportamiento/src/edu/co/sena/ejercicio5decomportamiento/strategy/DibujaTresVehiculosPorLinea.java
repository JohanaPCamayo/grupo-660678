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
public class DibujaTresVehiculosPorLinea implements DibujaCatalogo {

    @Override
    public void dibuja(List<VistaVehiculo> contenido) {

        int contador;
        System.out.println("Dibuja los vehiculos mostrando tres vehiculos por lines");
        contador = 0;
        for (VistaVehiculo vistaVehiculo : contenido) {
            vistaVehiculo.dibuja();
            contador++;
            if (contador == 3) {
                System.out.println();
                contador = 0;
            } else {
                System.out.println();
            }
        }
        if (contador != 0) {
            System.out.println();
            System.out.println();
        }
    }

}
