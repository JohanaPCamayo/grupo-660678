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
public class ScooterElectricidadDto extends ScooterDto{
    
    private  String voltaje;
    private  String amperaje;

    public ScooterElectricidadDto() {
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(String amperaje) {
        this.amperaje = amperaje;
    }
    
    @Override
    public String toString() {
        return "ScooterElecricidadDto{" + " voltaje: " + voltaje
                + ", amperaje: " + amperaje
                + ", placa: " + this.getPlaca()
                + ", modelo: " + this.getModelo()
                + ", color: " + this.getColor()
                + ", pasajero: " + this.getPasajero() + '}';
    }
}
