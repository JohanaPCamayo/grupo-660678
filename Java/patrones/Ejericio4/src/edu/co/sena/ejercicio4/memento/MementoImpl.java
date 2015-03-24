/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.memento;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.*;
/**
 *
 * @author admin
 */
public class MementoImpl implements Memento{
 
    protected List<OpcionVehiculo> opciones = new ArrayList<>();
    
    public void setEstado(List<OpcionVehiculo> opciones){
    
        this.opciones.clear();
        this.opciones.addAll(opciones);
        
    }

    public List<OpcionVehiculo> getEstado() {
        return opciones;
    }
    
}
