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
public class VistaVehiculo implements Observador{

    protected Vehiculo vehiculo;
    protected String texto = "";

    public VistaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        vehiculo.agrega(this);
        actualizaTexto();
    }
    
    protected void actualizaTexto(){
    
        texto = "Descripcion " + vehiculo.descripcion + "precio : " + vehiculo.precio;
    }
    
    @Override
    public void actualiza() {
        actualizaTexto();
        this.reDibuja();
    }
    
   public void reDibuja(){
   
       System.out.println(texto); 
   }
}
