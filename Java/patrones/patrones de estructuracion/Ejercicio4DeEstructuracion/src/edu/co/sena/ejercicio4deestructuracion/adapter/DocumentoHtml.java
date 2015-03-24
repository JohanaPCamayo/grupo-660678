/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4deestructuracion.adapter;

/**
 *
 * @author ColsutecR
 */
public class DocumentoHtml implements Documento{

    protected String contenido;
    
    @Override
    public void setContenido(String contenido) {

           this.contenido = contenido;
    }

    @Override
    public void dibuja() {

        System.out.println("Dibuja el documento HTML: " + contenido);
    }

    @Override
    public void imprime() {

        System.out.println("Imprime el documento HTML: " + contenido);
    }
    
}
