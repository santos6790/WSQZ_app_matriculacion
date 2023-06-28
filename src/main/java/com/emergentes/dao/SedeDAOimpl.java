package com.emergentes.dao;

import com.emergentes.modelo.Categoria;
import com.emergentes.modelo.Sede;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JOSBER
 */
public class SedeDAOimpl extends ConexionDB implements SedeDAO{

    @Override
    public void insert(Sede sede) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO sedes (nombre, direccion) VALUES (?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, sede.getNombre());
            ps.setString(2, sede.getDireccion());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Sede sede) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE sedes SET nombre=?, direccion=? WHERE id_sede = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, sede.getNombre());
            ps.setString(2, sede.getDireccion());            
            ps.setInt(3, sede.getId_sede());
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
            String sql = "DELETE FROM sedes WHERE id_sede = ?";
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
    public Sede getById(int id) throws Exception {
        Sede sed = new Sede();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM sedes WHERE id_sede = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                sed.setId_sede(rs.getInt("id_sede"));
                sed.setNombre(rs.getString("nombre")); 
                sed.setDireccion(rs.getString("direccion")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return sed;
    }

    @Override
    public List<Sede> getAll() throws Exception {
        List<Sede> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM sedes";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Sede>();
            while (rs.next()) {
                Sede sed = new Sede();
                sed.setId_sede(rs.getInt("id_sede"));
                sed.setNombre(rs.getString("nombre"));
                sed.setDireccion(rs.getString("direccion")); 
                lista.add(sed);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
