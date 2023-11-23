package com.example.juancarlosortega139853biblioteca.service;

import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import com.example.juancarlosortega139853biblioteca.repositorio.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public Prestamo realizarPrestamo(Prestamo prestamo) {
        // Implementar la lógica para realizar un préstamo
        return prestamoRepository.save(prestamo);
    }

    // Más métodos relacionados con la lógica de negocio
}
