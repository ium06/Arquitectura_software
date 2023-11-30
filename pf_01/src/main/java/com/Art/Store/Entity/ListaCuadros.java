package com.Art.Store.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="miscuadros")
public class ListaCuadros {

    @Id
    private int id;
    private String titulo;
    private String autor;
    private String precio;

    public ListaCuadros(int id, String titulo, String autor, String precio) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public ListaCuadros() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
