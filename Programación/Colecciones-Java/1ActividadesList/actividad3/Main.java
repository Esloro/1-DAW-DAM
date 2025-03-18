package actividad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	/*  Desarrolla un programa en Java que permita gestionar tareas pendientes. El programa debe permitir agregar tareas, marcar tareas como completadas y
	 * mostrar todas las tareas indicando si están completadas o no. Deberemos poder también eliminar todas las tareas completadas o modificar el nombre de una
	 * tarea. Utiliza una ArrayList para almacenar las tareas. Las tareas tienen por lo menos un nombre y un estado por lo que deberíamos crear la clase tareas.
	 */

	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// ArrayList PARA GESTIONAR LAS TAREAS PENDIENTES
	static ArrayList<Tareas> listaTareas = new ArrayList<Tareas>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar Tareas \n 2-Marcar Tareas completadas \n 3-Mostrar Tareas  \n 4-Eliminar Tareas \n 5-Modificar Nombre \n 6-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				agregarTareas();
				break;
			case 2:
				marcarTareas();
				break;
			case 3:
				mostrarTareas();
				break;
			case 4:
				eliminarTareas();
				break;
			case 5:
				modificarTarea();
				break;
			case 6:
				salir();
				break;
			default:
				System.out.println("La opción introducida no es correcta vuelve a intentarlo");
				break;
			}
		} while (opcion != 6);
	}

	// METODO PARA MODIFICAR EL NOMBRE DE UNA TAREA (CON EL SET DENTRO DEL FOR EACH)
	private static void modificarTarea() {
		System.out.println("Escribe el nombre de la tarea que quieres modificar");
		String nombre = sc.nextLine();

		for (Tareas tarea : listaTareas) {
			if (tarea.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Escribe el nuevo nombre de la tarea que quieres modificar");
				String nuevoNombre = sc.nextLine();
				tarea.setNombre(nuevoNombre);
			}
		}
		
	}

	// METODO PARA SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto");

	}

	// METODO PARA ELIMINAR TAREAS CON ITERATOR Y REMOVE YA QUE SE VA A MODIFICAR
	private static void eliminarTareas() {
		System.out.println("Escribe el nombre de la tarea que quieres eliminar");
		String tareaEliminar = sc.nextLine();
		Iterator<Tareas> iter = listaTareas.iterator();
		while (iter.hasNext()) {
			Tareas tarea = iter.next();
			if (tarea.getNombre().equalsIgnoreCase(tareaEliminar)) {
				iter.remove();
				System.out.println("La tarea ha sido eliminada con exito");

			}else {
				System.out.println("La tarea no se pudo eliminar");
			}
		}

	}

	// METODO PARA MOSTRAR TAREAS CON UN FOR EACH
	private static void mostrarTareas() {
		if(listaTareas.size()==0) { //Si el tamaño es 0 significa que esta vacia
			System.out.println("La lista de tareas está vacía");
		} else {
			for (Tareas tareas : listaTareas) {
				System.out.println("Las tareas son: " + tareas);
			}
		}
		

	}

	// METODO PARA MARCAR TAREAS COMO COMPLETADAS con un for each y lo cambio con el set
	private static void marcarTareas() {
		System.out.println("Introduce el nombre de la tarea que se ha completado");
		String nombreTarea = sc.nextLine();

		for (Tareas tareas : listaTareas) {
			if (nombreTarea.equalsIgnoreCase(tareas.getNombre())) {
				tareas.setEstado(Estado.COMPLETADA);
			}
		}
	}

	// METODO PARA AGREGAR NUEVAS TAREAS
	private static void agregarTareas() {
		System.out.println("Introduce el nombre de la tarea que quieres agregar");
		String nombreTarea = sc.nextLine();
		System.out.println("Introduce el estado de la tarea que quieres agregar: PENDIENTE, EN_PROGRESO, COMPLETADA");
		Estado estado = Estado.valueOf(sc.nextLine().toUpperCase());

		listaTareas.add(new Tareas(nombreTarea, estado));

	}

}