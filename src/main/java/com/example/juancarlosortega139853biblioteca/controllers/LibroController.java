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
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable Long id) {
        return libroService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return ResponseEntity.ok(libroService.update(id, libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibro(@PathVariable Long id) {
        libroService.delete(id);
        return ResponseEntity.ok().build();
    }
}
