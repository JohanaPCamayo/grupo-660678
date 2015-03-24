/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ColsutecR
 */
public class PopupMenu extends Control {

    protected List<String> opciones = new ArrayList<>();

    protected Scanner reader = new Scanner(System.in);

    public PopupMenu(String nombre) {
        super(nombre);
    }

    @Override
    public void informa() {
        System.out.println("Informacion de : " + nombre);
        System.out.println("Valor actual : " + getValor());
        for (int indice = 0; indice < opciones.size(); indice++) {
            System.out.println("- " + indice + " )" + opciones.get(indice));
        }
        int eleccion = reader.nextInt();
        if ((eleccion >= 0) && (eleccion < opciones.size())) {

            boolean cambia = !(getValor().equals(opciones.get(eleccion)));

            if (cambia) {
                setValor(opciones.get(eleccion));
                this.modifica();
            }
        }
    }

    public void agregaOpcion(String opcion) {

        opciones.add(opcion);
    }
}
