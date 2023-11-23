package com.example.juancarlosortega139853biblioteca.entities;

//bibliotecario debe un controlador
import jakarta.persistence.*;

@Entity
@Table(name = "bibliotecarios")
public class Bibliotecario {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    // Constructores, getters y setters

    public Bibliotecario(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Bibliotecario() {

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
