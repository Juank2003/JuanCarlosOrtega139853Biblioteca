package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Bibliotecario;
import com.example.juancarlosortega139853biblioteca.repositorio.BibliotecarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public Bibliotecario crearBibliotecario(Bibliotecario bibliotecario) {
        // Implementar la lógica para crear un bibliotecario
        return bibliotecarioRepository.save(bibliotecario);
    }

    // Más métodos relacionados con la lógica de negocio
}
