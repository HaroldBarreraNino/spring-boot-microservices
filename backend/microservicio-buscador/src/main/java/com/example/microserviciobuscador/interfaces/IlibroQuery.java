package com.example.microserviciobuscador.interfaces;

import com.example.microserviciobuscador.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IlibroQuery extends JpaRepository<Libro, Integer> {
    List<Libro> findByTitulo(String titulo);
}
