package com.emergentes.dao;

import com.emergentes.modelo.Categoria;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSBER
 */
public class CategoriaDAOimpl extends ConexionDB implements CategoriaDAO{

    @Override
    public void insert(Categoria categoria) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Categoria categoria) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE categorias SET nombre=?, descripcion=? WHERE id_categoria = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());            
            ps.setInt(3, categoria.getId_categoria());
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
            String sql = "DELETE FROM categorias WHERE id_categoria = ?";
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
    public Categoria getById(int id) throws Exception {
        Categoria cat = new Categoria();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM categorias WHERE id_categoria = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                cat.setId_categoria(rs.getInt("id_categoria"));
                cat.setNombre(rs.getString("nombre")); 
                cat.setDescripcion(rs.getString("descripcion")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return cat;
    }

    @Override
    public List<Categoria> getAll() throws Exception {
        List<Categoria> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM categorias";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Categoria>();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setId_categoria(rs.getInt("id_categoria"));
                cat.setNombre(rs.getString("nombre"));
                cat.setDescripcion(rs.getString("descripcion"));                
                lista.add(cat);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
