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
public class EmpresaSinFilial extends Empresa {

    public EmpresaSinFilial(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    @Override
    public boolean agregaFilial(Empresa filial) {

        return false;
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {

        visitante.visita(this);
    }

}
