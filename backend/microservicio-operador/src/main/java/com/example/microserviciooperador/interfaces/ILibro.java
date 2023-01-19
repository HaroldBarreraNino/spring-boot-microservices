package com.example.microserviciooperador.interfaces;

import com.example.microserviciooperador.modelo.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibro extends CrudRepository<Libro, Integer> {
}
