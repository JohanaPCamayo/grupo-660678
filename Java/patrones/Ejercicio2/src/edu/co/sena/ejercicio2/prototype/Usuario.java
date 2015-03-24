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
public class Usuario {
    
    public static void main(String[] args) {
        
        DocumentacionEnBlanco documentacionEnBlanco= DocumentacionEnBlanco.instance();
        
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        
        DocumentacionCliente documentacionCliente1= new DocumentacionCliente(" Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
        
        
    }
}
