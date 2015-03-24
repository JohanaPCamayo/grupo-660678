/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.composite;

/**
 *
 * @author maicolsteven
 */
public class EmpresaSinFilial extends Empresa{
    
    @Override
    public double calculaCosteMantenimiento() {

    return nVehiculos * costeUnitarioVehiculo;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {

    return false;
    }
    
    
}
