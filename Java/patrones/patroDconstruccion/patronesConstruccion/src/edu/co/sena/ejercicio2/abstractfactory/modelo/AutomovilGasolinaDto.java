/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.abstractfactory.modelo;

/**
 *
 * @author ColsutecR
 */
public class AutomovilGasolinaDto extends AutomovilDto{
    
    private String capacidadTanque;

    public AutomovilGasolinaDto() {
    }

    public String getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(String capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
    
    @Override
    public String toString() {
        return "AutomovilGasolinaDto{" + " capacidad tanque: " + capacidadTanque
                + ", placa: " + this.getPlaca()
                + ", modelo: " + this.getModelo()
                + ", color: " + this.getColor()
                + ", pasajero: " + this.getPasajero() + '}';
    }
}
