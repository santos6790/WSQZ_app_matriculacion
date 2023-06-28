package com.emergentes.modelo;
/**
 * @author JOSBER
 */
public class Sede {
   private int id_sede;
   private String nombre;
   private String direccion;

    public Sede() {
        this.id_sede = 0;
        this.nombre = "";
        this.direccion = "";
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sede{" + "id_sede=" + id_sede + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
   
   
}
