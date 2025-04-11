/** @author Esmeralda López Rodero **/

package coleccionesFinal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Estudiante extends Personal {

	/*--ATRIBUTOS-- DE LA CLASE ESTUDIANTE QUE HEREDA DE LA CLASE Personal
	 * Mapa de asignaturas(nombre, profesor, creditos) y su estado (SUPERADO, CURSADO, ABANDONADO) */
	protected Map<Asignatura, EstadoAsignatura> asignaturas;

	/*--CONSTRUCTOR-- 
	/* Constructor para crear un objeto Estudiante.
	 * @param nombre Nombre del estudiante.
	 * Inicializamos el mapa de asignaturas */

	public Estudiante(String nombre, String clase) {
		super(nombre, clase);
		asignaturas = new HashMap<>();

	}

	/*--GETTERS & SETTERS--
	 * Devuelve el mapa de asignaturas del estudiante 
	 * return asignaturas */
	public Map<Asignatura, EstadoAsignatura> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece el mapa de asignaturas del estudiante.
	 * 
	 * @param asignaturas Modifica el mapa de asignaturas del estudiante.
	 */
	public void setAsignaturas(Map<Asignatura, EstadoAsignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/*
	 * --METODOS--
	 * MÉTODO PARA AGREGAR UNA NUEVA ASIGNATURA AL MAPA
	 */
	public void agregarAsignatura(Asignatura a, EstadoAsignatura estado) {
		boolean existe = false;
		for (Asignatura asignaturaExistente : asignaturas.keySet()) {
			if (asignaturaExistente.getNombre().equalsIgnoreCase(a.getNombre())) {
				existe = true;
			}
		}
		if (!existe) {
			asignaturas.put(a, estado); // Si no existe, se añade al mapa
		}
	}

	// METODO PARA BORRAR UNA ASIGNATURA
	// Recibe como parámetro la asignatura a borrar a
	public void borrarAsignatura(String asignaturaBorrar) {
		boolean existe = false;
		Iterator<Map.Entry<Asignatura, EstadoAsignatura>> iterator = asignaturas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Asignatura, EstadoAsignatura> entry = iterator.next();
			if (entry.getKey().getNombre().equalsIgnoreCase(asignaturaBorrar)) {
				iterator.remove();
				existe = true;
				System.out.println("LA asignatura se ha eliminado con exito");// Elimina la asignatura del mapa
				return;
			}
		}
		if (!existe) {
			System.out.println("La asignatura no existe en el mapa.");
		}
	}

	/*
	 * MÉTODO PARA MOSTRAR ASIGNATURAS
	 * Retorna un mensaje por pantalla con la lista de asignaturas y muestra sus
	 * datos
	 */
	public void mostrarAsignaturas() {
		for (Map.Entry<Asignatura, EstadoAsignatura> entry : asignaturas.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
