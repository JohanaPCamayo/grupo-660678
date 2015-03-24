/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.interpreter;

/**
 *
 * @author maicolsteven
 */
public class PalabraClave extends Expresion {

    protected String palabraclave;

    public PalabraClave(String palabralave) {
        this.palabraclave = palabralave;
    }

   public  boolean evalua(String descripcion){
   
   return  descripcion.indexOf(palabraclave) != -1;
   }

    
public static Expresion parsea() throws Exception {

        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
    

}
