package com.example.microserviciooperador.controller;

import com.example.microserviciooperador.entity.Libro;
import com.example.microserviciooperador.repository.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LibroController {

    @Autowired
    LibroRepositorio repositorio;

    @GetMapping
    public String index(Model model, Libro libro){
        model.addAttribute("libros", repositorio.findAll());
        return "index";
    }

    @PostMapping("/crearlibro")
    public String crearLibro( Model model, Libro libro){
        repositorio.save(libro);
        model.addAttribute("libros", repositorio.findAll());
        return "index";
    }

    @GetMapping("/editarlibro/{id}")
    public String editarLibro(Model model, @PathVariable(name = "id") Long id){
        Libro libroeditar = repositorio.findById(id).get();
        System.out.println(libroeditar);
        model.addAttribute("libro", libroeditar);
        return "index";
    }

    @GetMapping("/eliminarlibro/{id}")
    public String eliminarLibro(Model model, @PathVariable(name = "id") Long id){
        Libro libroborrar = repositorio.findById(id).get();
        repositorio.delete(libroborrar);
        return "index";
    }

}
