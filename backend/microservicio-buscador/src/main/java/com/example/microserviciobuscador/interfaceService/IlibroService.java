package com.example.microserviciobuscador.interfaceService;

import com.example.microserviciobuscador.modelo.Libro;

import java.util.List;

public interface IlibroService {

    List<Libro> findAll();
    Libro findLibro(int id);
    List<Libro> findByTitulo(String titulo);

}
