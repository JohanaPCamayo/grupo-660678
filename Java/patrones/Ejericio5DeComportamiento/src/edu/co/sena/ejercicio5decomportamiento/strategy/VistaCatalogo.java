/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class VistaCatalogo {
    
    protected  List<VistaVehiculo> contenido= new ArrayList<>();
    protected  DibujaCatalogo dibujo;

    public VistaCatalogo(DibujaCatalogo dibujo) {
       
        contenido.add(new VistaVehiculo("vehiculo economico"));
        contenido.add(new VistaVehiculo("vehiculo amplio"));
        contenido.add(new VistaVehiculo("vehiculo rapido"));       
        contenido.add(new VistaVehiculo("vehiculo confortable"));
        contenido.add(new VistaVehiculo("vehiculo deprotivo"));
        
        this.dibujo = dibujo;
    }
    
    public  void dibuja(){
    
    dibujo.dibuja(contenido);
    }
}
