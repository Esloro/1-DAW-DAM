package actividad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	/*
	 * Crea un sistema para clasificar misiones de la T.I.A. usando un TreeSet. Cada misión tiene un nombre y un nivel de prioridad. Las misiones deben ser
	 * ordenadas primero por prioridad y luego por nombre. Implementa la clase  Mision que implemente Comparable<Mision>. Implementa un menú que permita:
	 * Añadir una nueva misión. Eliminar una misión. Mostrar todas las misiones ordenadas por prioridad y nombre.
	 */

	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// TreeSet PARA CLASIFICAR LAS MISIONES DE LA T.I.A
	static TreeSet<Mision> misiones = new TreeSet<Mision>();

	public static void main(String[] args) {
		menu();

	}
	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar Mision \n 2-Eliminar Mision  \n 3-Mostrar Mision  \n 4-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				agregarMision();
				break;
			case 2:
				eliminarMision();
				break;
			case 3:
				mostrarMision();
				break;
			case 4:
				salir();
				break;
			default:
				System.out.println("La opción introducida no es correcta vuelve a intentarlo");
				break;
			}
		} while (opcion != 6);
	}

	private static void mostrarMision() {
		if(misiones.isEmpty()) {
			System.out.println("La lista está vacía");
		} else {
			for (Mision mision : misiones) {
				System.out.println(mision);
			}
		}
		
	}
	//METODO PARA ELIMINAR MISIONES
	private static void eliminarMision() {
		System.out.println("Introduce el nombre de la mision que quieres eliminar");
		String eliminarMision = sc.nextLine();
		Iterator<Mision> iter = misiones.iterator();
		while (iter.hasNext()) {
			Mision mision = (Mision) iter.next();
			if(mision.getNombre().equalsIgnoreCase(eliminarMision)) {//SI LA LSTA CONTIENE UNA MISION CON ESE NOMBRE SE ELIMINA CON .REMOVE
				misiones.remove(mision);
				System.out.println("La misión ha sido eliminada");
			}
		}
	}
		

	//METODO PARA AGREGAR NUEVAS MISIONES
	private static void agregarMision() {
		System.out.println("Introduce el nombre de la mision que quieres agregar");
		String nombreMision = sc.nextLine();
		System.out.println("Introduce la prioridad de la mision: BAJA, MEDIA, ALTA");
		Prioridad prioridad = Prioridad.valueOf(sc.nextLine().toUpperCase());
		misiones.add(new Mision (nombreMision, prioridad));
		System.out.println("La misión se ha agregado con exito");
		
		
	}

	// MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
	}

}
