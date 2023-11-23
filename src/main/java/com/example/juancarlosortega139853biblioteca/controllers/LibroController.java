package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.LibroService;
import com.example.juancarlosortega139853biblioteca.entities.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public ResponseEntity<List<Libro>> listarLibros() {
        List<Libro> libros = libroService.listarTodosLosLibros();
        return ResponseEntity.ok(libros);
    }

    // Más métodos para manejar otras peticiones HTTP como POST, PUT, DELETE
}
