package actividad1;

import java.util.Objects;

public class Estudiante {
	//ATRIBUTOS DE LA CLASE ESTUDIANTES
	private String nombre;
	private String apellido;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	//SE SOBREESCRIBEN LOS METODOS .hasCode y .equals PARA ASEGURAR QUE LAS CLAVES SON UNICAS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass()) //COMPRUEBA SI ES OBJETO ES NULO 
			return false;
		
		Estudiante otro = (Estudiante) obj;
		return Objects.equals(apellido, otro.apellido) && Objects.equals(nombre, otro.nombre);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}
}
