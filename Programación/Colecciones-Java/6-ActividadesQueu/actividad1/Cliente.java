package actividad1;

public class Cliente {
	//ATRIBUTOS DE LA CLASE CLIENTE
	private String nombre;
	private int numeroTicket;
	private static int auxiliar = 0;
	
	//CONSTRUCTOR COMPLETO Y VACÍO
	public Cliente(String nombre) {
		this.nombre = nombre;
		auxiliar++;
		this.numeroTicket=auxiliar;
	}
	
	public Cliente() {
		
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}
	
	public int getAuxiliar() {
		return auxiliar;
	}
	//METODO TO STRING
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroTicket=" + numeroTicket +"]";
	}
	
	
	
	
	
	

}
