/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.builder;

/**
 *
 * @author maicolsteven
 */
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoPdf(){
    
        documentacion= new DocumentacionPDF();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {

    String documento;
        documento="<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {

    String documento;
    documento="<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</PDF>";
    documentacion.agregaDocumento(documento);
    }
    
    
}
