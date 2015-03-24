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
@Table(name = "Arbol", schema = "ej3")
@XmlRootElement

public class Arbol implements Serializable{
    
    @Id
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "tamano")
    private String tamano;
    
    @Column(name = "diametro")
    private String diametro;   
        
    @Column(name = "color")
    private String color;
    
    @Column(name = "cantidaHojas")
    private String cantidadHojas;

    public Arbol() {
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(String cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
    
    
}
