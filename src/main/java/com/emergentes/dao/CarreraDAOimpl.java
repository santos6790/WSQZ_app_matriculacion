package com.emergentes.dao;

import com.emergentes.modelo.Carrera;
import com.emergentes.modelo.Categoria;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JOSBER
 */
public class CarreraDAOimpl extends ConexionDB implements CarreraDAO{

    @Override
    public void insert(Carrera carrera) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO carreras (nombre, descripcion, direccion) VALUES (?, ?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, carrera.getNombre());
            ps.setString(2, carrera.getDescripcion());
            ps.setString(3, carrera.getDireccion());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Carrera carrera) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE carreras SET nombre=?, descripcion=?, direccion=? WHERE id_carrera = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, carrera.getNombre());
            ps.setString(2, carrera.getDescripcion());            
            ps.setString(3, carrera.getDireccion());            
            ps.setInt(4, carrera.getId_carrera());
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
            String sql = "DELETE FROM carreras WHERE id_carrera = ?";
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
    public Carrera getById(int id) throws Exception {
        Carrera car = new Carrera();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM carreras WHERE id_carrera = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                car.setId_carrera(rs.getInt("id_carrera"));
                car.setNombre(rs.getString("nombre")); 
                car.setDescripcion(rs.getString("descripcion")); 
                car.setDireccion(rs.getString("direccion")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return car;
    }

    @Override
    public List<Carrera> getAll() throws Exception {
        List<Carrera> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM carreras";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            lista = new ArrayList<Carrera>();
            while (rs.next()) {
                Carrera car = new Carrera();
                car.setId_carrera(rs.getInt("id_carrera"));
                car.setNombre(rs.getString("nombre"));
                car.setDescripcion(rs.getString("descripcion"));                
                car.setDireccion(rs.getString("direccion"));                
                lista.add(car);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
