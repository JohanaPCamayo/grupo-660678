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
public class ScooterDto {
    
    private String placa;
    private String modelo;
    private String color;
    private String pasajero;

    public ScooterDto() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "ScooterDto{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", pasajero=" + pasajero + '}';
    }
    
    
}
