package actividad1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	/*Implementa una simulación de un sistema de atención al cliente utilizando una Queue. Cada cliente tiene un nombre y un número de ticket. 
	 * Los clientes se atienden en el orden en que llegan. Instrucciones:

	Crear una clase Cliente con atributos nombre y numeroTicket.
	Utilizar una Queue para manejar la cola de clientes.
	Permitir agregar clientes a la cola.
	Atender a los clientes en el orden en que llegaron, removiéndolos de la cola uno por uno.
	Mostrar el nombre del cliente que está siendo atendido.*/
	
	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// Queue PARA GESTIONAR LOS CLIENTES Y SUS TICKETS
	static Deque<Cliente> listaClientes = new ArrayDeque <>();
	
	public static void main(String[] args) {
		//AÑADO ALGUNOS CLIENTES PARA QUE NO EMPEICE LA COLA VACÍA CON .add
		listaClientes.add(new Cliente ("Ricardito"));
		listaClientes.add(new Cliente ("Juan Pedro"));
		listaClientes.add(new Cliente ("Margarita"));
		menu();
		

	}
	//METODO MENÚ CON CADA UNA DE LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO DESARROLLADAS EN METODOS 
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar Cliente \n 2-Atender y Eliminar Cliente \n 3-Mostrar Cliente \n 4-Salir");
			opcion = sn.nextInt();
			try {
				switch (opcion) {
				case 1:
					agregarCliente();
					break;
				case 2:
					eliminarCliente();
					break;
				case 3:
					mostrarCliente();
					break;
				case 4:
					salir();
					break;
				default:
					throw new IllegalArgumentException("La opción introducida no es correcta: " + opcion);
				}
			} catch (IllegalArgumentException i) {
				System.out.println(i.getMessage());
			}
		} while (opcion != 4);
	}
	
	//MÉTODO PARA AGREGAR NUEVOS CLIENTES A LA LISTA CON .add
	private static void agregarCliente() {
		System.out.println("Introduce el nombre del cliente que quieres añadir");
		String nombre = sc.nextLine();

		listaClientes.add(new Cliente(nombre));
		System.out.println("El cliente ha sido añadido con éxito");
	}

	// MÉTODO PARA ATENDER Y ELIMINAR AL CLIENTE EN ORDEN DE LA LISTA CON .peekFirst() muestra al primero
	private static void eliminarCliente() {
		if (listaClientes.isEmpty()) {
			System.out.println("La cola está vacía, espere al siguiente cliente");
		} else {

			System.out.println("Buenos días, este es el Servicio de atencion al cliente que desea "
					+ listaClientes.peekFirst().getNombre() + "\nHola, mi ticket es el numero "
					+ listaClientes.getFirst().getNumeroTicket());
			System.out
					.println("Encantados de atenderle " + listaClientes.pop().getNombre() + " ¡Que tenga un buen día!");

		}
	}

	// MÉTODO QUE MUESTRA AL CLIENTE QUE VA A SER ATENDIDO, EL PRIMERO EN LA COLA(con .peekFirst())
	private static void mostrarCliente() {
		if (listaClientes.isEmpty()) {
			System.out.println("La cola está vacía, espere al siguiente cliente");
		} else {
			System.out.println(listaClientes.peekFirst().getNombre());
		}
	}
	
	//MÉTODO QUE MUESTRA UN MENSAJE CUANDO EL USUARIO ELIGE LA OPCIÓN SALIR
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto");
		
	}

}

