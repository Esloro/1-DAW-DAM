/** @author Esmeralda López Rodero **/

package coleccionesFinal;

public class Personal {
	//ATRIBUTOS DE LA CLASE PERSONAL
	protected String nombre;
	protected String clase;
	
	/* --CONSTRUCTOR --
	 * @param nombre Nombre de la persona. */
	public Personal(String nombre, String clase) {
		this.nombre = nombre;
		this.clase = clase;
	}

	/* -- GETTERS & SETTERS --

	 * Obtiene el nombre de la persona.
	 * @return Devuelve el nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	/** Establece el nombre de la persona.
	 * @param nombre Modifica el nombre de la persona. */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/** Obtiene la clase de la persona.
	 * @return Devuelve la clase de la persona. */
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}


	 /* METODO TO STRING
	 * @return Devuelve el nombre de la persona (Objeto Personal) y que es personal interno.
	*/
	 @Override
	 public String toString() {
	 	return "Personal --> Nombre: " + nombre ;
	 }
	
}
