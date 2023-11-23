package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.LectorService;
import com.example.juancarlosortega139853biblioteca.entities.Lector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lectores")
public class LectorController {

    @Autowired
    private LectorService lectorService;

    @GetMapping("/{id}")
    public ResponseEntity<Lector> obtenerLector(@PathVariable Long id) {
        Lector lector = lectorService.obtenerLector(id);
        return ResponseEntity.ok(lector);
    }

    // Más métodos para manejar otras peticiones HTTP como POST, PUT, DELETE
}
