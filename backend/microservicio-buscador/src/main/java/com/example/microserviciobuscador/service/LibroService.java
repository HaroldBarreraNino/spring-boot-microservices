package com.example.microserviciobuscador.service;

import com.example.microserviciobuscador.interfaceService.IlibroService;
import com.example.microserviciobuscador.interfaces.IlibroQuery;
import com.example.microserviciobuscador.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements IlibroService {

    @Autowired
    private IlibroQuery query;

    @Override
    public List<Libro> findAll() {
        return query.findAll();
    }

    @Override
    public Libro findLibro(int id) {
        return query.findById(id).get();
    }

    @Override
    public List<Libro> findByTitulo(String titulo) {
        return query.findByTitulo(titulo);
    }
}
