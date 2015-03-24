/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioGenerico2;
import java.util.*;
/**
 *
 * @author ColsutecR
 */
public class App {
    public static void main(String[] args) {
        
        
//                
//        Persona<String, String, String, String> p1 = new Persona<>();
//        
//        p1.setPrimerApellido("Camayo");
//        p1.setSegundoApellido("Camayo");
//        p1.setPrimerNombre("Johana");
//        p1.setSegundoNombre("Paola");
//        System.out.println(p1.toString());
       

        List<Integer> partList = new ArrayList<>(3);
        partList.add(1);
        partList.add(2);
        partList.add(3);

        for (Integer partList1 : partList) {
            System.out.println();
        }
        
        Deque<Integer> datos = new ArrayDeque<>(6);
        
        datos.add(1);
        datos.add(2);
        datos.add(3);
        datos.add(4);
        datos.add(5);
        datos.add(6);
        
        for (Integer dato : datos) {
            System.out.println();
        }
        
        Queue<Integer> datos2 = new ArrayDeque<>();
        datos2.add(1);
        datos2.add(2);
        datos2.add(3);
        datos2.add(4);
        datos2.add(5);
        datos2.add(6);
        
        for (Integer datos21 : datos2) {
            System.out.println();
        }
    }
    
}
