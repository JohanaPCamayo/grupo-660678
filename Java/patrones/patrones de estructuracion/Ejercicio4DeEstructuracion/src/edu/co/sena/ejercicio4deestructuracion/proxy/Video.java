/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.proxy;

/**
 *
 * @author maicolsteven
 */
public class Video implements Animacion {

    @Override
    public void dibuja() {

        System.out.println("Mostrar el video");
    }

    @Override
    public void clic() {
    }

    public void carga() {

        System.out.println("Cargar el video");
    }

    public void reproduce() {

        System.out.println("Reproducir el video");
    }
}
