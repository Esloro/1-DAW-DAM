package actividad1;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class CadenaParentesis {
	/* Implementa un programa que verifique si una cadena de paréntesis está balanceada. Una cadena está balanceada si cada paréntesis de apertura tiene
	 * un paréntesis de cierre correspondiente y los paréntesis están correctamente anidados.
	 * 
	 * Instrucciones: Lee una cadena desde la consola. Utiliza una pila para verificar si los paréntesis están balanceados. Imprime true si la cadena está
	 * balanceada, de lo contrario, imprime false. Ejemplo: Entrada: (1+(2*3)+((8)/4))+1  Salida: true Entrada: (1+(2*3)+((8)/4)))+1 Salida: false
	 */

	// ENTRADA SCANNER PARA LETRAS(SC)
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Stack de Char PARA VERIFICAR SI UNA CADENA DE PARENTESIS ESTÁ BALANCEADA
		Stack<Character> miPila = new Stack<>();

		// PEDIMOS POR CONSOLA UNA CADENA
		System.out.println("Introduce una cadena que incluya parentesis");
		String cadena = sc.nextLine();

		try {
			for (int i = 0; i < cadena.length(); i++) {
				char auxiliar = cadena.charAt(i);

				if (auxiliar == '(') {
					miPila.push(auxiliar);// AÑADIMOS UN PARENTESIS
				} else if (auxiliar == ')') {
					miPila.isEmpty();
					miPila.pop(); // REMUEVE Y DEVUELVE EL ELEMENTO DE LA PARTE SUPERIOR Y SI ESTA VACIO LANZA EXCEPCION
				}
			}
			// RECOJO LA EXCEPCION QUE LANZA .POP SI ESTÁ VACIA LA LISTA
		} catch (EmptyStackException e) {
			System.out.println("La pila está vacía");
		}
		System.out.println(miPila);
		
		// isEmpty() NOS DA TRUE O FALSE SI LA PILA(Stack) ESTA VACIA
		System.out.println("Está la cadena vacía? --> " + miPila.isEmpty() + " --> Si es true la cadena esta balanceada, si es false no.");
	}
}
