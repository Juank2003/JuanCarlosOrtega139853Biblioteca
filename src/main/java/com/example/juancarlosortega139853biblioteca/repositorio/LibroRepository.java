package com.example.juancarlosortega139853biblioteca.repositorio;

import com.example.juancarlosortega139853biblioteca.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Aquí puedes añadir métodos de consulta personalizados como buscar por título o autor
    List<Libro> findByTituloContaining(String titulo);
    List<Libro> findByAutorContaining(String autor);
}

