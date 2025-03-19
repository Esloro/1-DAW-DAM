package actividad3;

public class Mision implements Comparable<Mision> {
	//ATRIBUTOS DE LA CLASE MISION, PRIORIDAD(Clase Enum)
	private String nombre;
	private Prioridad nivelPrioridad;
	
	//CONSTRUCTOR COMPLETO Y VACIO
	public Mision(String nombre, Prioridad nivelPrioridad) {
		this.nombre = nombre;
		this.nivelPrioridad = nivelPrioridad;
	}
	
	public Mision() {
		
	}

	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Prioridad getNivelPrioridad() {
		return nivelPrioridad;
	}

	public void setNivelPrioridad(Prioridad nivelPrioridad) {
		this.nivelPrioridad = nivelPrioridad;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		return "Mision [nombre=" + nombre + ", nivelPrioridad=" + nivelPrioridad + "]";
	}
	
	//Indicamos el parametro por el que vamos a ordenar los objetos de esta clase
	@Override
	public int compareTo(Mision otra) {
		int compararPrioridad =  this.nivelPrioridad.compareTo(otra.nivelPrioridad);
		
		if (compararPrioridad == 0) {//Si es 0 es que el nivel de prioridad es igual por tanto comparamos por nombre
			 return this.nombre.compareToIgnoreCase(otra.nombre);
		}
		return compararPrioridad;
	}
	
}
