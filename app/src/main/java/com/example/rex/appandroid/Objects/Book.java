package com.example.rex.appandroid.Objects;

public class Book {
    private String titulo;
    private String author;
    private String edition;
    private int anio;
    private String categoria;
    private double precion;

    public Book(String titulo, String author, String edition, int anio, String categoria, double precion) {
        this.titulo = titulo;
        this.author = author;
        this.edition = edition;
        this.anio = anio;
        this.categoria = categoria;
        this.precion = precion;
    }

    public Book() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecion() {
        return precion;
    }

    public void setPrecion(double precion) {
        this.precion = precion;
    }
}

