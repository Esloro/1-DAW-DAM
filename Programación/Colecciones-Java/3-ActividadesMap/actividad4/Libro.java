package actividad4;

import java.util.Objects;

public class Libro { //
	//ATRIBUTOS DE LA CLASE LIBRO
	private String titulo;
	private String autor;
	
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
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

	
	//TO STRING
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}

	// SE SOBREESCRIBEN LOS METODOS PARA QUE LAS CLAVES SEAN UNICAS
	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}
	
}
