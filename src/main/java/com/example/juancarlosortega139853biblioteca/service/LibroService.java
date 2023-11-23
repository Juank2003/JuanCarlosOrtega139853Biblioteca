package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Libro;
import com.example.juancarlosortega139853biblioteca.repositorio.LibroRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro update(Long id, Libro libro) {
        return libroRepository.findById(id)
                .map(existingLibro -> {
                    // Copiar propiedades de 'libro' a 'existingLibro'
                    return libroRepository.save(existingLibro);
                })
                .orElseThrow(() -> new EntityNotFoundException("Libro no encontrado con ID: " + id));
    }

    public void delete(Long id) {
        libroRepository.deleteById(id);
    }
}
