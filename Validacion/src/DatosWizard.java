
public class DatosWizard 
{
    private String nombre;
    private String apellido;


    // Constructor con parámetros
    public DatosWizard(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getApellido()
    {
        return this.apellido;
    }

}