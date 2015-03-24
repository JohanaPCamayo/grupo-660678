/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.facade;

/**
 *
 * @author maicolsteven
 */
public class ComponenteGestionDocumento implements GestionDocumento{

    @Override
    public String documento(int indice) {

    return "Documento numero " + indice;
    }
    
}
