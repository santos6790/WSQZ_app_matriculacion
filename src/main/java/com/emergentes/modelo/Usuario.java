package com.emergentes.modelo;

/**
 *
 * @author JOSBER
 */
public class Usuario {
    private int id_usuario;
    private String ap_paterno;
    private String ap_materno;
    private String nombres;
    private int ci;
    private int ru;
    private int celular;
    private String correo;
    private String direccion;
    private String f_nac;
    private String n_titulo_bachiller;
    private String foto;
    private String nick;
    private String password;
    private int estado;
    private int nivel;

    public Usuario() {
        this.id_usuario = 0;
        this.ap_paterno = "";
        this.ap_materno = "";
        this.nombres = "";
        this.ci = 0;
        this.ru = 0;
        this.celular = 0;
        this.correo = "";
        this.direccion = "";
        this.f_nac = "";
        this.n_titulo_bachiller = "";
        this.foto = "";
        this.nick = "";
        this.password = "";
        this.estado = 1;
        this.nivel = 2;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getF_nac() {
        return f_nac;
    }

    public void setF_nac(String f_nac) {
        this.f_nac = f_nac;
    }

    public String getN_titulo_bachiller() {
        return n_titulo_bachiller;
    }

    public void setN_titulo_bachiller(String n_titulo_bachiller) {
        this.n_titulo_bachiller = n_titulo_bachiller;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", nombres=" + nombres + ", ci=" + ci + ", ru=" + ru + ", celular=" + celular + ", correo=" + correo + ", direccion=" + direccion + ", f_nac=" + f_nac + ", n_titulo_bachiller=" + n_titulo_bachiller + ", foto=" + foto + ", nick=" + nick + ", password=" + password + ", estado=" + estado + ", nivel=" + nivel + '}';
    }
    
    
    
    
}
