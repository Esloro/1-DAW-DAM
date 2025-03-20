package actividad3;

import java.util.Objects;

public class Usuario {
	//ATRIBUTOS DE LA CLASE ESTUDIANTES
	private String nombre;
	
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Usuario() {
		
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}
	
	//SE SOBREESCRIBEN LOS METODOS .hasCode y .equals PARA ASEGURAR QUE LAS CLAVES SON UNICAS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass()) //COMPRUEBA SI ES OBJETO ES NULO 
			return false;
		
		Usuario otro = (Usuario) obj;
		return  Objects.equals(nombre, otro.nombre);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash( nombre);
	}
}
