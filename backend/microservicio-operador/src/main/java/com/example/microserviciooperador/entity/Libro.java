package com.example.microserviciooperador.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idlibro;
    private String titulo;
    private String descripcion;

    @Column(columnDefinition = "TEXT")
    private String imagen;

    public Libro() {
    }

    public Libro(Long idlibro, String titulo, String descripcion, String imagen) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Long getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Long idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idlibro=" + idlibro +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
