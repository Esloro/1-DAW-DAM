package actividad4;

public class Producto {
	//ATRIBUTOS DE LA CLASE PRODUCTO
	private String nombre;
	private Categoria categoria; //CLASE ENUM
	private double precio;

	
	//CONSTRUCTORES
	public Producto(String nombre, Categoria categoria, double precio) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + "]";
	}
	
	
}
