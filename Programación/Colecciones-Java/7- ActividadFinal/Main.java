/** @author Esmeralda López Rodero **/

package coleccionesFinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// ArrayList PARA GESTIONAR LA INFORMACION DEL PERSONAL QUE PUEDE SER PERSONAL INTERNO O ESTUDIANTES
	static ArrayList<Personal> listaPersonal = new ArrayList<>();

	public static void main(String[] args) {
		menu();
	}

	/*
	 * METODO MENÚ CON CADA UNA DE LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO
	 * DESARROLLADAS EN METODOS
	 */
	private static void menu() {
		int opcion = 0;
		System.out.println("Bienvenido al sistema de gestión de personal y estudiantes.");
		do {
			System.out.println(" ");
			System.out.println(
					"Elige una opcion: \n 1-Agregar Persona \n 2-Eliminar Personas \n 3-Añadir Asignatura \n 4-Eliminar Asignaturas \n 5-Mostrar Informacion \n 6-Salir");
			opcion = sn.nextInt();
			try {
				switch (opcion) {
					case 1:
						agregarPersona();
						break;
					case 2:
						eliminarPersona();
						break;
					case 3:
						agregarAsignatura();
						break;
					case 4:
						eliminarAsignatura();
						break;
					case 5:
						mostrarInformacion();
						break;
					case 6:
						salir();
						break;
					default:
						throw new IllegalArgumentException("La opción introducida no es correcta: " + opcion);
				}
			} catch (IllegalArgumentException i) {
				System.out.println(i.getMessage());
			}
		} while (opcion != 6);
	}

	/*
	 * --METODO MOSTRAR INFORMACIÓN--
	 * -si es estudiante, muestra el nombre y las asignaturas que tiene registradas
	 * -si es personal, muestra el nombre y que es personal interno.
	 */
	private static void mostrarInformacion() {
		String respuesta = null;
		do {
			System.out.println("¿Quieres ver la información de: Estudiantes o Personal?");
			respuesta = sc.nextLine().toLowerCase();
			if (respuesta.equalsIgnoreCase("estudiante")) {
				mostrarEstudiantes();
			} else if (respuesta.equalsIgnoreCase("personal")) {
				mostrarPersonal();
			} else {
				System.out.println("La respuesta no es correcta, por favor, vuelve a intentarlo.");
			}
		} while (!(respuesta.equalsIgnoreCase("estudiante") || respuesta.equalsIgnoreCase("personal")));
	}

	/*
	 * --METODO ELIMINAR ASIGNATURA--
	 * Pide el nombre del estudiante, si existe pide el nombre de la asignatura
	 * y la elimina del mapa de asignaturas del estudiante.
	 */
	private static void eliminarAsignatura() {
		mostrarEstudiantes();
		boolean encontrado = false;
		System.out.println("\nIntroduce el nombre del estudiante al que quieres eliminar la asignatura");
		String nombreEstudiante = sc.nextLine();

		for (Personal personal : listaPersonal) {
			if (personal instanceof Estudiante && personal.getNombre().equalsIgnoreCase(nombreEstudiante)) {
				encontrado = true;
				Estudiante estudiante = (Estudiante) personal;

				if (estudiante.getAsignaturas().isEmpty()) {
					System.out.println("No tiene asignaturas registradas.");

				} else {
					System.out.println("Introduce el nombre de la asignatura que quieres eliminar");
					String asignaturaBorrar = sc.nextLine();
					estudiante.borrarAsignatura(asignaturaBorrar);
				}
				return;
			}
		}
		if (!encontrado) {
			System.out.println("En la lista no hay ningún estudiante con ese nombre.");
		}
	}

	/*
	 * --METODO AGREGAR ASIGNATURA--
	 * Recibe como parámetro el nombre del estudiante al que se le quiere añadir la
	 * asignatura y lo añade al mapa de asignaturas del estudiante.
	 */
	private static void agregarAsignatura() {
		mostrarEstudiantes();
		System.out.println("\nIntroduce el nombre del estudiante al que quieres añadir la asignatura");
		String nombreEstudiante = sc.nextLine();
		Boolean encontrado = false;
		Boolean asignaturaExiste = false;

		for (Personal personal : listaPersonal) {
			if (personal instanceof Estudiante && personal.getNombre().equalsIgnoreCase(nombreEstudiante)) {
				encontrado = true;
			}
			if (encontrado) {
				Estudiante estudiante = (Estudiante) personal;
				String asignatura = JOptionPane.showInputDialog("Introduce el nombre de la asignatura:");
				String profesor = JOptionPane.showInputDialog("Introduce el nombre del profesor:");
				String creditos = JOptionPane.showInputDialog("Introduce el numero de creditos de la asignatura");
				JOptionPane.showMessageDialog(null, "La asignatura, " + asignatura + ", se ha registrado con éxito.");
				
				Asignatura a = new Asignatura(asignatura, profesor, creditos);

				for (Asignatura as : estudiante.getAsignaturas().keySet()) {
					if (as.getNombre().equalsIgnoreCase(asignatura)) {
						asignaturaExiste = true;
						System.out.println("El estudiante ya ha registrado una asignatura con ese nombre.");
					}
				}
				if (asignaturaExiste == false) {
					System.out.println("Introduce el estado de la asignatura: SUPERADO, CURSADO, ABANDONADO");
					String estadoAsig = sc.nextLine().toUpperCase();
					EstadoAsignatura estado; 
					try{					
						estado = EstadoAsignatura.valueOf(estadoAsig);
					} catch (IllegalArgumentException e) {
						System.out.println("El estado de la asignatura no es válido. Introduce uno de los siguientes: SUPERADO, CURSADO, ABANDONADO.");
						return;
					}
					estudiante.agregarAsignatura(a, estado);
					System.out.println("¡La asignatura se ha registrado con éxito!");
				}
			}
		}
		if (!encontrado) {
			//encontrado=false;
			System.out.println("En la lista no hay ningún estudiante con ese nombre.");
		}
	}

	/*
	 * --METODO QUE ELIMINA A UNA PERSONA DE LA LISTA PERSONAL--
	 * Pide el nombre de la persona y si existe lo elimina
	 */
	private static void eliminarPersona() {
		mostrarPersonal();
		mostrarEstudiantes();
		System.out.print("\nIntroduce el nombre de la persona que quieres eliminar: ");
		String nombre = sc.nextLine();
		boolean encontrado = false;
		Iterator<Personal> iterator = listaPersonal.iterator();
		while (iterator.hasNext()) {
			Personal personal = iterator.next();
			if (personal.getNombre().equalsIgnoreCase(nombre)) {
				iterator.remove();
				System.out.println("La persona ha sido eliminada con éxito.");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado a la persona con ese nombre.");
		}
	}

	/*
	 * --MÉTODO AGREGAR PERSONA--
	 * Recibe como parámetro el nombre de la persona a añadir y
	 * lo añade a la listaPersonal como estudiante o personal interno.
	 */
	private static void agregarPersona() {
		System.out.println("\nIntroduce el nombre de la persona quieres agregar");
		String nombre = sc.nextLine();
		
		int respuesta = JOptionPane.showConfirmDialog(null, "¿El nombre pertenece a un estudiante?", "Confirmar", JOptionPane.YES_NO_OPTION);

			if (respuesta == JOptionPane.YES_OPTION) {
				listaPersonal.add(new Estudiante(nombre, "Estudiante"));
				System.out.println("Gracias, ha sido añadido como estudiante");

			} else if (respuesta == JOptionPane.NO_OPTION) {
				listaPersonal.add(new Personal(nombre, "personal interno"));
				System.out.println("Gracias, ha sido añadido al personal interno");
			}	
	}

	// MÉTODO QUE MUESTRA UN MENSAJE CUANDO EL USUARIO ELIGE LA OPCIÓN SALIR
	private static void salir() {
		System.out.println("\nFin del programa. Hasta pronto");
	}

	/* --METODO MOSTRAR SOLO PERSONAL INTERNO-- */
	private static void mostrarPersonal() {
		Boolean existe = false;
		System.out.println("\n---------- Listado del personal ----------");
		for (Personal personal : listaPersonal) {
			if (personal.clase.equalsIgnoreCase("personal interno")) {
				existe = true;
				System.out.println("Nombre: " + personal.getNombre() + "--> Personal interno");
			}
		}
		if (!existe) {
			System.out.println("La lista de personal interno está vacía.");
		}
	}

	/* --METODO MOSTRAR SOLO ESTUDIANTES-- */
	private static void mostrarEstudiantes() {
		System.out.println("\n---------- Lista de estudiantes ----------");
		for (Personal personal : listaPersonal) {
			if (personal instanceof Estudiante) {
				Estudiante estudiante = (Estudiante) personal;
				System.out.println("Nombre: " + estudiante.getNombre() + "--> Estudiante");
				if (estudiante.getAsignaturas().isEmpty()) {
					System.out.println("No tiene asignaturas registradas.");
				} else {
					System.out.println("Asignaturas registradas:");
					estudiante.mostrarAsignaturas();
				}
			}
		}
	}
}

