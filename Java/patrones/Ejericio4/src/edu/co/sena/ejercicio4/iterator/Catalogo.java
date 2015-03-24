/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.co.sena.ejercicio4.iterator;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public abstract class Catalogo <TElemento extends Elemento, TIterador extends Iterador<TElemento>> {
    
    protected List<TElemento> contenido = new ArrayList<>();
    
    
    public abstract TIterador creaIterador();
    
    public TIterador busqueda(String palabraCalveConsulta){
    
        TIterador resultado = creaIterador();
        resultado.setPalabraCalveConsulta(palabraCalveConsulta, contenido);
        return resultado;
    }
    
}
