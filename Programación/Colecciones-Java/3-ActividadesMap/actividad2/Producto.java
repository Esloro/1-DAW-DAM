package actividad2;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
	//ATRIBUTOS DE LA CLASE PRODUCTO
	private String nombre;

	
	//CONSTRUCTORES
	public Producto(String nombre) {
		this.nombre = nombre;
		
	}
	
	public Producto() {
		
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + "]";
	}
	//SE SOBREESCRIBEN LOS METODOS .hasCode y .equals PARA ASEGURAR QUE LAS CLAVES SON UNICAS
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	//Indicamos el parametro por el que vamos a ordenar los objetos de esta clase EN ESTE CASO POR NOMBRE
	@Override
	public int compareTo(Producto o) {
		
		return this.nombre.compareTo(o.getNombre());
	}
	
}
