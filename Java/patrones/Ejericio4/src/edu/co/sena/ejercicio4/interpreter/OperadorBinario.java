/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.interpreter;

/**
 *
 * @author admin
 */
public abstract class OperadorBinario extends Expresion{
    
    protected Expresion operadoIzquierdo, operadorDeracha;

    public OperadorBinario(Expresion operadoIzquierdo, Expresion operadorDeracha) {
        this.operadoIzquierdo = operadoIzquierdo;
        this.operadorDeracha = operadorDeracha;
    }
    
    
}
