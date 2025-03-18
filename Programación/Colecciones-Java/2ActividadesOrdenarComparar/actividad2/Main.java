package actividad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	/*Crea una clase Estudiante con los atributos nombre y nota. Implementa la interfaz Comparable para ordenar los estudiantes 
	 * por su nota en orden ascendente. Crea una lista de estudiantes, ordénala e imprime la lista ordenada.*/
	
	public static void main(String[] args) {
		//CREAMOS UNA LISTA DE ESTUDIANTES
		List <Estudiante> listaEstudiantes = new ArrayList <Estudiante>();
		
		//AÑADO ESTUDIANTES A LA LISTA
		listaEstudiantes.add(new Estudiante ("Lucas", 7));
		listaEstudiantes.add(new Estudiante ("Gonzalo", 8));
		listaEstudiantes.add(new Estudiante ("Aitor", 4));
		listaEstudiantes.add(new Estudiante ("Maria", 9));
		listaEstudiantes.add(new Estudiante ("Marcos", 10));
		listaEstudiantes.add(new Estudiante ("Lucia", 5));
		
		//MUESTRO LA LISTA TAL (SIN ORDENAR)
		System.out.println("Lista estudiantes desordenada" + listaEstudiantes);
		System.out.println("-------------------Ordenando------------");
		
		//METODO Collections.sort PARA ORDENAR LISTAS
		Collections.sort(listaEstudiantes);
		
		//MUESTRO LA LISTA CON EL RESULTADO ORDENADO 
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println("Lista estudiantes ordenada" + estudiante);
		}
		

	}

}
