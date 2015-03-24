/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.singleton;

/**
 *
 * @author ColsutecR
 */
public class TestComercial {
    
    public static void main(String[] args) {
        
        Comercial elComercial = Comercial.Instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comeriales.com");
        
        visualiza();
    }
    public static void visualiza(){
    
        Comercial elComercial = Comercial.Instance();
        elComercial.visualiza();
    }
}
