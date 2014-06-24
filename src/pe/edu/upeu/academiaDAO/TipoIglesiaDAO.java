/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.academiaDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.academia.config.Conexion;
import pe.edu.upeu.academia.modelo.Distrito;
import pe.edu.upeu.academia.modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    
    private ArrayList <TipoIglesia> lista = new ArrayList();
    Distrito d= new Distrito();
    private String sql;
    private Statement st;
    private Connection cx;
    private ResultSet rs;
    
    public ArrayList <TipoIglesia> listarTipoIglesia()
    {
        sql= "SELECT *FROM distrito";
        try
        {
     cx = Conexion.getConexion();
      st = cx.createStatement();
      rs = st.executeQuery(sql);
      while(rs.next())
      {
          lista.add(TipoIglesia.loadTipoIglesia(rs));
      }
        }
        catch(SQLException e)
                {
                    
                }
        return lista;
    }
}
