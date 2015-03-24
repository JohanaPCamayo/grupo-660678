/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.prototype;

import java.util.ArrayList;

/**
 *
 * @author ColsutecR
 */
public class DocumentacionEnBlanco extends Documentacion{
    
    private static DocumentacionEnBlanco _instance = null;
    
    private DocumentacionEnBlanco(){
    
    documentos = new ArrayList<>();
    }
    
    public static DocumentacionEnBlanco instance(){
    
        if(_instance == null)
            _instance = new DocumentacionEnBlanco();
        return _instance;
    }
    
    public  void incluye (Documento doc){
    
    documentos.add(doc);
    }
    
    public  void excluye (Documento doc){
    
    documentos.remove(doc);
    }
}
