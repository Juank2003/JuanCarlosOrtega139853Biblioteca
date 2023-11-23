package com.example.juancarlosortega139853biblioteca.controllers;

import com.example.juancarlosortega139853biblioteca.service.LectorService;
import com.example.juancarlosortega139853biblioteca.entities.Lector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lectores")
public class LectorController {

    @Autowired
    private LectorService lectorService;

    @GetMapping
    public List<Lector> getAllLectores() {
        return lectorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lector> getLector(@PathVariable Long id) {
        return lectorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Lector createLector(@RequestBody Lector lector) {
        return lectorService.save(lector);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lector> updateLector(@PathVariable Long id, @RequestBody Lector lector) {
        return ResponseEntity.ok(lectorService.update(id, lector));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLector(@PathVariable Long id) {
        lectorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
