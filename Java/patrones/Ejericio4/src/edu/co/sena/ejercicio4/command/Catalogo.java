/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.command;

import java.util.*;

/**
 *
 * @author admin
 */
public class Catalogo {

    protected List<Vehiculo> vehiculoEnStrock = new ArrayList<>();
    protected List<SolicitudRebaja> solicitudes = new ArrayList<>();

    public void ejecutaSolicitudRebaja(SolicitudRebaja solicitud) {

        solicitudes.add(0, solicitud);
        solicitud.rebaja(vehiculoEnStrock);
    }

    public void anulaSolicitudRebaja(int orden) {

        solicitudes.get(orden).anula();
    }

    public void restablecerSolicitudRebaja(int orden) {

        solicitudes.get(orden);
    }

    public void agreda(Vehiculo vehiculo) {

        vehiculoEnStrock.add(vehiculo);
    }

    public void visualiza() {

        for (Vehiculo vehiculo : vehiculoEnStrock) {
            vehiculo.visualizacion();
        }
    }
}
