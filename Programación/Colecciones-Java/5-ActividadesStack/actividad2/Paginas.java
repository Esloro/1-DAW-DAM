package actividad2;

public class Paginas {
	//ATRIBUTOS DE LA CLASE PAGINAS
	private String nombre;
	private String url;
	
	//CONSTRUCTOR VACIO Y COMPLETO
	public Paginas(String nombre) {
		this.nombre = nombre;
	}
	
	public Paginas(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;
	}
	
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Paginas [nombre=" + nombre + ", url=" + url + "]";
	}
	
}


