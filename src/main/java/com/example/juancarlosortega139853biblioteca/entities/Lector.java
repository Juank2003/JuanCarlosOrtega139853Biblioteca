package com.example.juancarlosortega139853biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lectores")
public class Lector {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    // Constructores, getters y setters
    public Lector() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
