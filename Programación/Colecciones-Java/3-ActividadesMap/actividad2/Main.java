package actividad2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	/* Crea un sistema de gestión de inventario para una tienda. Usa un TreeMap para almacenar los productos con sus precios, ordenados por el nombre del producto.
	 * Implementa un menú que permita: Añadir un nuevo producto y su precio. Actualizar el precio de un producto. 
	 * Eliminar un producto. Mostrar todos los productos ordenados por nombre.
	 */
	
	// DOS ENTRADAS SCANNER UNA PARA NUMEROS(SN) Y OTRA PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sn = new Scanner(System.in);

	// treeMap PARA GESTIONAR EL INVENTARIO DE UNA TIENDA CON SUS PRODUCTOS Y PRECIOS
	static Map<Producto, Double> mapProductos = new TreeMap<>();
	
	public static void main(String[] args) {
		menu();

		}
		//MÉTODO MENU CON UN SWITCH CON LAS OPCIONES QUE PUEDE ELEGIR EL USUARIO CADA UNA DESARROLLADAS DENTRO DE UN METODO
		private static void menu() {
			int opcion = 0;
			try {
			do {
				System.out.println("Elige una de las opciones: \n 1-Agregar Producto \n 2-Eliminar Producto \n 3-Actualizar Precio Producto  \n 4-Mostrar Productos  \n 5-Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1: 
					agregarProductos();
					break;
				case 2: 
					eliminarProductos();
					break;
				case 3: 
					actualizarProductos();
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
			boolean encontrado = false;
			for (Map.Entry<Producto, Double> entry : mapProductos.entrySet()) {
				if (entry.getKey().getNombre().equalsIgnoreCase(productoEliminar)) {
					mapProductos.remove(entry.getKey(), entry.getValue()); // INTRODUCIENDO DE NUEVO LA CLAVE Y EL VALOR SE ELIMINAN
					System.out.println("El producto " + productoEliminar + " ha sido eliminado con éxito");
					encontrado = true; // CAMBIO EL BOOLEAN A TRUE PORQUE HA ENCONTRADO EL NOMBRE DEL PRODUCTO
				}
			}
			if (!encontrado) { //SI NO LO ENCUENTRA ES QUE NO ESTÁ REGISTRADO EN LA LISTA Y MUESTRA UN MENSAJE
				System.out.println("No se ha podido eliminar. El nombre introducido no corresponde a ningún producto");
			}
		}
		
		//MÉTODO PARA ACTUALIZAR EL PRECIO DE UN PRODUCTOS 
		private static void actualizarProductos() {
			System.out.println("Introduce el nombre del producto que quieres actualizar");
			String productoBuscar = sc.nextLine();
			boolean encontrado = false; //CREO UN BOOLEANO PARA PODER INTRODUCIR UN MENSAJE SI ENCUENTRA O NO EL PRODUCTO
			for (Map.Entry<Producto, Double> entry : mapProductos.entrySet()) {
				if (entry.getKey().getNombre().equalsIgnoreCase(productoBuscar)) {	
					encontrado = true; // CAMBIO EL BOOLEAN A TRUE PORQUE HA ENCONTRADO EL NOMBRE DEL PRODUCTO
					System.out.println("Introduce su nuevo precio");
					double nuevoPrecio = sn.nextDouble();
					entry.setValue(nuevoPrecio);
					System.out.println("El nuevo precio del producto: " + productoBuscar + " es: " + nuevoPrecio);
				}
			}		
			if (!encontrado) {
				System.out.println("No queda stock del producto que buscas");	
			}
			
		}
		
		//MÉTODO PARA MOSTRAR LOS PRODUCTOS DEL INVENTARIO CON UN FOR EACH
		private static void mostrarProductos() {
			if(mapProductos.isEmpty()) {
				System.out.println("La lista está vacía, no hay productos en el inventario");
			} else {
				for (Map.Entry<Producto, Double> entry : mapProductos.entrySet()) {
					//System.out.println(mapProductos.toString());
					System.out.println(entry.toString());
				}
			}	
		}
		
		//MÉTODO PARA AGREGAR NUEVOS PRODUCTOS AL INVENTARIO PIDIENDO LOS DATOS POR CONSOLA
		private static void agregarProductos() {
			System.out.println("Introduce el nombre del producto que quieres agregar");
			String nombreProducto = sc.nextLine();
			System.out.println("Introduce el precio del producto que quieres agregar");
			double precioProducto = sn.nextDouble();
			Producto p1 = new Producto (nombreProducto);
			mapProductos.put(p1, precioProducto); //Agrego el nuevo producto con .put
			System.out.println("El producto ha sido agregado con éxito");
			
		}
		//MÉTODO QUE MUESTRA UN MENSAJE AL ELEGIR LA OPCION DE SALIR DEL PROGRAMA METODO QUE MUESTRA UN MENSAJE CON LA OPCIÓN SALIR DEL PROGRAMA
			private static void salir() {
				System.out.println("Fin del programa. Hasta pronto.");
				}


	}
