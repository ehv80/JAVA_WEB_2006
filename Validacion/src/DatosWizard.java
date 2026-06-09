
public class DatosWizard 
{
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;


    // Constructor con parámetros
    public DatosWizard(String nombre, String apellido, String correo, String direccion)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
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

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public String getCorreo()
    {
        return this.correo;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direcccion;
    }

    public String getDirecccion()
    {
        return this.direccion;
    }

}