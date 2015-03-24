/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.builder;

import java.util.Scanner;

/**
 *
 * @author maicolsteven
 */
public class ClienteVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.println("Desea generar " + "documentacion HTML (1) o PDF (2):");
        String seleccion= reader.next();
        if (seleccion.equals("1")) {
            constructor= new ContructorDocumentacionVehiculoHTML();
        } else {
          constructor =new  ConstructorDocumentacionVehiculoPdf();
        }
        
        Vendedor vendedor= new Vendedor(constructor);
        Documentacion documentacion= vendedor.construye("Martin");
        documentacion.imprime();
    }
    
}
