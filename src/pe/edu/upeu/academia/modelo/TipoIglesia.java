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
public class TipoIglesia {
    private int idti;
    private String nom_tipo;

    public TipoIglesia(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public TipoIglesia() {
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }
    
}
