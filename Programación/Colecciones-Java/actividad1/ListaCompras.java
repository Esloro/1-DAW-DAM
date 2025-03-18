package actividad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Desarrolla un programa en Java que permita gestionar una lista de compras. El programa debe permitir agregar productos, eliminar productos y mostrar 
 * todos los productos de la lista. Utiliza una ArrayList para almacenar los productos. Digamos que los productos son solo String. */

public class ListaCompras {
	// Dos entradas Scanner una para numeros(sn) y otra para letras(sc)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);
	// ArrayList para gestionar la lista de la compra
	static List<String> listaCompra = new ArrayList<>();

	public static void main(String[] args) {
		// Método menu donde se incluyen todas las opciones
		menu();

	}

	// MENU CON UN SWITCH CON TODAS LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DENTRO DE UN METODO
	private static void menu() {
		int opcion = 0;
		do {
			System.out.println(
					"Elige una opcion: \n 1-Agregar productos \n 2-Eliminar productos \n 3-Mostrar productos \n 4-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				agregarProducto();
				break;
			case 2:
				eliminarProducto();
				break;
			case 3:
				mostrarProducto();
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

	// Método para salir del programa
	private static void salir() {
		System.out.println("Fin del programa. Hasta pronto.");

	}

	// Método para mostrar todos los productos de la lista con un for each
	private static void mostrarProducto() {
		for (String productos : listaCompra) {
			System.out.println("Los productos de la lista son: " + productos);
		}

	}

	// Método para eliminar el producto que introduzca el usuario por consola con el
	// metodo .remove y con .contains para comprobar si esta en la lista
	private static void eliminarProducto() {
		System.out.println("Escribe el nombre del producto que quieres eliminar");
		String productoBorrar = sc.nextLine().toUpperCase();
		if (listaCompra.contains(productoBorrar)) {
			listaCompra.remove(productoBorrar);
			System.out.println("El producto: " + productoBorrar + " ha sido eliminado.");
		} else {
			System.out.println("El producto: " + productoBorrar + " no está en la lista.");
		}
	}
	// TAMBIEN PODRÍA UTILIZAR EL ITERATOR PARA ELIMINARLO YA QUE SE MODIFICA LA LISTA Y NO SE PUEDE USAR FOR EACH
	/*
	 * Iterator<String> iterator = lista.iterator(); while (iterator.hasNext()) {
	 * String element = iterator.next(); if (element.equals(borrar)) {
	 * iterator.remove(); // SE ELIMINA EL PRODUCTO DE LA LISTA. } }
	 */

	// Metodo para agregar el producto que introduzca el usuario por consola con el metodo .add
	private static void agregarProducto() {
		System.out.println("Escribe el nombre del producto que quieres añadir");
		String producto = sc.nextLine().toUpperCase();

		if (listaCompra.contains(producto)) {
			System.out.println("Error, el producto ya está registrado en la lista.");
		} else {
			listaCompra.add(producto);
			System.out.println("El producto " + producto + " ha sido añadido correctamente.");
		}
	}

}
