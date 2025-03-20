package actividad4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	/* Crea un sistema de gestión de biblioteca donde los libros se almacenen en un HashMap. La clave será un objeto Libro, que contendrá atributos 
	 * como título y autor. El valor será un entero que representa la cantidad de copias disponibles de ese libro. Implementa un menú que permita:
	 * Añadir un nuevo libro con su cantidad de copias. Actualizar la cantidad de copias de un libro. Eliminar un libro. Mostrar todos los libros y sus cantidades.
	 */
	
	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// LinkedHashMap PARA GESTIONAR EL INVENTARIO DE UNA TIENDA CON SUS PRODUCTOS Y PRECIOS
	static Map <Libro, Integer> mapLibros = new HashMap<>();
	
	public static void main(String[] args) {
		menu();

	}

	// MÉTODO MENU CON UN SWITCH CON LAS OPCIONES QUE PUEDE ELEGIR EL Libro CADA UNA DESARROLLADAS DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		try {
			do {
				System.out.println(
						"Elige una de las opciones: \n 1-Agregar Libro \n 2-Actualizar Copias \n 3-Eliminar Libro  \n 4-Mostrar Libros  \n 5-Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					agregarLibro();
					break;
				case 2:
					actualizarCopias();
					break;
				case 3:
					eliminarLibro();
					break;
				case 4:
					mostrarLibro();
					break;
				case 5:
					salir();
					break;
				default:
					throw new IllegalArgumentException(
							"La opción introducida no es correcta. Vuelve a intentarlo " + opcion);
				}
			} while (opcion != 5);
		} catch (IllegalArgumentException e) {
			System.out.println("La opción introducida no es correcta. Vuelve a intentarlo ");
		}
	}

	// MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
	}

	// MÉTODO PARA MOSTRAR DATOS DE LOS Libros CON UN FOR EACH 
	private static void mostrarLibro() {
		if(mapLibros.isEmpty()) {
			System.out.println("No hay libros registrados en la biblioteca");
		} else {
			for (Map.Entry<Libro, Integer> entry : mapLibros.entrySet()) {
				System.out.println(entry.getKey() + " Copias: " + entry.getValue());
			}
		}
		
	}

	// MÉTODO PARA ELIMINAR Libros
	private static void eliminarLibro() {
		System.out.println("Introduce el titulo del Libro que quieres eliminar");
		String tituloEliminar = sc.nextLine();
		boolean encontrado = false;
		for (Map.Entry<Libro, Integer> entry : mapLibros.entrySet()) {
			if (entry.getKey().getTitulo().equalsIgnoreCase(tituloEliminar)) {
				mapLibros.remove(entry.getKey()); // INTRODUCIENDO DE NUEVO LA CLAVE (Libro (titulo) SE ELIMINA CON .remove
				System.out.println("Se ha eliminado el Libro " + tituloEliminar);
				encontrado = true; // CAMBIO EL BOOLEAN A TRUE PORQUE HA ENCONTRADO EL TITULO DEL LIBRO
			}
		}
		if (!encontrado) {
			System.out.println("No se ha podido eliminar. El nombre introducido no corresponde a ningún Libro");
		}
	}

	// MÉTODO PARA ACTUALIZAR LAS COPIAS DE UN LIBRO
	private static void actualizarCopias() {
		System.out.println("Introduce el titulo del Libro que quieres modificar");
		String titulo = sc.nextLine();
		boolean encontrado = false;

		for (Map.Entry<Libro, Integer> entry : mapLibros.entrySet()) {
			if (titulo.equalsIgnoreCase(entry.getKey().getTitulo())) { // SI EL TITULO COINCIDE SE PIDE EL NUMERO DE COPIAS
				encontrado = true;
				System.out.println("Introduce el numero de copias que hay");
				int copiasNuevas = sn.nextInt();
				entry.setValue(copiasNuevas); // Y SEACTUALIZAN LAS COPIAS CON .setValue
				System.out.println("El libro " + titulo + " ahora tiene " + copiasNuevas + " copias.");
			}
		}

		if (!encontrado) {
			System.out.println("El título introducido no corresponde a ningún Libro");
		}
	}

	// MÉTODO PARA AGREGAR UN NUEVO Libro
	private static void agregarLibro() {
		System.out.println("Introduce el titulo del Libro que quieres agregar");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor del Libro que quieres agregar");
		String autor = sc.nextLine();
		Libro l1 = new Libro(titulo, autor);
		System.out.println("Introduce el numero de copias disponibles");
		int copias = sn.nextInt();
		mapLibros.put(l1, copias); // CON EL METODO .put SE AÑADE EL NUEVO Libro CON UNA CLAVE(titulo + autor) Y UN VALOR(copias)

		System.out.println("El " + l1 + " se ha añadido con éxito.");
	}

}
