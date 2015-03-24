/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.strategy;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    VistaCatalogo vistaCatalogo1= new VistaCatalogo(new DibujaTresVehiculosPorLinea());
    vistaCatalogo1.dibuja();
    VistaCatalogo vistaCatalogo2= new VistaCatalogo(new DibujaUnVehiculoPorLinea());
    vistaCatalogo2.dibuja();
    }
    
}
