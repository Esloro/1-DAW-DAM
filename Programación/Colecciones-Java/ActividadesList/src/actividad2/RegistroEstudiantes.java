package actividad2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RegistroEstudiantes {
	
	/*Desarrolla un programa en Java que permita registrar estudiantes en una clase. El programa debe permitir agregar estudiantes, buscar estudiantes 
	 * por nombre y mostrar todos los estudiantes registrados. Utiliza una LinkedList para almacenar los estudiantes.*/
	
	//Dos entradas Scanner una para numeros(sn) y otra para letras(sc)
		public static Scanner sc = new Scanner(System.in);
		public static Scanner sn = new Scanner(System.in);
		
		//LinkedList para gestionar el registro de estudiantes en una clase
		static List <Estudiantes> listaEstudiantes = new LinkedList <Estudiantes>();
		
	public static void main(String[] args) {
		
		menu();	
	}

	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar estudiante \n 2-Buscar estudiante por nombre \n 3-Mostrar estudiantes registrados \n 4-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				agregarEstudiante();
				break;
			case 2:
				buscarEstudiante();
				break;
			case 3:
				mostrarEstudiantes();
				break;
			case 4:
				salir();
				break;
			default:
				System.out.println("La opción introducida no es correcta vuelve a intentarlo");
				break;
			}
		} while (opcion != 4);
	}

	// MÉTODO QUE MUESTRA UN MENSAJE AL SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");

	}

	// MÉTODO PARA REGISTRAR NUEVOS ESTUDIANTES .add
	private static void agregarEstudiante() {
		System.out.println("Introduce el numero del curso del estudiante que quieres registrar");
		int curso = sn.nextInt();
		System.out.println("Introduce el nombre del estudiante que quieres registrar");
		String nombre = sc.nextLine();
		System.out.println("Introduce la edad del estudiante que quieres registrar");
		int edad = sn.nextInt();

		listaEstudiantes.add(new Estudiantes (curso, nombre, edad));
		System.out.println("El estudiante se ha agregado con exito ");

	}

	//MÉTODO PARA BUSCAR POR NOMBRE CON UN FOR EACH
	private static void buscarEstudiante() {
		System.out.println("Introduce el nombre del estudiante que quieres buscar");
		String nombreBuscar = sc.nextLine();
		boolean encontrado = false; // Boolean para verificar si se encontró el estudiante

		for (Estudiantes estudiante : listaEstudiantes) {
			if (estudiante.getNombre().equalsIgnoreCase(nombreBuscar)) {
				System.out.println(
						"Estudiante encontrado: " + estudiante.getNombre() + " Curso: " + estudiante.getCurso());
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("El alumno indicado no está registrado.");
		}
	}
	
	//MÉTODO PARA MOSTRAR LOS ESTUDIANTES REGISTRADOS CON UN FOR EACH
	private static void mostrarEstudiantes() {
		if (listaEstudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
		} else {
			for (Estudiantes estudiante : listaEstudiantes) {
				System.out.println("Nombres de los estudiantes registrados: " + estudiante);
			}
		}
	}

}

