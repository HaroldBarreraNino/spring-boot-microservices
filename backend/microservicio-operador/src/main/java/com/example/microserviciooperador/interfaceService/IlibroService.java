package com.example.microserviciooperador.interfaceService;

import com.example.microserviciooperador.modelo.Libro;

import java.util.List;
import java.util.Optional;

public interface IlibroService {
    public List<Libro> listarLibros();
    public Optional<Libro> listarId(int id);
    public int saveLibro(Libro p);
    public void deleteLibro(int id);
}
