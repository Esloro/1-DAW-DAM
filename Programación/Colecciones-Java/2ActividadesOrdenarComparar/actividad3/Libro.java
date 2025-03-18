package actividad3;

public class Libro implements Comparable<Libro>{ //SE IMPLEMENTA  LA INTERFAZ COMPARABLE to DE JAVA
	//ATRIBUTOS DE LA CLASE LIBRO
	private String titulo;
	private String autor;
	private double precio;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	//GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//TO STRING
		@Override
		public String toString() {
			return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
		}

	//Indicamos el parametro por el que vamos a ordenar los objetos de esta clase
	@Override
	public int compareTo(Libro otro) {
		return Double.compare(this.precio, otro.precio);
	}
	
	
}
