package actividad3;

public class Tareas {
	//ATRIBUTOS DE LA CLASE TAREAS 
	private String nombre;
	private Estado estado; //CLASE ENUM
	
	//CONSTRUCTOR COMPLETO Y VACÍO
	public Tareas(String nombre, Estado estado) {
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Tareas() {
		
	}
	
	//GETTERS & SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Tareas [nombre=" + nombre + ", estado=" + estado + "]";
	}
	
}
