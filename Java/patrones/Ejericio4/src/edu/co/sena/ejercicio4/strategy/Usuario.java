/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.strategy;

/**
 *
 * @author admin
 */
public class Usuario {

    public static void main(String[] args) {

        VistaCatalogo vistaCat = new VistaCatalogo(new DibujaTresVehiculosPorLinea());
        vistaCat.dibuja();
        VistaCatalogo vistaCata2 = new VistaCatalogo(new DibujaUnVehculoPorLinea());
        vistaCata2.dibuja();

    }
}
