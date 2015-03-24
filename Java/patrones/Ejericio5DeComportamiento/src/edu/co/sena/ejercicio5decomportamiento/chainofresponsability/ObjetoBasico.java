/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.chainofresponsability;

/**
 *
 * @author colsutec18
 */
public abstract class ObjetoBasico {

    protected ObjetoBasico siguiente;

    private String descripcionPordefecto() {

        return "descripcion por defecto";
    }

    protected abstract String getDescripcion();

    public String devuelveDescripcion() {

        String resultado;
        resultado = this.getDescripcion();
        if (resultado != null) {
            return resultado;

        }

        if (siguiente != null) {
            return siguiente.devuelveDescripcion();
        } else {
            return this.descripcionPordefecto();
        }
    }

    public void setSiguiente(ObjetoBasico siguiente) {

        this.siguiente = siguiente;
    }
}
