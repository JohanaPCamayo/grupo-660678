/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.abstractfactory;

import edu.co.sena.ejercicio2.abstractfactory.modelo.AutomovilDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.AutomovilElectricidadDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.ScooterDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.ScooterElectricidadDto;

/**
 *
 * @author ColsutecR
 */
public class FabricaVehiculoElectricidad implements FabricaVehiculo{

    @Override
    public AutomovilDto creaAutomovil() {

    
    return new AutomovilElectricidadDto();
    }

    @Override
    public ScooterDto creaScooter() {

    return new ScooterElectricidadDto();
    }
    
}
