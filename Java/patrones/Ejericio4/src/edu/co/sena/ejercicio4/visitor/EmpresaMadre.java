/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.visitor;
import java.util.*;
/**
 *
 * @author admin
 */
public class EmpresaMadre extends Empresa{

    protected List<Empresa> filiale = new ArrayList<>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }
    
    @Override
    public boolean agregaFilia(Empresa filial) {
       return filiale.add(filial);
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial : filiale){
            filial.aceptaVisitante(visitante);
            
        }
    }
    
}
