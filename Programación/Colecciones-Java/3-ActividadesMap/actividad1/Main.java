package actividad1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	/* Crea un sistema para registrar estudiantes y sus calificaciones. Usa un HashMap para almacenar los nombres de los estudiantes como claves y sus
	 * calificaciones como valores. Implementa un menú que permita: Añadir un nuevo estudiante y su calificación. Actualizar la calificación de un estudiante.
	 * Eliminar un estudiante. Mostrar todos los estudiantes y sus calificaciones.
	 */

	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	static Scanner sc = new Scanner(System.in);
	static Scanner sn = new Scanner(System.in);

	// HashMap PARA GESTIONAR EL REGISTRO DE ESTUDIANTES Y SUS CALIFICACIONES
	static Map<Estudiante, Integer> mapEstudiantes = new HashMap<>();

	public static void main(String[] args) {

		// AÑADO ESTUDIANTES A LA LISTA
		Estudiante e1 = new Estudiante("Lucas", "Perez");
		mapEstudiantes.put(e1, 7);
		Estudiante e2 = new Estudiante("Gonzalo", "Lozano");
		mapEstudiantes.put(e2, 9);

		menu();

	}

	// MÉTODO MENU CON UN SWITCH CON LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DESARROLLADAS DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		try {
			do {
				System.out.println(
						"Elige una de las opciones: \n 1-Agregar Estudiante \n 2-Actualizar Calificacion \n 3-Eliminar Estudiante  \n 4-Mostrar Estudiantes  \n 5-Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					agregarEstudiante();
					break;
				case 2:
					actualizarCalificacion();
					break;
				case 3:
					eliminarEstudiante();
					break;
				case 4:
					mostrarEstudiante();
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

	// MÉTODO PARA MOSTRAR DATOS DE LOS ESTUDIANTES
	private static void mostrarEstudiante() {
		for (Map.Entry<Estudiante, Integer> entry : mapEstudiantes.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	// MÉTODO PARA ELIMINAR ESTUDIANTES
	private static void eliminarEstudiante() {
		System.out.println("Introduce el nombre del estudiante que quieres eliminar");
		String nombreEliminar = sc.nextLine();
		System.out.println("Introduce su apellido");
		String apellidoEliminar = sc.nextLine();
		boolean encontrado = false;
		for (Map.Entry<Estudiante, Integer> entry : mapEstudiantes.entrySet()) {
			if (entry.getKey().getNombre().equalsIgnoreCase(nombreEliminar) && entry.getKey().getApellido().equalsIgnoreCase(apellidoEliminar)) {
				mapEstudiantes.remove(entry.getKey(), entry.getValue()); // INTRODUCIENDO DE NUEVO LA CLAVE Y EL VALOR SE ELIMINAN
				System.out.println("Se ha eliminado el estudiante");
				encontrado = true; // CAMBIO EL BOOLEAN A TRUE PORQUE HA ENCONTRADO EL NOMBRE Y APELLIDO
			}
		}
		if (!encontrado) {
			System.out.println("No se ha podido eliminar. El nombre introducido no corresponde a ningún estudiante");
		}
	}

	// MÉTODO PARA ACTUALIZAR LA CALIFICACION DE LOS ESTUDIANTES
	private static void actualizarCalificacion() {
		System.out.println("Introduce el nombre del estudiante que quieres actualizar la nota");
		String nombreActualizar = sc.nextLine();
		System.out.println("Introduce su apellido");
		String apellidoActualizar = sc.nextLine();
		boolean encontrado = false;
		for (Map.Entry<Estudiante, Integer> entry : mapEstudiantes.entrySet()) {
			if (entry.getKey().getNombre().equalsIgnoreCase(nombreActualizar) && entry.getKey().getApellido().equalsIgnoreCase(apellidoActualizar)) {
				System.out.println("Introduce la nueva nota");
				int nuevaNota = sn.nextInt();
				entry.setValue(nuevaNota);
				System.out.println("Se ha actualizado su nota");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("El nombre introducido no corresponde a ningún estudiante");
		}
	}

	// MÉTODO PARA AGREGAR UN NUEVO ESTUDIANTE
	private static void agregarEstudiante() {
		System.out.println("Introduce el nombre del estudiante que quieres agregar");
		String nombre = sc.nextLine();
		System.out.println("Introduce el apellido del estudiante que quieres agregar");
		String apellido = sc.nextLine();
		Estudiante e3 = new Estudiante(nombre, apellido);
		System.out.println("Introduce su nota en número entero");
		int nota = sn.nextInt();
		mapEstudiantes.put(e3, nota); // CON EL METODO .put SE AÑADE EL NUEVO ESTUDIANTE CON UNA CLAVE(nombre y apellido) Y UN VALOR(nota)

		System.out.println("El estudiante " + e3 + " se ha añadido con éxito.");
	}

}
