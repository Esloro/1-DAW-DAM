package actividad1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class AgentesSecretos {
/*Crea un sistema para registrar agentes secretos de la T.I.A., asegurándote de que no haya duplicados. Usa un HashSet para almacenar los nombres de los agentes.
Implementa un menú que permita: Añadir un nuevo agente. Eliminar un agente. Mostrar todos los agentes registrados.*/
	
	//DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC) 
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
			
	//TreeSet PARA GESTIONAR UN REGISTRO DE AGENTES SECRETOS DE LA T.I.A
	static Set <String> agentes = new HashSet <>();
	public static void main(String[] args) {
		
		// AGREGAMOS LOS OBJETOS A LA LISTA SET
		agentes.add(new String ("Mortadelo"));
		agentes.add(new String ("Filemón"));
		agentes.add(new String ("Horacio"));
		agentes.add(new String ("Patricio"));
		agentes.add(new String ("Ricardo"));
		agentes.add(new String ("Ricardo"));
		
		menu();
		
	}
	
	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
		private static void menu() {
			int opcion = 0;
			do {
				System.out.println(
						"Elige una opcion: \n 1-Agregar Agentes \n 2-Eliminar Agentes \n 3-Mostrar Agentes \n 4-Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					agregarAgentes();
					break;
				case 2:
					eliminarAgentes();
					break;
				case 3:
					mostrarAgentes();
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

	private static void mostrarAgentes() {
		if(agentes.isEmpty()) {
			System.out.println("No hay agentes registrados");
		} else {
			for (String string : agentes) {
				System.out.println(string);
			}
		}
		}
	//METODO QUE ELIMINA UN AGENTE DE LA LISTA  .remove
	private static void eliminarAgentes() {
		System.out.println("Introduce el nombre del agente que quieres eliminar");
		String eliminarAgente = sc.nextLine();	
		agentes.remove(eliminarAgente);
		System.out.println("El agente ha sido eliminado correctamente");
			
		}
	
	//METODO QUE AGREGA UN NUEVO AGENTE A LA LISTA .add
	private static void agregarAgentes() {
		System.out.println("Introduce el nombre del nuevo agente");
		String nombreAgente = sc.nextLine();
		agentes.add(nombreAgente);
		System.out.println("El agente ha sido agregado correctamente");
		}
		

	// MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
	}


}
