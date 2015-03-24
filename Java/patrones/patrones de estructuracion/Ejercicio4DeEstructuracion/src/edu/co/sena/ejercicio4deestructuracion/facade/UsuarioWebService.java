/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.facade;

import java.util.List;

/**
 *
 * @author maicolsteven
 */
public class UsuarioWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));
        List<String> resultados = webServiceAuto.buscaVehiculos(6000, 1000);
        if (resultados.size() > 0) {
            System.out.println("Vehiculo(s) cuyo precio esta comprendido " + "entre 5000 y 7000");

            for (String resultado : resultados) {
                System.out.println("  " + resultado);
            }
        }
    }

}
