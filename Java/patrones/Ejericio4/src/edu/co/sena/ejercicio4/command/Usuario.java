/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.command;

/**
 *
 * @author admin
 */
public class Usuario {

    public static void main(String[] args) {

        Vehiculo vehi1 = new Vehiculo("AO1", 1, 1000.0);
        Vehiculo vehi2 = new Vehiculo("All", 6, 2000.0);
        Vehiculo vehi3 = new Vehiculo("Zo3", 2, 3000.0);

        Catalogo cat = new Catalogo();
        cat.agreda(vehi1);
        cat.agreda(vehi2);
        cat.agreda(vehi3);

        System.out.println("Visualizacion inicial del catalogo :");
        cat.visualiza();
        System.out.println();
        SolicitudRebaja solRebaja = new SolicitudRebaja(10, 5, 0.1);
        cat.ejecutaSolicitudRebaja(solRebaja);

        System.out.println("Visualizacion del catalogo tras " + "ejercutar la primera solicitud");
        cat.visualiza();
        System.out.println();
        SolicitudRebaja solRebaja2 = new SolicitudRebaja(10, 5, 0.5);
        cat.ejecutaSolicitudRebaja(solRebaja2);
        System.out.println("Visualizacion del catalogo tras " + "ejecutar la segunda solicitud ");
        cat.visualiza();
        System.out.println();
        
        cat.anulaSolicitudRebaja(1);
        System.out.println("Visualizacion del catalogo tras " + "anular la primera solicitud");
        cat.visualiza();
        System.out.println();
        cat.restablecerSolicitudRebaja(1);
        System.out.println("visualizacion del catalogo tras " + "restablecer la primera solicitud");
        cat.visualiza();
        System.out.println();
    }
}
