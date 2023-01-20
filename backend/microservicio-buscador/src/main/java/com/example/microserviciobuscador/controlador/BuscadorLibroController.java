package com.example.microserviciobuscador.controlador;

import com.example.microserviciobuscador.interfaceService.IlibroService;
import com.example.microserviciobuscador.modelo.Libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buscador/")
@CrossOrigin("*")
public class BuscadorLibroController {

    @Autowired
    private IlibroService service;

    @GetMapping("/libros")
    public List<Libro> mostrarLibros(){
        List<Libro> libros = service.findAll();
        return libros;
    }

    @GetMapping("/libro/{id}")
    public Libro mostrarLibroId(@PathVariable(name = "id") int id){
        Libro libro = service.findLibro(id);
        return libro;
    }

    @PostMapping("/libro")
    public Libro buscarlibro(int id){
        Libro libroencontrado = service.findLibro(id);
        System.out.println(libroencontrado);
        return libroencontrado;
    }

    @PostMapping("/libro/titulo")
    public List<Libro> buscarlibrosportitulo(String titulo){
        List<Libro> librosencontrado = service.findByTitulo(titulo);
        return librosencontrado;
    }
}
