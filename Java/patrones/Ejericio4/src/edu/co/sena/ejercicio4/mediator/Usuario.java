/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.mediator;

/**
 *
 * @author ColsutecR
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Formulario form = new Formulario();
        form.agregaControl(new ZonaInformacion("Nombre "));
        form.agregaControl(new ZonaInformacion("Apellido "));
        PopupMenu menu = new PopupMenu("coprestatario");
        menu.agregaOpcion("sin coprestatario ");
        menu.agregaOpcion("sin coprestatario ");
        form.agregaControl(menu);
        form.setMenuCoprestatario(menu);
        Boton bot = new Boton("OK");
        form.agregaControl(bot);
        form.setBotonOK(bot);
        form.agregaControlCoprestatario(new ZonaInformacion("Nombre del coprestatario "));
        form.agregaControlCoprestatario(new ZonaInformacion("Apellido del coprestatario"));
        form.informa();
        
    }
    
}
