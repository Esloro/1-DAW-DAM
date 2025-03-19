package actividad2;

public class Estudiante implements Comparable<Estudiante>{ //SE IMPLEMENTA  LA INTERFAZ COMPARABLE to DE JAVA
	//ATRIBUTOS DE LA CLASE ESTUDIANTES
	private String nombre;
	private int nota;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", nota=" + nota + "]";
	}
	//Indicamos el parametro por el que vamos a ordenar los objetos de esta clase
	@Override
	public int compareTo(Estudiante otro) {
		return Double.compare(this.nota, otro.nota);
	}
	
	
}
