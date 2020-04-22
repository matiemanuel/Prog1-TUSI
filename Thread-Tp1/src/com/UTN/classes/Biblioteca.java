package com.UTN.classes;

import java.util.Hashtable;

public class Biblioteca {

    private Hashtable<Integer, Libro> libros;
    private int max = 20;

    public Biblioteca() {
        this.libros = new Hashtable<>();
    }

    public Libro retirarLibro(int id){
        Libro libro = null;
        if(libros.containsKey(id)){
            libro = libros.get(id);
            libros.remove(id);
        }
        return libro;
    }

    public boolean ingresarLibro(Libro libro){
        if(getCantidadLibros() < max){
            libros.put(libro.getIdLibro(),libro);
            return true;
        }
        return false;
    }

    public int getCantidadLibros(){
        return libros.size();
    }
}
