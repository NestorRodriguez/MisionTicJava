/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

import java.util.Date;

/**
 *
 * @author aiya
 */
public abstract class Producto {
    private int numeroLote;
    private Date fechaCaducicdad;

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Date getFechaCaducicdad() {
        return fechaCaducicdad;
    }

    public void setFechaCaducicdad(Date fechaCaducicdad) {
        this.fechaCaducicdad = fechaCaducicdad;
    }
    
    public abstract void PreparacionAmbiente();
}
