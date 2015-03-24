/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "computador",schema = "ej2")
@XmlRootElement

public class Computador implements Serializable{

    @Id
    @Column(name = "marcaDeTorre")
    private String marcaTorre;
    
    @Column(name = "marcaDeLaPantalla ")
    private String marcaPantalla;
    
    @Column(name = "marcaDelTeclado")
    private String marcaTeclado;
    
    @Column(name = "marcaMouse")
    private String marcaMouse;
    
    @Column(name = "marcaImpresora")
    private String marcaImpresora;
    
    

    public Computador() {
    }

    public String getMarcaPantalla() {
        return marcaPantalla;
    }

    public void setMarcaPantalla(String marcaPantalla) {
        this.marcaPantalla = marcaPantalla;
    }

    public String getMarcaTeclado() {
        return marcaTeclado;
    }

    public void setMarcaTeclado(String marcaTeclado) {
        this.marcaTeclado = marcaTeclado;
    }

    public String getMarcaMouse() {
        return marcaMouse;
    }

    public void setMarcaMouse(String marcaMouse) {
        this.marcaMouse = marcaMouse;
    }

    public String getMarcaImpresora() {
        return marcaImpresora;
    }

    public void setMarcaImpresora(String marcaImpresora) {
        this.marcaImpresora = marcaImpresora;
    }

    public String getMarcaTorre() {
        return marcaTorre;
    }

    public void setMarcaTorre(String marcaTorre) {
        this.marcaTorre = marcaTorre;
    }
    
    
    
}
