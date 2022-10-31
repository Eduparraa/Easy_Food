package com.easy_food.entidades;

public class Usuario {
    private int id;
    private String nombre;
    private String Telefono;

    public Usuario(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        Telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
