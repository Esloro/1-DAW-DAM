package actividad2;

import java.util.Scanner;
import java.util.Stack;

public class HistorialNavegacion {
	/*
	 * Implementa un sistema de historial de navegación que permita simular las operaciones de volver y adelantar en un navegador web utilizando dos pilas.
	 * Instrucciones: 
	 * Crea dos pilas: una para el historial de páginas visitadas y otra para las páginas adelantadas. Implementa un menú que permita:
	 * Visitar una nueva página. Volver a la página anterior. Adelantar a la siguiente página. Muestra el historial de navegación en cualquier momento.
	 */

	//DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC) 
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
	// Stack PARA EL HISTORIAL DE PAGINAS VISITADAS
	static Stack<String> visitadas = new Stack<String>();
	// Stack  PARA LAS PAGINAS ADELANTADAS
	static Stack<String> adelantadas = new Stack<String>();
	
	public static void main(String[] args) {
	
		menu();
	}
	//MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
		private static void menu() {
			int opcion =0;
			do {
				System.out.println("Elige una opcion: \n 1-Visitar nueva pagina \n 2-Volver página anterior \n 3-Visitar página siguiente  \n 4-Mostrar historial \n 5-Salir");	
				opcion = sn.nextInt();
				switch(opcion) {
				case 1:
					paginaNueva();
					break;
				case 2:
					paginaAnterior();
					break;
				case 3:
					paginaSiguiente();
					break;
				case 4:
					mostrarHistorial();
					break;
				case 5:
					salir();
					break;
				default:
					System.out.println("La opción introducida no es correcta vuelve a intentarlo");
					break;
				}
				}while(opcion!=5);
		}
		
		//METODO PARA MOSTRAR EL HISTORIAL
		private static void mostrarHistorial() {
			System.out.print("----------------Historial de Navegación-------------");
			if (visitadas.isEmpty()) {
				System.out.println("El historial está vacío");
			} else {
				System.out.println("Las paginas visitadas son:" + visitadas);
			}
		}
		
		//METODO PARA AVANZAR A LA PAGINA SIGUIENTE
		private static void paginaSiguiente() {
			if (!adelantadas.isEmpty()) {
				String paginaSiguiente = adelantadas.pop();
				visitadas.push(paginaSiguiente);
				System.out.println("La pagina siguente es: " + paginaSiguiente);
			} else {
				System.out.println("No hay más páginas a las que avanzar");
			}
		}
		//METODO PARA VOLVER A LA PAGINA ANTERIOR
		private static void paginaAnterior() {
			if (!visitadas.isEmpty()) { //SI NO ESTA VACIA (.isEmpty)
				String paginaActual = visitadas.pop(); // Creamos la variable para la pagina actual y la eliminamos de las visitadas con .pop
				adelantadas.push(paginaActual); // La añadimos en las paginas adelantadas para poder visitarla

				if (!visitadas.isEmpty()) {
					System.out.println("La pagina anterior es: " + visitadas.peek());//Devuelve el ultimo registro .peek
				} else {
					System.out.println("No hay más páginas a las que volver.");
				}
			} else {
				System.out.println("No hay páginas anteriores a las que volver.");
			}

		}
	//METODO PARA IR A UNA PAGINA NUEVA
	private static void paginaNueva() {
		System.out.println("Introduce el nombre de la pagina que quieres visitar?");
		String nombrePagina = sc.nextLine();
		//visitadas.paginaNueva(nombrePagina);
		adelantadas.clear();//Estamos en la pagina actual y no hemos avanzado a ninguna mas con .clear se borra
        visitadas.push(nombrePagina); // La añadimos a las paginas visitadas
        
    }
	
	
	//METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
		}


}
