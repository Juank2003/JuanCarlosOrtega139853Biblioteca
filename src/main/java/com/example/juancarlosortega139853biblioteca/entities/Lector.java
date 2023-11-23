package com.example.juancarlosortega139853biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lectores")
public class Lector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

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

    public Lector(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Otros atributos y anotaciones
    // Getters y setters
}
