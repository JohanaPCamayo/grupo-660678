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
public class OperadorY extends OperadorBinario{

    public OperadorY(Expresion operadoIzquierdo, Expresion operadorDeracha) {
        super(operadoIzquierdo, operadorDeracha);
    }

    @Override
    public boolean evaluacion(String descripcion) {

    return operadoIzquierdo.evaluacion(descripcion) && operadorDeracha.evaluacion(descripcion);
    }
    
    public static Expresion parsea() throws Exception{
    
    Expresion resultadoIzquierdo, resultadoDerecha;
    resultadoIzquierdo= Expresion.parsea();
        while ((pieza!=null)&&(pieza.equals("y"))) {            
            siguientePiesa();
            resultadoDerecha= Expresion.parsea();
            resultadoIzquierdo= new OperadorY(resultadoIzquierdo, resultadoDerecha);
        }
        return resultadoIzquierdo;
    }
    
}
