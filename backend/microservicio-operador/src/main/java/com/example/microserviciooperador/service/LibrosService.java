package com.example.microserviciooperador.service;

import com.example.microserviciooperador.interfaceService.IlibroService;
import com.example.microserviciooperador.interfaces.ILibro;
import com.example.microserviciooperador.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrosService implements IlibroService {

    @Autowired
    private ILibro data;

    @Override
    public List<Libro> listarLibros() {
        return (List<Libro>) data.findAll();
    }

    @Override
    public Optional<Libro> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int saveLibro(Libro p) {
        int res = 0;
        Libro libro = data.save(p);
        if (!libro.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void deleteLibro(int id) {
        data.deleteById(id);
    }
}
