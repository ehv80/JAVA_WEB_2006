//package capítulo5; //comentado para evitar error de clase o paquete no encontrado

import jakarta.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class DatosForm extends ActionForm 
{
	private String nombre;
	private String sexo;
	private Integer edad;
	private boolean fumador;
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getSexo()
	{
		return this.sexo;
	}
	
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	public Integer getEdad()
	{
		return this.edad;
	}
	
	public void setEdad(Integer edad)
	{
		this.edad = edad;
	}
	
	public boolean isFumador()
	{
		return this.fumador;
	}
	
	public void setFumador(boolean fumador)
	{
		this.fumador = fumador;
	}

}
