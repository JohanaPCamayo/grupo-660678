/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.iterator;

import java.util.List;

/**
 *
 * @author maicolsteven
 */
public abstract class Iterador<TElemento extends Elemento> {

    protected String palabraClaveConsulta;
    protected int indice;
    protected List<TElemento> contenido;

    public void setPalabraClaveConsulta(String palabraClaveConsulta, List<TElemento> contenido) {
        this.palabraClaveConsulta = palabraClaveConsulta;
        this.contenido = contenido;
    }

    public void inicio() {

        indice = 0;
        int tamano = contenido.size();
        while ((indice < tamano) && (!contenido.get(indice).palabraClaveValida(palabraClaveConsulta))) {
            indice++;
        }
    }

    public void siguiente() {

        int tamano = contenido.size();
        indice++;
        while ((indice < tamano) && (!contenido.get(indice).palabraClaveValida(palabraClaveConsulta))) {
            indice++;
        }
    }

    public TElemento item() {

        if (indice < contenido.size()) {
            return contenido.get(indice);
        } else {
            return null;
        }
    }

}
