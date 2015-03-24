/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.abstractfactory;

import edu.co.sena.ejercicio2.abstractfactory.modelo.AutomovilDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.ScooterDto;
/**
 *
 * @author ColsutecR
 */
public interface FabricaVehiculo {
    
    public AutomovilDto creaAutomovil();
    public ScooterDto creaScooter();
    
}
