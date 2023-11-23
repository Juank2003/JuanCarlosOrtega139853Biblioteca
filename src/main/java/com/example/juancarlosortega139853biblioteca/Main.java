package com.example.juancarlosortega139853biblioteca;

import com.example.juancarlosortega139853biblioteca.entities.Lector;
import com.example.juancarlosortega139853biblioteca.entities.Libro;
import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Debes configurar 'bibliotecaPU' en tu persistence.xml para que coincida con tu unidad de persistencia.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
        EntityManager em = emf.createEntityManager();

        try {
            // Crear una instancia de cada entidad
            Lector lector = new Lector();
            lector.setNombre("Juan Carlos Ortega");

            Libro libro = new Libro();
            libro.setTitulo("La historia de Java");
            libro.setAutor("Autor Ejemplo");

            Prestamo prestamo = new Prestamo();
            prestamo.setLector(lector);
            prestamo.setLibro(libro);
            prestamo.setFechaPrestamo(LocalDate.now());

            // Persistir las entidades en la base de datos
            em.getTransaction().begin();
            em.persist(lector);
            em.persist(libro);
            em.persist(prestamo);
            em.getTransaction().commit();
        } finally {
            // Cerrar el EntityManager y el EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}
