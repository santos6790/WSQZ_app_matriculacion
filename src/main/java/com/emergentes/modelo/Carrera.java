package com.emergentes.modelo;

/**
 * @author JOSBER
 */
public class Carrera {
    private int id_carrera;
    private String nombre;
    private String descripcion;
    private String direccion;

    public Carrera() {
        this.id_carrera = 0;
        this.nombre = "";
        this.descripcion = "";
        this.direccion = "";
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id_carrera=" + id_carrera + ", nombre=" + nombre + ", descripcion=" + descripcion + ", direccion=" + direccion + '}';
    } 
}
