package com.example.rafaj.fragmentapp;

import android.widget.TextView;

public class Persona {
    private TextView imagen;
    private String nombre;
    private String edad;
    private String carrera;

    public Persona() {
    }

    public Persona(TextView imagen, String nombre, String edad, String carrera) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public TextView getImagen() {
        return imagen;
    }

    public void setImagen(TextView imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
