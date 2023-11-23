package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Lector;
import com.example.juancarlosortega139853biblioteca.repositorio.LectorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectorService {

    @Autowired
    private LectorRepository lectorRepository;

    public List<Lector> findAll() {
        return lectorRepository.findAll();
    }

    public Optional<Lector> findById(Long id) {
        return lectorRepository.findById(id);
    }

    public Lector save(Lector lector) {
        return lectorRepository.save(lector);
    }

    public Lector update(Long id, Lector lector) {
        return lectorRepository.findById(id)
                .map(existingLector -> {
                    // Copiar propiedades de 'lector' a 'existingLector'
                    return lectorRepository.save(existingLector);
                })
                .orElseThrow(() -> new EntityNotFoundException("Lector no encontrado con ID: " + id));
    }

    public void delete(Long id) {
        lectorRepository.deleteById(id);
    }
}
