/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.co.sena.ejercicio4.iterator;

/**
 *
 * @author colsutec18
 */
public abstract class Elemento {
    
    protected String descripcion;

    public Elemento(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean  palabraClaveValida(String palabraClave){
    
        return  descripcion.indexOf(palabraClave) !=-1;
    }
}
