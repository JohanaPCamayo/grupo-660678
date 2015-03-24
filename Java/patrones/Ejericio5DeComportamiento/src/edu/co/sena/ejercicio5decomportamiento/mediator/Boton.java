/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.mediator;

import java.util.Scanner;

/**
 *
 * @author ColsutecR
 */
public class Boton extends Control{
    
    Scanner reader= new Scanner(System.in);

    public Boton(String nombre) {
        super(nombre);
    }

    @Override
    public void informa() {

        System.out.println("¿Desea activar el boton " + nombre + " ?");
        String respuesta= reader.nextLine();
        if (respuesta.equals("si")) {
            this.modifica();
        }
    }
    
    
}
