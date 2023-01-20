package com.example.microserviciooperador.controlador;

import com.example.microserviciooperador.interfaceService.IlibroService;
import com.example.microserviciooperador.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operador/")
@CrossOrigin("*")
public class LibroController {

    @Autowired
    private IlibroService service;

    @PostMapping("/crearlibro")
    public String crearLibro( Model model, Libro libro){
        service.saveLibro(libro);
        return "Creacion exitosa";
    }

    @PostMapping("/editarlibro/{id}")
    public String editarLibro(Libro newlibro, @PathVariable int id){
        Libro libroeditar = service.listarId(id).get();
        libroeditar.setTitulo(newlibro.getTitulo());
        libroeditar.setDescripcion(newlibro.getDescripcion());
        libroeditar.setImagen(newlibro.getImagen());
        service.saveLibro(libroeditar);
        return "Edicion exitosa";
    }

    @GetMapping("/eliminarlibro/{id}")
    public String eliminarLibro(Model model, @PathVariable(name = "id") int id){
        service.deleteLibro(id);
        return "Eliminacion exitosa";
    }

}
