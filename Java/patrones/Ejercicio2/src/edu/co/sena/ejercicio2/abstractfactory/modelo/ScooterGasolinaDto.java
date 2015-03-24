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
public class ScooterGasolinaDto extends ScooterDto{
 
    private String capacidadTanque;

    public ScooterGasolinaDto() {
    }

    public String getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(String capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
    
    @Override
    public String toString() {
        return "ScooterGasolinaDto{" + " capacidad tanque : " + capacidadTanque
                + ", placa: " + this.getPlaca()
                + ", modelo: " + this.getModelo()
                + ", color: " + this.getColor()
                + ", pasajero: " + this.getPasajero() + '}';
    }
    
    
}
