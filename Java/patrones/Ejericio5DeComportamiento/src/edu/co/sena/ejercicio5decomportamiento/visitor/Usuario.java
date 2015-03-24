/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.visitor;

/**
 *
 * @author maicolsteven
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa empresa1 = new EmpresaSinFilial("empresa1", "info@empresa1.com", "calle de la empresa 1");
        Empresa empresa2 = new EmpresaSinFilial("empresa2", "info@empresa2.com", "calle de la empresa 2");
        Empresa grupo1 = new EmpresaMadre("grupo1", "info@grupo1.com", "calle del grupo 1");
        grupo1.agregaFilial(empresa1);
        grupo1.agregaFilial(empresa2);
        Empresa empresa3 = new EmpresaSinFilial("empresa3", "info@empresa3.com", "calle de la empresa 3");
        Empresa grupo2 = new EmpresaMadre("grupo2", "info@grupo2.com", "calle del grupo 2");
        grupo2.agregaFilial(grupo1);
        grupo2.agregaFilial(empresa3);
        grupo2.aceptaVisitante(new VisitanteMailingComercial());
    }
    
}
