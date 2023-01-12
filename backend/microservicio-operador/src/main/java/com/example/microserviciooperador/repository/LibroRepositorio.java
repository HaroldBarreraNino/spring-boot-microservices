package com.example.microserviciooperador.repository;

import com.example.microserviciooperador.entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepositorio extends CrudRepository<Libro, Long> {
}
