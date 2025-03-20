package actividad3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	/* Crea un sistema de autenticación para una aplicación web. Usa un LinkedHashMap para almacenar los nombres de usuario como claves y las
	 * contraseñas como valores. Implementa un menú que permita: Registrar un nuevo usuario y su contraseña. Iniciar sesión con un usuario existente. 
	 * Eliminar un usuario. Mostrar todos los usuarios en el orden en que fueron registrados.
	 */
	
	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// LinkedHashMap PARA GESTIONAR EL INVENTARIO DE UNA TIENDA CON SUS PRODUCTOS Y PRECIOS
	static Map <Usuario, String> mapUsuarios = new LinkedHashMap<>();
	
	public static void main(String[] args) {
		menu();

	}

	// MÉTODO MENU CON UN SWITCH CON LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DESARROLLADAS DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		try {
			do {
				System.out.println(
						"Elige una de las opciones: \n 1-Agregar Usuario \n 2-Iniciar Sesion \n 3-Eliminar Usuario  \n 4-Mostrar Usuarios  \n 5-Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					agregarUsuario();
					break;
				case 2:
					inicioSesion();
					break;
				case 3:
					eliminarUsuario();
					break;
				case 4:
					mostrarUsuario();
					break;
				case 5:
					salir();
					break;
				default:
					throw new IllegalArgumentException(
							"La opción introducida no es correcta. Vuelve a intentarlo " + opcion);
				}
			} while (opcion != 5);
		} catch (IllegalArgumentException e) {
			System.out.println("La opción introducida no es correcta. Vuelve a intentarlo ");
		}
	}

	// MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");
	}

	// MÉTODO PARA MOSTRAR DATOS DE LOS Usuarios
	private static void mostrarUsuario() {
		for (Map.Entry<Usuario, String> entry : mapUsuarios.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	// MÉTODO PARA ELIMINAR Usuarios
	private static void eliminarUsuario() {
		System.out.println("Introduce el nombre del Usuario que quieres eliminar");
		String nombreEliminar = sc.nextLine();
		boolean encontrado = false;
		for (Map.Entry<Usuario, String> entry : mapUsuarios.entrySet()) {
			if (entry.getKey().getNombre().equalsIgnoreCase(nombreEliminar)) {
				mapUsuarios.remove(entry.getKey()); // INTRODUCIENDO DE NUEVO LA CLAVE (Usuario) Y SE ELIMINAN
				System.out.println("Se ha eliminado el Usuario y su Contraseña");
				encontrado = true; // CAMBIO EL BOOLEAN A TRUE PORQUE HA ENCONTRADO EL NOMBRE Y APELLIDO
			}
		}
		if (!encontrado) {
			System.out.println("No se ha podido eliminar. El nombre introducido no corresponde a ningún Usuario");
		}
	}

	// MÉTODO PARA INICIAR SESION CON UN USUARIO EXISTENTE	
	private static void inicioSesion() {
		String nombreInicio = JOptionPane.showInputDialog("Introduce el nombre de Usuario "); //HE AÑADIDO JOptionPane.showInputDialog QUE MUESTRA UNA PANTALLA PARA INTRODUCIR EL USUARIO
		boolean encontrado = false;

		for (Map.Entry<Usuario, String> entry : mapUsuarios.entrySet()) {
			if (nombreInicio.equalsIgnoreCase(entry.getKey().getNombre())) { // SI EL NOMBRE COINCIDE QUE INTRODUZCA LA CONTRASEÑA
				encontrado = true;
				String contrasenia = JOptionPane.showInputDialog("Introduce la contraseña");
				if (contrasenia.equals(entry.getValue())) { //SI LA CONTRASEÑA COINCIDE MUESTRA UN MENSAJE DE VERIFICACION y SINO UNO DE RECHAZO
					System.out.println("Contraseña correcta. Acceso permitido");
				} else {
					System.out.println("La contraseña no es correcta.");
				}
			}
		}
		if (!encontrado) {
			System.out.println("El nombre introducido no corresponde a ningún Usuario");
		}
	}

	// MÉTODO PARA AGREGAR UN NUEVO Usuario
	private static void agregarUsuario() {
		System.out.println("Introduce el nombre del Usuario que quieres agregar");
		String nombre = sc.nextLine();
		Usuario e3 = new Usuario(nombre);
		System.out.println("Introduce su CONTRASEÑA");
		String contrasenia = sc.nextLine();
		mapUsuarios.put(e3, contrasenia); // CON EL METODO .put SE AÑADE EL NUEVO Usuario CON UNA CLAVE(nombre) Y UN VALOR(contrasenia)

		System.out.println("El Usuario " + e3 + " se ha añadido con éxito.");
	}

}
