package com.emergentes.modelo;

public class Administrador {
    private int id_usuario;
    private String ap_paterno;
    private String ap_materno;
    private String nombres;
    private int ci;
  
    private int celular;
    private String correo;

    private String foto;

    private String password;
    private int estado;
    private int nivel;
    
    public Administrador() {
        this.id_usuario = 0;
        this.ap_paterno = "";
        this.ap_materno = "";
        this.nombres = "";
        this.ci = 0;

        this.celular = 0;
        this.correo = "";


        this.foto = "";
        this.password = "";
        this.estado = 1;
        this.nivel = 1;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
        return "Administrador{" + "id_usuario=" + id_usuario + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", nombres=" + nombres + ", ci=" + ci + ", celular=" + celular + ", correo=" + correo + ", foto=" + foto + ", password=" + password + ", estado=" + estado + ", nivel=" + nivel + '}';
    }
}






