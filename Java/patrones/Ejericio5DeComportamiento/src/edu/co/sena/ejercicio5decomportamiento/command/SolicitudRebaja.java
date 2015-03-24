/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.command;

import java.util.*;

/**
 *
 * @author maicolsteven
 */
public class SolicitudRebaja {
    
    protected List<Vehiculo> vehiculoEnStock = new ArrayList<>();
    protected long hoy;
    protected long tiempoEnStock;
    protected double tasaDescuento;
    
    public SolicitudRebaja(long hoy, long tiempoEnStock, double tasaDescuento) {
        this.hoy = hoy;
        this.tiempoEnStock = tiempoEnStock;
        this.tasaDescuento = tasaDescuento;
    }
    
    public void rebaja(List<Vehiculo> vehiculos) {
        
        vehiculoEnStock.clear();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTiempoEnStock(hoy) >= tiempoEnStock) {
                vehiculoEnStock.add(vehiculo);
            }
        }
        
        for (Vehiculo vehiculo : vehiculoEnStock) {
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
        }
    }
    
    public void anula() {
        
        for (Vehiculo vehiculo : vehiculoEnStock) {
            vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
        }
    }
    
    public void restablece() {
        
        for (Vehiculo vehiculo : vehiculoEnStock) {
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
        }
    }
    
}
