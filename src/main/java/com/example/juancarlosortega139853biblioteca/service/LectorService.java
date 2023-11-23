package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Lector;
import com.example.juancarlosortega139853biblioteca.repositorio.LectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectorService {

    @Autowired
    private LectorRepository lectorRepository;

    public Lector obtenerLector(Long id) {
        // Implementar la lógica para obtener un lector
        return lectorRepository.findById(id).orElse(null);
    }

    // Más métodos relacionados con la lógica de negocio
}
