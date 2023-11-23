package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.PrestamoService;
import com.example.juancarlosortega139853biblioteca.entities.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> getAllPrestamos() {
        return prestamoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamo(@PathVariable Long id) {
        return prestamoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoService.save(prestamo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> updatePrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        return ResponseEntity.ok(prestamoService.update(id, prestamo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        prestamoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
