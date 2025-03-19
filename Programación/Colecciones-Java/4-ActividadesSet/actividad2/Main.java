package actividad2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	/*Crea un sistema para gestionar un inventario de disfraces que los agentes de la T.I.A., Mortadelo y Filemón, utilizan. 
	 * Usa dos LinkedHashSet para mantener el orden de inserción de los disfraces de cada agente. El sistema debe permitir añadir disfraces a cada agente, 
	 * eliminar disfraces, y listar los disfraces únicos de cada agente así como los disfraces que tienen en común.
	 * Implementa un menú que permita: Añadir un nuevo disfraz a Mortadelo o a Filemón. Eliminar un disfraz de Mortadelo o de Filemón. 
	 * Mostrar todos los disfraces de Mortadelo. Mostrar todos los disfraces de Filemón. Mostrar los disfraces que tienen en común.*/
	
	//DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC) 
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
			
	//TreeSet PARA GESTIONAR UN INVENTARIO DE DISFRACES DE LOS AGENTES DE LA T.I.A (Mortadelo y Filemón)
	static Set <String> disfraces = new LinkedHashSet <>();
	static Set<String> mortadelo = new LinkedHashSet<>();
	static Set<String> filemon = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		//AÑADO ALGUNOS DISFRACES DE PRUEBA 
		mortadelo.add("apicultor");
		mortadelo.add("jardinero");
		mortadelo.add("programador");
		
		filemon.add("pintor");
		filemon.add("apicultor");
		filemon.add("bibliotecario");
		//LOS AÑADO TODOS A LA LISTA DE DISFRACES PARA PODER MOSTRAR DESPUES LOS COMUNES
		disfraces.addAll(filemon);
		disfraces.addAll(mortadelo);
		
		menu();
		
	}
	
	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar Disfraces \n 2-Eliminar Disfraces \n 3-Mostrar Disfraces \n 4-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				agregarDisfraces();
				break;
			case 2:
				eliminarDisfraces();
				break;
			case 3:
				mostrarDisfraces();
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

	//METODO QUE MUESTRA LOS DISFRACES COMUNES Y LOS DE MORTADELO O FILEMON
	private static void mostrarDisfraces() {
		if (disfraces.isEmpty()) { //SI LA LISTA ESTA VACIA NO SE MUESTRA NADA
			System.out.println("No hay disfraces registrados");
		} else {
			System.out.println("Que disfraces quieres ver, los de Mortadelo o Filemon");
			String nombre = sc.nextLine();
			System.out.println("Estos son los disfraces de " + nombre);
			if (nombre.equalsIgnoreCase("mortadelo")) {
				for (String string : mortadelo) {
					System.out.println(string);
				}
			} else if (nombre.equalsIgnoreCase("filemon")) {
				for (String string : filemon) {
					System.out.println(string);
				}
			} else {
				System.out.println("El nombre introducido no pertenece a ningún agente");
			}
			//MOSTRAMOS LOS DISFRACES EN COMUN
			System.out.println("--------------------------------------------------------");
			System.out.println("Los disfraces en común son");
			disfraces.retainAll(filemon); //CON EL METODO retainAll se añaden los de cada uno y como es un SET no se duplican
			disfraces.retainAll(mortadelo);
			for (String string : disfraces) {
				System.out.println(string);
			}
		}

	}
		
	// METODO QUE ELIMINA UN DISFRAZ DE LA LISTA .remove
	private static void eliminarDisfraces() {
		System.out.println("A quien le quieres eliminar un disfraz, a Mortadelo o Filemon");
		String nombre = sc.nextLine();
		if(nombre.equalsIgnoreCase("mortadelo")) {
			System.out.println("Introduce el nombre del disfraz");
			String nombreDisfraz = sc.nextLine();
			mortadelo.remove(nombreDisfraz); //SE ELIMINA EL DISFRAZ 
			System.out.println("El disfraz ha sido eliminado correctamente");
		} else if (nombre.equalsIgnoreCase("filemon")){
			System.out.println("Introduce el nombre del disfraz");
			String nombreDisfraz = sc.nextLine();
			filemon.remove(nombreDisfraz); //SE ELIMINA EL DISFRAZ 
			System.out.println("El disfraz ha sido eliminado correctamente");
		} else {
			System.out.println("El nombre introducido no pertenece a ningún agente");
		}
		
	}

	// METODO QUE AGREGA UN NUEVO DISFRAZ A LA LISTA DE UNO DE LOS AGENTES QUE ELIJA  .add
	private static void agregarDisfraces() {
		System.out.println("A quien le quieres añadir un disfraz, a Mortadelo o Filemon");
		String nombre = sc.nextLine();
		if(nombre.equalsIgnoreCase("mortadelo")) {
			System.out.println("Introduce el nombre del disfraz");
			String nombreDisfraz = sc.nextLine();
			mortadelo.add(nombreDisfraz);
			disfraces.addAll(mortadelo); //AÑADO TODOS A LA LOSTA DISFRACES PARA PODER MOSTRAR LOS COMUNES
			System.out.println("El disfraz ha sido agregado correctamente");
		} else if (nombre.equalsIgnoreCase("filemon")){
			System.out.println("Introduce el nombre del disfraz");
			String nombreDisfraz = sc.nextLine();
			filemon.add(nombreDisfraz);
			disfraces.addAll(filemon);  //AÑADO TODOS A LA LOSTA DISFRACES PARA PODER MOSTRAR LOS COMUNES
			System.out.println("El disfraz ha sido agregado correctamente");
		} else {
			System.out.println("El nombre introducido no pertenece a ningún agente");
		}
		
	}

	// MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
	}

}
