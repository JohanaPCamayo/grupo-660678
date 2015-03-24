/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class EmpresaMadre extends Empresa{

    protected  List<Empresa>filiales=new ArrayList<>();
    
    @Override
    public double calculaCosteMantenimiento() {

        double coste=0.0;
        for (Empresa filial : filiales) {
            coste=coste+filial.calculaCosteMantenimiento();           
        }
        return coste+nVehiculos*costeUnitarioVehiculo;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {

    return filiales.add(filial);
    }
    
    
}
