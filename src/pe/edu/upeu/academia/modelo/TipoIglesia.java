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
public class TipoIglesia {

    public static TipoIglesia loadTipoIglesia(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
    public static TipoIglesia loadTipo_Iglesia(ResultSet rs) throws SQLException
    {
        TipoIglesia i= new TipoIglesia();//establecer id Distrito ----- establese
        i.setIdti(rs.getInt("idtipo_iglesia"));
        i.setIdti(rs.getInt("tipo_iglesia"));
        
        return i;
    } 
}
