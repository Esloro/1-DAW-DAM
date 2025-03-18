package actividad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	/*Prueba a crear una lista con las palabras: CaMión, camino, caminito, Ana, alba, África.  Ordena con el método sort y comprueba 
	 * si es correcta la ordenación, crea una lista similar y elimina los acentos de las palabras que los contengan y ordena de nuevo y 
	 * comprueba su ordenación. Por último pasa todas las letras a mayúsculas y compara y comprueba su ordenación. Saca tus propias conclusiones.*/
	
	public static void main(String[] args) {
		//UTILIZO Arrays.asList para inicilizarlo a la vez con todas las palabras
		List<String> listaPalabras = new ArrayList<>(Arrays.asList("CaMión", "camino", "caminito", "Ana", "alba", "África"));
		
		//CREO LA OTRA LISTA TAMBIEN SE PUEDE UTILIZAR .add AÑADIENDO CADA PALABRA  
		  List<String> listaDePalabras = new ArrayList<>();
		  
	        listaDePalabras.add("CaMion");
	        listaDePalabras.add("camino");
	        listaDePalabras.add("caminito");
	        listaDePalabras.add("Ana");
	        listaDePalabras.add("alba");
	        listaDePalabras.add("Africa");
	        
		//LISTA 3 CON LAS PALABRAS EN MAYUSCULAS
	    List<String> listaMayusculas = new ArrayList<>(Arrays.asList("CAMION", "CAMINO", "CAMINITO", "ANA", "ALBA", "AFRICA"));
	        
		Collections.sort(listaPalabras);
		System.out.println("Lista uno ordenada de forma ascendente" + listaPalabras);
		System.out.println("Lista dos ordenada de forma ascendente " + listaDePalabras);
		System.out.println("Lista dos ordenada de forma ascendente " + listaMayusculas);
		
		/* RESULTADOS
		 * Lista uno ordenada de forma ascendente[Ana, CaMión, alba, caminito, camino, África]
		 * Lista dos ordenada de forma ascendente [CaMion, camino, caminito, Ana, alba, Africa]
		 * Lista dos ordenada de forma ascendente [CAMION, CAMINO, CAMINITO, ANA, ALBA, AFRICA] */
		 

	}

}
