package com.UTN;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

/*
1. Sean las siguientes clases:
1. Libro (parte del recurso compartido). Contiene los siguientes atributos:
1. idLibro: número entero. (clave)
2. Título: String.
2. Biblioteca (recurso compartido). Implementada en base a una tabla de hashing que
contiene muchos Libros. Es responsable de la sincronización.
3. Socio (Thread o Runneable). Cada socio retira y luego devuelve el libro retirado. Debe
simular un comportamiento usando números aleatorios para elegir idLibro y el tiempo
de espera para devolver y el tiempo de espera para volver a retirar.
 */