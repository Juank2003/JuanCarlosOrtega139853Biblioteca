package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import com.example.juancarlosortega139853biblioteca.repositorio.PrestamoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> findAll() {
        return prestamoRepository.findAll();
    }

    public Optional<Prestamo> findById(Long id) {
        return prestamoRepository.findById(id);
    }

    public Prestamo save(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public Prestamo update(Long id, Prestamo prestamo) {
        return prestamoRepository.findById(id)
                .map(existingPrestamo -> {
                    // Copiar propiedades de 'prestamo' a 'existingPrestamo'
                    return prestamoRepository.save(existingPrestamo);
                })
                .orElseThrow(() -> new EntityNotFoundException("Préstamo no encontrado con ID: " + id));
    }

    public void delete(Long id) {
        prestamoRepository.deleteById(id);
    }
}
