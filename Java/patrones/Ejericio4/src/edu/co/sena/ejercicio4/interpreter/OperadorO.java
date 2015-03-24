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
public class OperadorO extends OperadorBinario{

    public OperadorO(Expresion operadoIzquierdo, Expresion operadorDeracha) {
        super(operadoIzquierdo, operadorDeracha);
    }

    @Override
    public boolean evaluacion(String descripcion) {
        return operadoIzquierdo.evaluacion(descripcion) || operadorDeracha.evaluacion(descripcion);
    }
    
    public static Expresion parsea() throws Exception{
    
      Expresion resultadoIzquierdo, resultadoDerecha;
      resultadoIzquierdo = OperadorY.parsea();
        while ((pieza !=null) && (pieza.equals("o"))) {            
            siguientePiesa();
            resultadoDerecha=OperadorY.parsea();
            resultadoDerecha = new OperadorO(resultadoIzquierdo, resultadoDerecha);
            
        }
        return  resultadoIzquierdo;
    }
}
