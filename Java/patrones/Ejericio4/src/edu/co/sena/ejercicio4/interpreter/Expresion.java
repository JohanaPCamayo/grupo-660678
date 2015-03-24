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
public abstract class Expresion {

    public abstract boolean evaluacion(String descripcion);

    protected static String fuente;
    protected static int indice;
    protected static String pieza;

    public static void siguientePiesa() {

        while ((indice < fuente.length()) && (fuente.charAt(indice) == ')')) 

            indice++;
            if (indice == fuente.length()) {
                pieza = null;

            } else if ((fuente.charAt(indice) == '(') || (fuente.charAt(indice) == ')')) {

                pieza = fuente.substring(indice, indice + 1);
                indice++;
            } else {
                int inicio = indice;
                while ((indice < fuente.length()) && (fuente.charAt(indice) != ' ') && (fuente.charAt(indice) != ')')) {
                    indice++;
                    pieza = fuente.substring(inicio, indice);
                }
            }

        
    }

    public static Expresion analiza(String fuente) throws Exception {

        Expresion.fuente = fuente;
        indice = 0;
        siguientePiesa();
        return OperadorO.parsea();
    }

    public static Expresion parsea() throws Exception {

        Expresion resultado;
        if (pieza.equals("(")) {
            siguientePiesa();
            resultado = OperadorO.parsea();
            if (pieza == null) {
                throw new Exception("Error de sintaxis");
            }
            if (!pieza.equals(")")) {
                throw new Exception("Error de sintaxis");
            }
            siguientePiesa();
        } else {
            resultado = PalabraClave.parsea();
        }
        return resultado;

    }
}
