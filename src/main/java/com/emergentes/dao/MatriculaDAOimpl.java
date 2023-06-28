package com.emergentes.dao;

import com.emergentes.modelo.Matricula;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JOSBER
 */
public class MatriculaDAOimpl extends ConexionDB implements MatriculaDAO {

    @Override
    public void insert(Matricula matricula) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO matriculas (costo, f_matriculacion, nro_deposito, id_usuario, id_categoria, id_carrera, id_sede, id_gestion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, matricula.getCosto());
            ps.setString(2, matricula.getF_matriculacion());
            ps.setInt(3, matricula.getNro_deposito());
            ps.setInt(4, matricula.getId_usuario());
            ps.setInt(5, matricula.getId_categoria());
            ps.setInt(6, matricula.getId_carrera());
            ps.setInt(7, matricula.getId_sede());
            ps.setInt(8, matricula.getId_gestion());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Matricula matricula) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE matriculas SET costo=?, f_matriculacion=?, nro_deposito=?, id_usuario=?, id_categoria=?, id_carrera=?, id_sede=?, id_gestion=? WHERE id_matricula = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, matricula.getCosto());
            ps.setString(2, matricula.getF_matriculacion());
            ps.setInt(3, matricula.getNro_deposito());
            ps.setInt(4, matricula.getId_usuario());
            ps.setInt(5, matricula.getId_categoria());
            ps.setInt(6, matricula.getId_carrera());
            ps.setInt(7, matricula.getId_sede());
            ps.setInt(8, matricula.getId_gestion());
            ps.setInt(9, matricula.getId_matricula());
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
            String sql = "DELETE FROM matriculas WHERE id_matricula = ?";
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
    public Matricula getById(int id) throws Exception {
        Matricula mat = new Matricula();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM matriculas WHERE id_matricula = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mat.setId_matricula(rs.getInt("id_matricula"));
                mat.setCosto(rs.getInt("costo")); 
                mat.setF_matriculacion(rs.getString("f_matriculacion")); 
                mat.setNro_deposito(rs.getInt("nro_deposito")); 
                mat.setId_usuario(rs.getInt("id_usuario")); 
                mat.setId_categoria(rs.getInt("id_categoria")); 
                mat.setId_carrera(rs.getInt("id_carrera")); 
                mat.setId_sede(rs.getInt("id_sede")); 
                mat.setId_gestion(rs.getInt("id_gestion")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return mat;

    }

    @Override
    public List<Matricula> getAll() throws Exception {
        List<Matricula> lista = null;
        try{
            this.conectar();
            
//            String sql = "SELECT m.*, u.ci as usuario, cat.nombre as categoria, car.nombre as carrera, s.nombre as sede, g.nombre as gestion FROM matriculas m";
//            sql += "LEFT JOIN usuarios u ON m.id_usuario = u.id_usuario";
//            sql += "LEFT JOIN categorias cat ON m.id_categoria = cat.id_categoria";
//            sql += "LEFT JOIN carreras car ON m.id_carrera = car.id_carrera";
//            sql += "LEFT JOIN sedes s ON m.id_sede = s.id_sede";
//            sql += "LEFT JOIN gestiones g ON m.id_gestion = g.id_gestion";
            
            String sql = "SELECT m.*, u.ci as usuario, cat.nombre as categoria, car.nombre as carrera, s.nombre as sede, g.nombre as gestion FROM matriculas m LEFT JOIN usuarios u ON m.id_usuario = u.id_usuario LEFT JOIN categorias cat ON m.id_categoria = cat.id_categoria LEFT JOIN carreras car ON m.id_carrera = car.id_carrera LEFT JOIN sedes s ON m.id_sede = s.id_sede LEFT JOIN gestiones g ON m.id_gestion = g.id_gestion  ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            lista = new ArrayList<Matricula>();
            while (rs.next()) {
                Matricula mat = new Matricula();
                
                mat.setId_matricula(rs.getInt("id_matricula"));
                mat.setCosto(rs.getInt("costo")); 
                mat.setF_matriculacion(rs.getString("f_matriculacion")); 
                mat.setNro_deposito(rs.getInt("nro_deposito")); 
                mat.setId_usuario(rs.getInt("id_usuario")); 
                mat.setId_categoria(rs.getInt("id_categoria")); 
                mat.setId_carrera(rs.getInt("id_carrera")); 
                mat.setId_sede(rs.getInt("id_sede")); 
                mat.setId_gestion(rs.getInt("id_gestion"));
                
                mat.setUsuario(rs.getString("usuario"));
                mat.setCategoria(rs.getString("categoria"));
                mat.setCarrera(rs.getString("carrera"));
                mat.setSede(rs.getString("sede"));
                mat.setGestion(rs.getString("gestion"));
                lista.add(mat);
            }
            rs.close();
            ps.close();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
