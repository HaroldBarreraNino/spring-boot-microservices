package com.example.microserviciobuscador.controller;

import com.example.microserviciobuscador.entity.Libro;
import com.example.microserviciobuscador.repository.LibroRepositorio;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BuscadorLibroController {
    LibroRepositorio repositorio;

    @GetMapping("/")
    public String mostrarLibros(){
        List<Libro> libros = (List<Libro>) repositorio.findAll();
        for (Libro libro: libros) {
            System.out.println(libro);
        }
        return "index";
    }
}
