//package capítulo5; //comentado para evitar error de clase o paquete no encontrado

import jakarta.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class DatosForm extends ActionForm {
	// Atributos de la clase, las propiedades
	private String nombre;
	private String sexo;
	private Integer edad;
	private boolean fumador;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isFumador() {
		return this.fumador;
	}

	public void setFumador(boolean fumador) {
		this.fumador = fumador;
	}

	/*
	 * Sobreescribimos el método reset para reestablecer el valor de la propiedad
	 * fumador
	 */
	public void reset(ActionMapping map, HttpServletRequest req) {
		// this.nombre = null;
		// this.sexo = null;
		// this.edad = null;
		this.fumador = false;
	}

	/*
	 * Validamos el contenido de este formulario y agregamos mensajes de error en
	 * caso de fallas
	 */
	public ActionErrors validate(ActionMapping map, HttpServletRequest req) {

		ActionErrors ret = new ActionErrors();
		if (this.nombre == null || this.nombre.trim().equals("")) {
			ret.add("nombre", new ActionMessage("Falta ingresar el nombre", false));
		}
		if (this.edad == null) {
			ret.add("edad", new ActionMessage("Falta ingresar edad", false));
		} else {
			if (this.fumador && this.edad.intValue() < 18) {
				ret.add("edad", new ActionMessage("Peque&ntilde;o fumador", false));
			}
		}
		return ret;
	}
}
