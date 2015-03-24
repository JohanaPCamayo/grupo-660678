/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.chainofresponsability;

/**
 *
 * @author colsutec18
 */
public class Usuario {
    
    public static void main(String[] args) {
        
        ObjetoBasico vehiculo1= new Vehiculo("Auto++ KT500 Vehiculo de ocasion en buen estado");
        System.out.println(vehiculo1.devuelveDescripcion());
        ObjetoBasico modelo1= new Modelo("KT400", "Vehiculo amplio y confortable");
        ObjetoBasico vehiculo2= new Vehiculo(null);
        vehiculo2.setSiguiente(modelo1);
        System.out.println(vehiculo2.devuelveDescripcion());
        ObjetoBasico marca1= new Marca("Auto++", "Marca del automovil", "de gran clidad");
        ObjetoBasico modelo2 = new Modelo("KT700", null);
        modelo2.setSiguiente(marca1);
        ObjetoBasico vehiculo3 = new Vehiculo(null);
        vehiculo3.setSiguiente(modelo2);
        System.out.println(vehiculo3.devuelveDescripcion());
        ObjetoBasico vehiculo4 = new Vehiculo(null);
        System.out.println(vehiculo4.devuelveDescripcion());
    }
}
