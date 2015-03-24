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
public class DocumentoPdf implements Documento{

    protected ComponentePdf herramientaPdf= new ComponentePdf();
    
    @Override
    public void setContenido(String contenido) {

    herramientaPdf.FijaContenido(contenido);
    }

    @Override
    public void dibuja() {

    herramientaPdf.pdfPreparaVisualizacion();
    herramientaPdf.pdfRefresca();
    herramientaPdf.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprime() {

        herramientaPdf.pdfEnviaImpresora();
    }
    
}
