package com.emergentes.modelo;

/**
 *
 * @author JOSBER
 */
public class Gestion {
    private int id_gestion;
    private String nombre;

    public Gestion() {
        this.id_gestion = 0;
        this.nombre = "";
    }

    public int getId_gestion() {
        return id_gestion;
    }

    public void setId_gestion(int id_gestion) {
        this.id_gestion = id_gestion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gestion{" + "id_gestion=" + id_gestion + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
}
