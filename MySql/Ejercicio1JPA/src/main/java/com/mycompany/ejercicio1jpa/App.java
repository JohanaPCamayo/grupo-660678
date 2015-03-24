/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ColsutecR
 */
public class App {

    public static void main(String[] args) {

        EntityManagerFactory emfabrica1 = Persistence.createEntityManagerFactory("com.mycompany.ejercicio1jpa1");

        EntityManager em1 = emfabrica1.createEntityManager();

        Carro ca = new Carro();
        ca.setPlaca("mcr201");
        ca.setColor("Negro");
        ca.setMarca("hyundai");
        ca.setModelo("2000");
        ca.setAsientos("2");

        em1.getTransaction().begin();
        em1.persist(ca);
        em1.getTransaction().commit();

        em1.close();
       
        
        System.out.println("----------------------------------");
       
        EntityManager em2 = emfabrica1.createEntityManager();

        Computador co = new Computador();
        co.setMarcaTorre("php201");
        co.setMarcaPantalla("tgfvgvbft");
        co.setMarcaTeclado("djfkdjf");
        co.setMarcaMouse("454df");
        co.setMarcaImpresora("LG");
               

        em2.getTransaction().begin();
        em2.persist(co);
        em2.getTransaction().commit();

        em2.close();
       
        System.out.println("-----------------------------------------");
        
     
        EntityManager em3 = emfabrica1.createEntityManager();

        Arbol ar = new Arbol();
        ar.setTipo("Pino");
        ar.setTamano("50m");
        ar.setDiametro("45");
        ar.setColor("naranja");
        ar.setCantidadHojas("421454");
               

        em3.getTransaction().begin();
        em3.persist(ar);
        em3.getTransaction().commit();

        em3.close();
        emfabrica1.close();
        
        
    }
}
