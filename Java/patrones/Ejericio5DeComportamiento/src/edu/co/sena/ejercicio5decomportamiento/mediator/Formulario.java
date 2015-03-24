/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5decomportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class Formulario {

    protected List<Control> controles = new ArrayList<>();
    protected List<Control> controlesCoprestatario = new ArrayList<>();
    protected PopupMenu menuCoprestatario;
    Boton botonOK;
    protected boolean enCurso = true;

    public void agregaControl(Control control) {

        controles.add(control);
        control.setDirector(this);
    }

    public void agregaControlCoprestatario(Control control) {

        controlesCoprestatario.add(control);
        control.setDirector(this);
    }

    public void setMenuCoprestatario(PopupMenu menuCoprestatario) {

        this.menuCoprestatario = menuCoprestatario;
    }

    public void setBotonOK(Boton botonOK) {

        this.botonOK = botonOK;
    }

    public void controlModificado(Control control) {

        if (control == menuCoprestatario) {
            if (control.getValor().equals("con coprestatario")) {
                for (Control elementoCoprestatario: controlesCoprestatario) {
                    elementoCoprestatario.informa();
                }
            }
        }
        if (control == botonOK) {
            enCurso = false;
        }
    }

    public void informa() {

        while (true) {
            for (Control control : controles) {
                control.informa();
                if (!enCurso) {
                    return;
                }
            }
        }
    }
}
