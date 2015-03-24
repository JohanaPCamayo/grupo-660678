/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Factura {
     private int idFactura;
    private Date fecha;
    private double total;
    private String cuenta_tipoDocumento;
    private String cuenta_numeroDocumento;

   

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCuenta_tipoDocumento() {
        return cuenta_tipoDocumento;
    }

    public void setCuenta_tipoDocumento(String cuenta_tipoDocumento) {
        this.cuenta_tipoDocumento = cuenta_tipoDocumento;
    }

    public String getCuenta_numeroDocumento() {
        return cuenta_numeroDocumento;
    }

    public void setCuenta_numeroDocumento(String cuenta_numeroDocumento) {
        this.cuenta_numeroDocumento = cuenta_numeroDocumento;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", fecha=" + fecha + ", total=" + total + ", cuenta_tipoDocumento=" + cuenta_tipoDocumento + ", cuenta_numeroDocumento=" + cuenta_numeroDocumento + '}';
    }

}
