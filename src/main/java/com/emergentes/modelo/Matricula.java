package com.emergentes.modelo;
/**
 * @author JOSBER
 */
public class Matricula {
   private int id_matricula;
   
   private int id_usuario;
   private int id_categoria;
   private int id_carrera;
   private int id_sede;
   private int id_gestion;
   
   private int costo;
   private String f_matriculacion;
   private int nro_deposito;
   
   private String usuario;
   private String categoria;
   private String carrera;
   private String sede;
   private String gestion;  

    public Matricula() {
        this.id_matricula = 0;
        this.id_usuario = 0;
        this.id_categoria = 0;
        this.id_carrera = 0;
        this.id_sede = 0;
        this.id_gestion = 0;
        this.costo = 0;
        this.f_matriculacion = "";
        this.nro_deposito = 0;
        this.usuario = "";
        this.categoria = "";
        this.carrera = "";
        this.sede = "";
        this.gestion = "";
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public int getId_gestion() {
        return id_gestion;
    }

    public void setId_gestion(int id_gestion) {
        this.id_gestion = id_gestion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getF_matriculacion() {
        return f_matriculacion;
    }

    public void setF_matriculacion(String f_matriculacion) {
        this.f_matriculacion = f_matriculacion;
    }

    public int getNro_deposito() {
        return nro_deposito;
    }

    public void setNro_deposito(int nro_deposito) {
        this.nro_deposito = nro_deposito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public String toString() {
        return "Matricula{" + "id_matricula=" + id_matricula + ", id_usuario=" + id_usuario + ", id_categoria=" + id_categoria + ", id_carrera=" + id_carrera + ", id_sede=" + id_sede + ", id_gestion=" + id_gestion + ", costo=" + costo + ", f_matriculacion=" + f_matriculacion + ", nro_deposito=" + nro_deposito + ", usuario=" + usuario + ", categoria=" + categoria + ", carrera=" + carrera + ", sede=" + sede + ", gestion=" + gestion + '}';
    }
}
