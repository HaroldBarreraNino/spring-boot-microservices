package com.example.microserviciobuscador.repository;

import com.example.microserviciobuscador.entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepositorio extends CrudRepository<Libro, Long> {
}
