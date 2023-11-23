package com.example.juancarlosortega139853biblioteca.repositorio;

import com.example.juancarlosortega139853biblioteca.entities.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario
}
