/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.strategy;

import java.util.*;

/**
 *
 * @author admin
 */
public class VistaCatalogo {

    protected List<VistaVehiculo> contenido = new ArrayList<>();
    protected DibujaCatalogo dibujo;

    public VistaCatalogo(DibujaCatalogo dibujo) {

        contenido.add(new VistaVehiculo("vehiculo economico"));
        contenido.add(new VistaVehiculo("vehiculo amplio"));
        contenido.add(new VistaVehiculo("vehiculo rapido"));
        contenido.add(new VistaVehiculo("vehiculo confortable"));
        contenido.add(new VistaVehiculo("vehiculo deportivo"));

        this.dibujo = dibujo;
    }

    public void dibuja() {

        dibujo.dibuja(contenido);
    }

}
