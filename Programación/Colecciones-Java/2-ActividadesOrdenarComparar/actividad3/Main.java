package actividad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	/*Crea una clase Libro con los atributos titulo, autor y precio. Implementa la interfaz Comparable para ordenar los libros 
	 * por su precio en orden descendente. Crea una lista de libros, ordénala e imprime la lista ordenada.*/
	
	public static void main(String[] args) {
		// CREAMOS UNA LISTA QUE ALMACENA LOS LIBROS
		List <Libro> listaLibros = new ArrayList <Libro>();
		
		//AÑADO LIBROS A LA LISTA
		listaLibros.add(new Libro("El Principito", "Antonine de Saint-Exupéry", 25));
		listaLibros.add(new Libro("La Odisea", "Homero", 21.2)); 
		listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes ", 24.2)); 
		listaLibros.add(new Libro("Las mil y una noches", "desconocido", 20.2)); 
		listaLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 21.8)); 
		listaLibros.add(new Libro("Harry Potter", "J.K", 20)); 
		
		
		//METODO Collections.sort QUE ORDENA LA LISTA CON reverseOrder de forma descendente
		Collections.sort(listaLibros, Collections.reverseOrder());
		
		//MOSTRAMOS EL RESULTADO ORDENADO DE FORMA DESCENDENTE POR PRECIO
		System.out.println("---------------------LIBROS ORDENADOS POR PRECIO DE MAYOR A MENOR--------------------");
		for (Libro libro : listaLibros) {
			System.out.println(libro);
		}
		

	}

}
