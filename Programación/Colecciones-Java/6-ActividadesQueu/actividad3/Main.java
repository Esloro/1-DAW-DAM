package actividad3;

	
import java.util.PriorityQueue;
import java.util.Scanner;

	public class Main {
	/*IImplementa un sistema de gestión de pacientes en un hospital utilizando una PriorityQueue. Cada paciente tiene un nombre y una gravedad de su condición. Los pacientes con mayor gravedad se atienden primero.

	Instrucciones:
	
	- Crear una clase Paciente con atributos nombre y gravedad.
	- Utilizar una PriorityQueue para manejar la cola de pacientes.
	- Permitir agregar pacientes a la cola.
	- Atender a los pacientes en orden de gravedad.
	- Mostrar el nombre del paciente que está siendo atendido..*/
		
		// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
		public static Scanner sc = new Scanner(System.in);
		public static Scanner sn = new Scanner(System.in);

		// PriorityQueue PARA GESTIONAR LOS CLIENTES 
		static PriorityQueue<Paciente> listaPacientes = new PriorityQueue <>();
		
		public static void main(String[] args) {
			//AÑADO ALGUNOS Pacientes PARA QUE NO EMPIECE LA COLA VACÍA CON .add
			listaPacientes.add(new Paciente ("Antonio", Gravedad.BAJA));
			listaPacientes.add(new Paciente("Bea", Gravedad.ALTA));
		    listaPacientes.add(new Paciente("Luis", Gravedad.MEDIA));
			
			
			menu();
		}
		//METODO MENÚ CON CADA UNA DE LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO DESARROLLADAS EN METODOS 
		private static void menu() {
			int opcion = 0;
			do {
				System.out.println(
						"Elige una opcion: \n 1-Agregar Pacientes \n 2-Atender Pacientes \n 3-Mostrar Paciente que esta siendo atendido \n 4-Salir");
				opcion = sn.nextInt();
				try {
					switch (opcion) {
					case 1:
						agregarPaciente();
						break;
					case 2:
						eliminarPaciente();
						break;
					case 3:
						mostrarPaciente();
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
		
		//MÉTODO PARA AGREGAR NUEVOS PacienteS A LA LISTA CON .add
		private static void agregarPaciente() {
			System.out.println("Introduce el nombre del Paciente que quieres añadir");
			String nombre = sc.nextLine();
			System.out.print("Ingrese la gravedad (BAJA, MEDIA, ALTA): ");
	        String gravedad = sc.nextLine().toUpperCase();
	        Gravedad gravedadPaciente = Gravedad.valueOf(gravedad);
	        
			listaPacientes.add(new Paciente(nombre, gravedadPaciente));
			System.out.println("El Paciente ha sido añadido con éxito");
		}

		// MÉTODO PARA ATENDER A LOS PACIENTES EN ORDEN DE GRAVEDAD 
		private static void eliminarPaciente() {
			if (listaPacientes.isEmpty()) {
				System.out.println("La lista está vacía, no quedan Pacientes para atender");
			} else {

				System.out.println("El siguiente Paciente por orden de gravedad es " + listaPacientes.poll());

			}
		}

		// MÉTODO QUE MUESTRA AL PACIENTE QUE SE VA A ATENDER (con .peek()) y getnombre());
		private static void mostrarPaciente() {
			if (listaPacientes.isEmpty()) {
				System.out.println("La lista está vacía, espere la siguiente Paciente");
			} else {
				System.out.println(listaPacientes.peek().getnombre());
			}
		}
		
		//MÉTODO QUE MUESTRA UN MENSAJE CUANDO EL USUARIO ELIGE LA OPCIÓN SALIR
		private static void salir() {
			System.out.println("Fin del programa. Hasta pronto");
			
		}

	}
