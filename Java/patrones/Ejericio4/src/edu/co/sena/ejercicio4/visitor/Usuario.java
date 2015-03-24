/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.visitor;

/**
 *
 * @author admin
 */
public class Usuario {

    public static void main(String[] args) {

        Empresa empre = new EmpresaSinFilial("empresa1", "info@empresa1.com", "calle de la empresa 1");
        Empresa empre2 = new EmpresaSinFilial("empresa2", "info@empresa2.com", "calle de la empresa 2");
        Empresa grup = new EmpresaMadre("grupo 1 ", "info@grupo1.com", "calle del grupo 1");
        grup.agregaFilia(empre);
        grup.agregaFilia(empre2);

        Empresa empre3 = new EmpresaSinFilial("empresa3", "info@empresa3.com", "calle de la empresa 3");
        Empresa grup2 = new EmpresaMadre("grupo2", "info@grupo2.com", "calle del grupo 2");
        grup2.agregaFilia(empre);
        grup2.aceptaVisitante(new VisitanteMailingComercial());
    }

}
