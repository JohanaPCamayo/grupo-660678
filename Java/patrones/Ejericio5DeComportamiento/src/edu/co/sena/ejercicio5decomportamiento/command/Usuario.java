/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.command;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("A01", 1, 1000.0);
        Vehiculo vehiculo2 = new Vehiculo("A11", 6, 2000.0);
        Vehiculo vehiculo3 = new Vehiculo("Z03", 2, 3000.0);
        Catalogo catalogo = new Catalogo();
        catalogo.agrega(vehiculo1);
        catalogo.agrega(vehiculo2);
        catalogo.agrega(vehiculo3);
        System.out.println("Visualizacion inicial del catalogo");
        catalogo.visualiza();
        System.out.println();
        SolicitudRebaja solicitudRebaja = new SolicitudRebaja(10, 5, 0.1);
        catalogo.ejecutaSolicitusRebaja(solicitudRebaja);
        System.out.println("Visualizacion del catalogo tras " + "ejecutar la primera solicitud");
        catalogo.visualiza();
        System.out.println();
        SolicitudRebaja solicitudRebaja2 = new SolicitudRebaja(10, 5, 0.5);
        catalogo.ejecutaSolicitusRebaja(solicitudRebaja2);
        System.out.println("Visualizacionn del catalogo tras " + "ejecutar la seguna solicitud");
        catalogo.visualiza();
        System.out.println();
        catalogo.anulaSoolicitudRebaja(1);
        System.out.println("Visualizacion del catalogo tras " + "anular la primera solicitud");
        catalogo.visualiza();
        System.out.println();
        catalogo.restableceSolicitudRebaja(1);
        System.out.println("Visualiza del catalogo tras " + "restablecer la primera solicitud");
        catalogo.visualiza();
        System.out.println();

    }

}
