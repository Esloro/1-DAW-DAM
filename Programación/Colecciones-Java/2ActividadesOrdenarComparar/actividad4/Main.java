package actividad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import actividad3.Libro;

public class Main {
	/*Crea una clase Empleado con los atributos nombre, salario y departamento. Implementa la interfaz Comparable para ordenar 
	 * los empleados primero por salario en orden ascendente, y si dos empleados tienen el mismo salario, ordénalos por nombre en 
	 * orden alfabético. Crea una lista de empleados, ordénala e imprime la lista ordenada.*/
	
	public static void main(String[] args) {
		// CREAMOS UNA LISTA QUE ALMACENA LOS EMPLEADOS
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();

		// AÑADO EMPLEADOS A LA LISTA
		listaEmpleados.add(new Empleado("Pepe", "Ingles", 1120));
		listaEmpleados.add(new Empleado("Pepe", "Matematicas", 2213.2));
		listaEmpleados.add(new Empleado("Ana", "Musica ", 1120));
		listaEmpleados.add(new Empleado("Laura", "desconocido", 2213.2));
		listaEmpleados.add(new Empleado("Omar", "Judo", 2200));
		listaEmpleados.add(new Empleado("Harry", "Quimia", 2200));

		// METODO Collections.sort QUE ORDENA LA LISTA de forma ASCENDENTE
		Collections.sort(listaEmpleados);

		// MOSTRAMOS EL RESULTADO ORDENADO DE FORMA DESCENDENTE POR PRECIO
		System.out.println("---------------------EMPLEADOS ORDENADOS POR SALARIO Y POR NOMBRE DE MENOR A MAYOR--------------------");
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}

	}

}
