package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.PrestamoService;
import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @PostMapping
    public ResponseEntity<Prestamo> realizarPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo nuevoPrestamo = prestamoService.realizarPrestamo(prestamo);
        return ResponseEntity.ok(nuevoPrestamo);
    }

    // Más métodos para manejar otras peticiones HTTP como GET, PUT, DELETE
}
