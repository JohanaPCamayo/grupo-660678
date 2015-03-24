/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.abstractfactory;
import edu.co.sena.ejercicio2.abstractfactory.modelo.AutomovilElectricidadDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.AutomovilGasolinaDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.ScooterElectricidadDto;
import edu.co.sena.ejercicio2.abstractfactory.modelo.ScooterGasolinaDto;
/**
 *
 * @author ColsutecR
 */
public class App {
    
    public static void main(String[] args) {
        
        FabricaVehiculo fabrica=new FabricaVehiculoElectricidad();
        AutomovilElectricidadDto auto1= (AutomovilElectricidadDto) fabrica.creaAutomovil();
        auto1.setAmperaje("12.3");
        auto1.setVoltaje("10.3");
        auto1.setColor("Verde");
        auto1.setModelo("2015");
        auto1.setPlaca("MCR022");
        auto1.setPasajero("4");
        System.out.println(auto1.toString());
        
        ScooterElectricidadDto moto1=(ScooterElectricidadDto) fabrica.creaScooter();
        moto1.setAmperaje("10.1");
        moto1.setVoltaje("14.7");
        moto1.setColor("rosada");
        moto1.setModelo("89");
        moto1.setPlaca("J89DO");
        moto1.setPasajero("1");
        System.out.println(moto1.toString());
        
        FabricaVehiculo fabrica2=new FabricaVehiculoGasolina();
        AutomovilGasolinaDto auto2=(AutomovilGasolinaDto) fabrica2.creaAutomovil();
        auto2.setCapacidadTanque("15.0");
        auto2.setColor("negro");
        auto2.setModelo("98");
        auto2.setPlaca("ghy565");
        auto2.setPasajero("3");
        System.out.println(auto2.toString());
        
        ScooterGasolinaDto mot = (ScooterGasolinaDto) fabrica2.creaScooter();
        mot.setCapacidadTanque("29.9");
        mot.setColor("moradp");
        mot.setModelo("90");
        mot.setPlaca("yt564hj");
        mot.setPasajero("2");
        System.out.println(mot.toString());
        
               
    }
    
}
