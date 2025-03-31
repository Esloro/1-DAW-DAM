package actividad3;

public class Paciente implements Comparable <Paciente>{
	//ATRIBUTOS DE LA CLASE TAREA Gravedad ES UN ENUM
	private String nombre;
	private Gravedad gravedad;
	
	//CONSTRUCTOR
	public Paciente(String nombre, Gravedad gravedad) {
		this.nombre = nombre;
		this.gravedad = gravedad;
	}

	//GETTERS & SETTERS
	public String getnombre() {
		return nombre;
	}


	public void setnombre(String nombre) {
		this.nombre = nombre;
	}


	public Gravedad getgravedad() {
		return gravedad;
	}


	public void setgravedad(Gravedad gravedad) {
		this.gravedad = gravedad;
	}


	//METODO TO STRING
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", gravedad=" + gravedad + "]";
	}

	//METODO COMPARABLE PARA ESTABLECER EL ORDEN EN FUNCION DE LA GRAVEDAD DEL PACIENTE
	@Override
	public int compareTo(Paciente o) {
		
		return this.gravedad.compareTo(o.gravedad);

	}
	
	

}
