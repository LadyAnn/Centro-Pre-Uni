/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.academia.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alum.fial7
 */
public class Distrito {

    public static Distrito loadDistrito(String rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int idd;
    private int idc;
    private String disc;
    private String estado;

    public Distrito() {
    }

    public Distrito(int idc, String disc, String estado) {
        this.idc = idc;
        this.disc = disc;
        this.estado = estado;
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

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public static Distrito loadDistrito(ResultSet rs) throws SQLException
    {
        Distrito d= new Distrito();//establecer id Distrito ----- establese
        d.setIdd(rs.getInt("iddistrito"));
        d.setIdc(rs.getInt("idregion"));
        d.setDisc(rs.getString("distrito"));
        d.setEstado(rs.getString("estado"));
        return d;
    }
    
}
