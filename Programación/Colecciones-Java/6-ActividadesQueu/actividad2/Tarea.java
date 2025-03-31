package actividad2;

public class Tarea implements Comparable <Tarea>{
	//ATRIBUTOS DE LA CLASE TAREA Prioridad ES UN ENUM
	private String descripcion;
	private Prioridad prioridad;
	
	//CONSTRUCTOR
	public Tarea(String descripcion, Prioridad prioridad) {
		this.descripcion = descripcion;
		this.prioridad = prioridad;
	}

	//GETTERS & SETTERS
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Prioridad getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}


	//METODO TO STRING
	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + "]";
	}
	
	//METODO COMPARABLE PARA ESTABLECERT LA PRIORIDAD

	@Override
	public int compareTo(Tarea o) {
		
		return this.prioridad.compareTo(o.prioridad);

	}
	
	
	
	
	
	
	

}
