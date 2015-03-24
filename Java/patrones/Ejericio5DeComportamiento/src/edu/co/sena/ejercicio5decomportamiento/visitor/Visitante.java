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
public interface Visitante {
     public void visita(EmpresaSinFilial empresa);
     public void visita(EmpresaMadre empresa);
}
