package actividad2;

	
import java.util.PriorityQueue;
import java.util.Scanner;

	public class Main {
	/*Implementa un sistema de gestión de tareas utilizando una PriorityQueue. 
	 * Cada tarea tiene una descripción y una prioridad. Las tareas se procesan en orden de prioridad.

		Instrucciones:
		
		- Crear una clase Tarea con atributos descripcion y prioridad.
		- Utilizar una PriorityQueue para manejar las tareas.
		- Permitir agregar tareas a la cola.
		- Procesar las tareas en orden de prioridad.
		- Mostrar la descripción de la tarea que está siendo procesada..*/
		
		// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
		public static Scanner sc = new Scanner(System.in);
		public static Scanner sn = new Scanner(System.in);

		// PriorityQueue PARA GESTIONAR LOS CLIENTES Y SUS TICKETS
		static PriorityQueue<Tarea> listaTareas = new PriorityQueue <>();
		
		public static void main(String[] args) {
			//AÑADO ALGUNAS TAREAS PARA QUE NO EMPEICE LA COLA VACÍA CON .add
			listaTareas.add(new Tarea ("Realizar un ejercicio de programacion", Prioridad.BAJA));
			listaTareas.add(new Tarea("Preparar un informe de las prácticas", Prioridad.ALTA));
		    listaTareas.add(new Tarea("Revisar correos electrónicos", Prioridad.MEDIA));
			
			
			menu();
		}
		//METODO MENÚ CON CADA UNA DE LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO DESARROLLADAS EN METODOS 
		private static void menu() {
			int opcion = 0;
			do {
				System.out.println(
						"Elige una opcion: \n 1-Agregar Tareas \n 2-Procesar Tareas \n 3-Mostrar descripción de la tarea procesada \n 4-Salir");
				opcion = sn.nextInt();
				try {
					switch (opcion) {
					case 1:
						agregarTarea();
						break;
					case 2:
						eliminarTarea();
						break;
					case 3:
						mostrarTarea();
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
		
		//MÉTODO PARA AGREGAR NUEVAS TAREAS A LA LISTA CON .add
		private static void agregarTarea() {
			System.out.println("Introduce la descripcion de la tarea que quieres añadir");
			String descripcion = sc.nextLine();
			System.out.print("Ingrese la prioridad (BAJA, MEDIA, ALTA): ");
	        String prioridad = sc.nextLine().toUpperCase();
	        Prioridad prioridadTarea = Prioridad.valueOf(prioridad);
	        
			listaTareas.add(new Tarea(descripcion, prioridadTarea));
			System.out.println("LA tarea ha sido añadida con éxito");
		}

		// MÉTODO PARA PROCESAR TAREAS EN ORDEN DE PRIORIDAD 
		private static void eliminarTarea() {
			if (listaTareas.isEmpty()) {
				System.out.println("La lista está vacía, no quedan tareas");
			} else {

				System.out.println("La siguiente tarea a procesar por orden de prioridad es " + listaTareas.poll());

			}
		}

		// MÉTODO QUE MUESTRA AL LA DESCRIPCION DE LA TAREA QUE SE VA A PROCESAR (con .peek()) y getDescripcion());
		private static void mostrarTarea() {
			if (listaTareas.isEmpty()) {
				System.out.println("La lista está vacía, espere la siguiente tarea");
			} else {
				System.out.println(listaTareas.peek().getDescripcion());
			}
		}
		
		//MÉTODO QUE MUESTRA UN MENSAJE CUANDO EL USUARIO ELIGE LA OPCIÓN SALIR
		private static void salir() {
			System.out.println("Fin del programa. Hasta pronto");
			
		}

	}
