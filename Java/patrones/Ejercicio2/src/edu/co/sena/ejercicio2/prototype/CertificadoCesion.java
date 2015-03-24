/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.prototype;

/**
 *
 * @author ColsutecR
 */
public class CertificadoCesion  extends Documento{

    @Override
    public void imprime() {
        System.out.println("muestra el certificado de cesion : " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("imprime el certificado de cesion : " + contenido);
    }
    
}
