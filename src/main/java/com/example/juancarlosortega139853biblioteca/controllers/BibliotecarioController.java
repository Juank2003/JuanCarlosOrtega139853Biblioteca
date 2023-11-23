package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.BibliotecarioService;
import com.example.juancarlosortega139853biblioteca.entities.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    @Autowired
    private BibliotecarioService bibliotecarioService;

    @PostMapping
    public ResponseEntity<Bibliotecario> crearBibliotecario(@RequestBody Bibliotecario bibliotecario) {
        Bibliotecario nuevoBibliotecario = bibliotecarioService.crearBibliotecario(bibliotecario);
        return ResponseEntity.ok(nuevoBibliotecario);
    }

    // Más métodos para manejar otras peticiones HTTP como GET, PUT, DELETE
}