/** @author Esmeralda López Rodero **/

package coleccionesFinal;

public class Asignatura {
	//ATRIBUTOS DE LA CLASE ASIGNATURA
	private String nombre;
	private String profesor;
	private String creditos;
	
	/* --CONSTRUCTOR--
	 * @param nombre   Nombre de la asignatura.
	 * @param profesor Nombre del profesor.
	 * @param creditos Número de créditos. */
	public Asignatura(String nombre, String profesor, String creditos) {
		this.nombre = nombre;
		this.profesor = profesor;
		this.creditos = creditos;
	}

	
	/* --GETTERS & SETTERS--
	 * Devuelve el nombre de la asignatura.
	 * @return El nombre de la asignatura. */
	public String getNombre() {
		return nombre;
	}

	/** Establece el nombre de la asignatura.
	 * @param nombre El nuevo nombre de la asignatura. */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Obtiene el nombre del profesor.
	 * @return El nombre del profesor. */
	public String getProfesor() {
		return profesor;
	}

	/** Establece el nombre del profesor.
	 * @param profesor El nuevo nombre del profesor. */
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	/** Obtiene el número de créditos.
	 * @return El número de créditos. */
	public String getCreditos() {
		return creditos;
	}

	/** Establece el número de créditos.
	 * @param creditos El nuevo número de créditos. */
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}



	/* --MÉTODO TO STRING--
	* @return Devuelve un string de asignatura, mostrando todos sus atributos.
	*/
	@Override
	public String toString() {
		return "Asignatura --> Nombre:" + nombre + ", Profesor:" + profesor + ", Creditos:" + creditos;
	}

	/* --METODO HASCODE Y EQUALS--
	 * @return Devuelve el hashcode de la asignatura.
	 * Compara dos asignaturas por su nombre, sin importar mayúsculas y minúsculas.
	 * @param obj Objeto a comparar.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Asignatura otra = (Asignatura) obj;
		return nombre.equalsIgnoreCase(otra.nombre); // comparar sin importar mayúsculas/minúsculas
	}


	@Override
	public int hashCode() {
		return nombre.toLowerCase().hashCode(); 
	}
}



/*Clase Asignatura:

- Atributos: nombre: String que representa el nombre de la asignatura, profesor: String que representa 
	el nombre del profesor de la asignatura, creditos: int que representa los créditos de la asignatura.
- Métodos:
- Constructor para inicializar todos los atributos.
- toString(): Método que devuelve una representación string de la asignatura, incluyendo todos sus atributos.*/