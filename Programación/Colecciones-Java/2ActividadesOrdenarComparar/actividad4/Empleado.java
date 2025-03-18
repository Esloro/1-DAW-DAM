package actividad4;

public class Empleado implements Comparable<Empleado>{ //SE IMPLEMENTA  LA INTERFAZ COMPARABLE to DE JAVA
	//ATRIBUTOS DE LA CLASE EMPLEADO
	private String nombre;
	private String departamento;
	private double salario;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String departamento, double salario) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", departamento=" + departamento + ", salario=" + salario + "]";
	}
	
	//Indicamos el parametro por el que vamos a ordenar los objetos de esta clase
	@Override
	public int compareTo(Empleado otro) {
		int comparacionSalario = Double.compare(this.salario, otro.getSalario());
		 if (comparacionSalario == 0) { //Si es 0 es que los salarios son iguales por tanto comparamos por nombre
	            return this.nombre.compareTo(otro.getNombre());
	        }
		return comparacionSalario; //Cuando son diferentes comparamos por salario
	}
  


	
	
	
}
