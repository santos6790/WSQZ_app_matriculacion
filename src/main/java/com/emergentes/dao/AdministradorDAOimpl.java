package com.emergentes.dao;

import com.emergentes.modelo.Administrador;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class AdministradorDAOimpl extends ConexionDB implements AdministradorDAO{

    @Override
    public void insert(Administrador administrador) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO usuarios (ap_paterno, ap_materno, nombres, ci, celular, correo, foto, password, estado, nivel) VALUES (?, ?, ?, ?, ?, ?, ?, SHA1(?), ?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, administrador.getAp_paterno());
            ps.setString(2, administrador.getAp_materno());
            ps.setString(3, administrador.getNombres());
            ps.setInt(4, administrador.getCi());
            ps.setInt(5, administrador.getCelular());
            ps.setString(6, administrador.getCorreo());
            ps.setString(7, administrador.getFoto());
            ps.setString(8, administrador.getPassword());
            ps.setInt(9, administrador.getEstado());
            ps.setInt(10, administrador.getNivel());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Administrador administrador) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE usuarios SET ap_paterno=?, ap_materno=?, nombres=?, ci=?, celular=?, correo=?, foto=?, password=SHA1(?), estado=?, nivel=? WHERE id_usuario = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, administrador.getAp_paterno());
            ps.setString(2, administrador.getAp_materno());
            ps.setString(3, administrador.getNombres());
            ps.setInt(4, administrador.getCi());
            ps.setInt(5, administrador.getCelular());
            ps.setString(6, administrador.getCorreo());
            ps.setString(7, administrador.getFoto());
            ps.setString(8, administrador.getPassword());
            ps.setInt(9, administrador.getEstado());
            ps.setInt(10, administrador.getNivel());            
            ps.setInt(11, administrador.getId_usuario());
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
            String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
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
    public Administrador getById(int id) throws Exception {
        Administrador adm = new Administrador();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                adm.setId_usuario(rs.getInt("id_usuario"));
                adm.setAp_paterno(rs.getString("ap_paterno")); 
                adm.setAp_materno(rs.getString("ap_materno")); 
                adm.setNombres(rs.getString("nombres")); 
                adm.setCi(rs.getInt("ci")); 
                adm.setCelular(rs.getInt("celular")); 
                adm.setCorreo(rs.getString("correo")); 
                
                adm.setFoto(rs.getString("foto")); 

                adm.setPassword(rs.getString("password")); 
                adm.setEstado(rs.getInt("estado")); 
                adm.setNivel(rs.getInt("nivel")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return adm;
    }

    @Override
    public List<Administrador> getAll() throws Exception {
        List<Administrador> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE nivel = 1";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Administrador>();
            while (rs.next()) {
                Administrador adm = new Administrador();
                
                adm.setId_usuario(rs.getInt("id_usuario"));
                adm.setAp_paterno(rs.getString("ap_paterno")); 
                adm.setAp_materno(rs.getString("ap_materno")); 
                adm.setNombres(rs.getString("nombres")); 
                adm.setCi(rs.getInt("ci")); 
                adm.setCelular(rs.getInt("celular")); 
                adm.setCorreo(rs.getString("correo")); 
                adm.setFoto(rs.getString("foto")); 
                adm.setPassword(rs.getString("password")); 
                adm.setEstado(rs.getInt("estado")); 
                adm.setNivel(rs.getInt("nivel"));
                lista.add(adm);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }

    @Override
    public Administrador getByCorreo(String correo) throws Exception {
        Administrador adm = new Administrador();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE correo = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                adm.setId_usuario(rs.getInt("id_usuario"));
                adm.setAp_paterno(rs.getString("ap_paterno")); 
                adm.setAp_materno(rs.getString("ap_materno")); 
                adm.setNombres(rs.getString("nombres")); 
                adm.setCi(rs.getInt("ci")); 
                adm.setCelular(rs.getInt("celular")); 
                adm.setCorreo(rs.getString("correo")); 
                
                adm.setFoto(rs.getString("foto")); 

                adm.setPassword(rs.getString("password")); 
                adm.setEstado(rs.getInt("estado")); 
                adm.setNivel(rs.getInt("nivel")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return adm;
    }
    
}
