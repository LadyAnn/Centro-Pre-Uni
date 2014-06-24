/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.academia.modelo;

/**
 *
 * @author alum.fial7
 */
public class distrito {
    private int idd;
    private int idc;
    private int disc;
    private int estado;

    public distrito() {
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public distrito(int idc, int disc, int estado) {
        this.idc = idc;
        this.disc = disc;
        this.estado = estado;
    }
    
}
