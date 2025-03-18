package actividad2;

public class Estudiantes {
	//ATRIBUTOS DE LA CLASE ESTUDIANTES
	private int curso;
	private String nombre;
	private int edad;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Estudiantes() {
		
	}
	
	public Estudiantes(int curso, String nombre, int edad) {
		this.curso = curso;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//GETTERS & SETTERS
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Estudiantes [curso=" + curso + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
