package com.example.juancarlosortega139853biblioteca.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Lector lector;

    @ManyToOne
    private Libro libro;

    private LocalDate fechaPrestamo;

    public Prestamo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Prestamo(Long id, Lector lector, Libro libro, LocalDate fechaPrestamo) {
        this.id = id;
        this.lector = lector;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
    }

    // Constructores, getters y setters
}
