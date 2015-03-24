/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioGenerico2;

/**
 *
 * @author ColsutecR
 */
public class Persona <TprimerNombre, TsegundoNombre, TprimerApellido, TsegundoApellido>{
    private TprimerNombre primerNombre;
    private TsegundoNombre segundoNombre;
    private TprimerApellido primerApellido;
    private TsegundoApellido segundoApellido;

    public TprimerNombre getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(TprimerNombre primerNombre) {
        this.primerNombre = primerNombre;
    }

    public TsegundoNombre getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(TsegundoNombre segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public TprimerApellido getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(TprimerApellido primerApellido) {
        this.primerApellido = primerApellido;
    }

    public TsegundoApellido getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(TsegundoApellido segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + '}';
    }
    
    
}
