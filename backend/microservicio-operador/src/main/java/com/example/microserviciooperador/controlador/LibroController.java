package com.example.microserviciooperador.controlador;

import com.example.microserviciooperador.interfaceService.IlibroService;
import com.example.microserviciooperador.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operador/")
public class LibroController {

    @Autowired
    private IlibroService service;

    @GetMapping
    public String index(Model model, Libro libro){
        model.addAttribute("libros", service.listarLibros());
        return "index";
    }

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
        System.out.println(libroeditar);
        return "Edicion exitosa";
    }

    @GetMapping("/eliminarlibro/{id}")
    public String eliminarLibro(Model model, @PathVariable(name = "id") int id){
        service.deleteLibro(id);
        return "Eliminacion exitosa";
    }

    @GetMapping("/libros")
    public List<Libro> mostrarLibros(){
        List<Libro> libros = service.listarLibros();
        for (Libro libro: libros) {
            System.out.println(libro);
        }
        return libros;
    }

    @GetMapping("/libro/{id}")
    public Libro mostrarLibroId(@PathVariable(name = "id") int id){
        Libro libro = service.listarId(id).get();
        System.out.println(libro);
        return libro;
    }

}
