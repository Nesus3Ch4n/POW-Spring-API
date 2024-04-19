package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;
    private String nombre;
    private String correo;
    private int contrasenia;
    private String facultad;
    private String estamento;

    public User() {
    }

    public User(int iduser, String nombre, String correo, int contrasenia, String facultad, String estamento) {
        this.iduser = iduser;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.facultad = facultad;
        this.estamento = estamento;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getEstamento() {
        return estamento;
    }

    public void setEstamento(String estamento) {
        this.estamento = estamento;
    }

    public void addAttribute(String users, List<User> users1) {
    }
}