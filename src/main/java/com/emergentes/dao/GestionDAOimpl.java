
package com.emergentes.dao;

import com.emergentes.modelo.Gestion;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSBER
 */
public class GestionDAOimpl extends ConexionDB implements GestionDAO{

    @Override
    public void insert(Gestion gestion) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO gestiones (nombre) VALUES (?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, gestion.getNombre());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Gestion gestion) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE gestiones SET nombre=? WHERE id_gestion = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, gestion.getNombre());
            ps.setInt(2, gestion.getId_gestion());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }

    }

    @Override
    public void delete(int id) throws Exception {
        try{
            this.conectar();
            String sql = "DELETE FROM gestiones WHERE id_gestion = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public Gestion getById(int id) throws Exception {
        Gestion ges = new Gestion();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM gestiones WHERE id_gestion = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                ges.setId_gestion(rs.getInt("id_gestion"));
                ges.setNombre(rs.getString("nombre"));                
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return ges;
    }

    @Override
    public List<Gestion> getAll() throws Exception {
        List<Gestion> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM gestiones";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Gestion>();
            while (rs.next()) {
                Gestion ges = new Gestion();
                ges.setId_gestion(rs.getInt("id_gestion"));
                ges.setNombre(rs.getString("nombre"));                
                lista.add(ges);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
