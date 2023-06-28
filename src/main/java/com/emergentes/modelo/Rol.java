package com.emergentes.modelo;
/**
 * @author JOSBER
 */
public class Rol {
   private int id_rol;
   private String nombre;
   private int estado;

    public Rol() {
        this.id_rol = 0;
        this.nombre = "";
        this.estado = 0;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" + "id_rol=" + id_rol + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
}
