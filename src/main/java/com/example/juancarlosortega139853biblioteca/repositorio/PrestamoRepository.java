package com.example.juancarlosortega139853biblioteca.repositorio;

import com.example.juancarlosortega139853biblioteca.entities.Lector;
import com.example.juancarlosortega139853biblioteca.entities.Libro;
import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    // Aquí puedes añadir métodos de consulta personalizados como buscar por lector o libro
    List<Prestamo> findByLector(Lector lector);
    List<Prestamo> findByLibro(Libro libro);
}
