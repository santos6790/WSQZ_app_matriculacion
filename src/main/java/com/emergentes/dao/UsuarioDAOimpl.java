package com.emergentes.dao;

import com.emergentes.modelo.Usuario;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JOSBER
 */
public class UsuarioDAOimpl extends ConexionDB implements UsuarioDAO{

    @Override
    public void insert(Usuario usuario) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO usuarios (ap_paterno, ap_materno, nombres, ci, ru, celular, correo, direccion, f_nac, n_titulo_bachiller, foto, nick, password, estado, nivel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, SHA1(?), ?, ?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuario.getAp_paterno());
            ps.setString(2, usuario.getAp_materno());
            ps.setString(3, usuario.getNombres());
            ps.setInt(4, usuario.getCi());
            ps.setInt(5, usuario.getRu());
            ps.setInt(6, usuario.getCelular());
            ps.setString(7, usuario.getCorreo());
            ps.setString(8, usuario.getDireccion());
            ps.setString(9, usuario.getF_nac());
            ps.setString(10, usuario.getN_titulo_bachiller());
            ps.setString(11, usuario.getFoto());
            ps.setString(12, usuario.getNick());
            ps.setString(13, usuario.getPassword());
            ps.setInt(14, usuario.getEstado());
            ps.setInt(15, usuario.getNivel());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Usuario usuario) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE usuarios SET ap_paterno=?, ap_materno=?, nombres=?, ci=?, ru=?, celular=?, correo=?, direccion=?, f_nac=?, n_titulo_bachiller=?, foto=?, nick=?, password=SHA1(?), estado=?, nivel=? WHERE id_usuario = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuario.getAp_paterno());
            ps.setString(2, usuario.getAp_materno());
            ps.setString(3, usuario.getNombres());
            ps.setInt(4, usuario.getCi());
            ps.setInt(5, usuario.getRu());
            ps.setInt(6, usuario.getCelular());
            ps.setString(7, usuario.getCorreo());
            ps.setString(8, usuario.getDireccion());
            ps.setString(9, usuario.getF_nac());
            ps.setString(10, usuario.getN_titulo_bachiller());
            ps.setString(11, usuario.getFoto());
            ps.setString(12, usuario.getNick());
            ps.setString(13, usuario.getPassword());
            ps.setInt(14, usuario.getEstado());
            ps.setInt(15, usuario.getNivel());            
            ps.setInt(16, usuario.getId_usuario());
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
    public Usuario getById(int id) throws Exception {
        Usuario usu = new Usuario();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setAp_paterno(rs.getString("ap_paterno")); 
                usu.setAp_materno(rs.getString("ap_materno")); 
                usu.setNombres(rs.getString("nombres")); 
                usu.setCi(rs.getInt("ci")); 
                usu.setRu(rs.getInt("ru")); 
                usu.setCelular(rs.getInt("celular")); 
                usu.setCorreo(rs.getString("correo")); 
                usu.setDireccion(rs.getString("direccion")); 
                usu.setF_nac(rs.getString("f_nac")); 
                usu.setN_titulo_bachiller(rs.getString("n_titulo_bachiller")); 
                usu.setFoto(rs.getString("foto")); 
                usu.setNick(rs.getString("nick")); 
                usu.setPassword(rs.getString("password")); 
                usu.setEstado(rs.getInt("estado")); 
                usu.setNivel(rs.getInt("nivel")); 
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return usu;
    }

    @Override
    public List<Usuario> getAll() throws Exception {
        List<Usuario> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE nivel = 2";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Usuario>();
            while (rs.next()) {
                Usuario usu = new Usuario();
                
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setAp_paterno(rs.getString("ap_paterno")); 
                usu.setAp_materno(rs.getString("ap_materno")); 
                usu.setNombres(rs.getString("nombres")); 
                usu.setCi(rs.getInt("ci")); 
                usu.setRu(rs.getInt("ru")); 
                usu.setCelular(rs.getInt("celular")); 
                usu.setCorreo(rs.getString("correo")); 
                usu.setDireccion(rs.getString("direccion")); 
                usu.setF_nac(rs.getString("f_nac")); 
                usu.setN_titulo_bachiller(rs.getString("n_titulo_bachiller")); 
                usu.setFoto(rs.getString("foto")); 
                usu.setNick(rs.getString("nick")); 
                usu.setPassword(rs.getString("password")); 
                usu.setEstado(rs.getInt("estado")); 
                usu.setNivel(rs.getInt("nivel"));
                lista.add(usu);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
