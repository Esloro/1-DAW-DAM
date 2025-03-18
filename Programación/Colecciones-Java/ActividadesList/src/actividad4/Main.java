package actividad4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	/*Desarrolla un programa en Java que permita gestionar el inventario de una tienda. El programa debe permitir agregar productos, eliminar productos, 
	 * buscar productos por nombre y mostrar todos los productos del inventario. Cada producto debe tener un nombre, una categoría y un precio. 
	 * Utiliza una LinkedList para almacenar los productos.*/
	
	//DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC) 
	 static Scanner sc = new Scanner(System.in);
	 static Scanner sn = new Scanner(System.in);
			
	//LinkedList PARA GESTIONAR EL INVENTARIO DE UNA TIENDA 
	static LinkedList<Producto> listaProductos = new LinkedList<>();
	 
	public static void main(String[] args) {
		menu();

	}

	private static void menu() {
		int opcion = 0;
		try {
		do {
			System.out.println("Elige una de las opciones: \n 1-Agregar Producto \n 2-Eliminar Producto \n 3-Buscar Producto  \n 4-Mostrar Productos  \n 5-Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1: 
				agregarProductos();
				break;
			case 2: 
				eliminarProductos();
				break;
			case 3: 
				buscarProductos();
				break;
			case 4: 
				mostrarProductos();
				break;
			case 5: 
				salir();
				break;
			default:
				throw new IllegalArgumentException("La opción introducida no es correcta. Vuelve a intentarlo " + opcion);
				
			}
			
		}while(opcion !=5);
		}catch (IllegalArgumentException e){
			System.out.println("La opción introducida no es correcta. Vuelve a intentarlo ");
		}
	}

	//MÉTODO PARA ELIMINAR PRODUCTOS
	private static void eliminarProductos() {
		System.out.println("Introduce el nombre del producto que quieres eliminar");
		String productoEliminar = sc.nextLine();
		Iterator<Producto> iter = listaProductos.iterator();//UTILIZO Iterator YA QUE SE VA A MODIFICAR LA LISTA
		while (iter.hasNext()) {
			Producto producto = (Producto) iter.next();
			if(producto.getNombre().equalsIgnoreCase(productoEliminar)) { //SI EL NOMBRE COINCIDE LO ELIMINAMOS CON iter.REMOVE
				iter.remove();
				System.out.println("El producto " + productoEliminar + " ha sido eliminado con éxito");
			}
		}
	}
	//MÉTODO PARA BUSCAR PRODUCTOS POR NOMBRE
	private static void buscarProductos() {
		System.out.println("Introduce el nombre del producto que quieres buscar");
		String productoBuscar = sc.nextLine();
		boolean encontrado = false; //CREO UN BOOLEANO PARA PODER INTRODUCIR UN MENSAJE SI ENCUENTRA O NO EL PRODUCTO
		for (Producto producto : listaProductos) {
			if(producto.getNombre().equalsIgnoreCase(productoBuscar)) {
				System.out.println("Busqueda realizada con éxito: " + producto);
				encontrado = true;
			} 
		} 
		if (!encontrado) {
			System.out.println("No queda stock del producto que buscas");	
		}
		
	}
	//MÉTODO PARA MOSTRAR LOS PRODUCTOS DEL INVENTARIO CON UN FOR EACH
	private static void mostrarProductos() {
		for (Producto producto : listaProductos) {
			System.out.println("Los productos del inventario son:" + producto);
		}
		
	}
	//MÉTODO PARA AGREGAR NUEVOS PRODUCTOS AL INVENTARIO PIDIENDO LOS DATOS POR CONSOLA
	private static void agregarProductos() {
		System.out.println("Introduce el nombre del producto que quieres agregar");
		String nombreProducto = sc.nextLine();
		System.out.println("A que categoria pertenece: ELECTRONICA, ROPA, ALIMENTACION, MASCOTAS, LIMPIEZA");
		Categoria categoria = Categoria.valueOf(sc.nextLine().toUpperCase());	//LE ASIGNO EL VALOR Y LO CONVIERTO A MAYUSCULAS PARA QUE NO DE ERROR
		System.out.println("Introduce el precio del producto que quieres agregar");
		double precioProducto = sn.nextDouble();
		
		listaProductos.add(new Producto(nombreProducto, categoria, precioProducto)); //Agrego el nuevo producto
		System.out.println("El producto ha sido agregado con éxito");
		
	}
	//MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA
	//METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
		private static void salir() {
			System.out.println("Fin del programa. Hasta pronto.");
			}


}

 