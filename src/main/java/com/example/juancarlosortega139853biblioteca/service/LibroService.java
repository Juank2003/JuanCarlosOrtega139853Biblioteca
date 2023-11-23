package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Libro;
import com.example.juancarlosortega139853biblioteca.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarTodosLosLibros() {
        // Implementar la lógica para listar todos los libros
        return libroRepository.findAll();
    }

    // Más métodos relacionados con la lógica de negocio
}
