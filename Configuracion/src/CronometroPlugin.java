//package Configuracion.src;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timezone;
import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class CronometroPlugin implements org.apache.struts.action.PlugIn {

    private ActionServlet servlet;
    private long inicio;

    // Asignamos un valor por defecto al formato del cronómetro
    private String formato = "dd HH:mm:ss";

    // Método accesor para el formato del cronómetro
    public String getFormato() {
        return formato;
    }

    // Metodo mutador para el formato del cronómetro
    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Método llamado al iniciarse la aplicación
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {

        // Guardamos el servlet
        this.servlet = servlet;

        // Guardamos la fecha en que inició la aplicación
        this.inicio = System.currentTimeMillis();
    }

    // Método llamado al finalizarse la aplicación
    public void destroy() {

        // Calculamos el tiempo transcurrido desde el inicio de la aplicación
        long tiempo = System.currentTimeMillis() - this.inicio;

        SimpleDateFormat dateFormat = new SimpleDateFormat(this.formato);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Lo imprimimos
        servlet.log("Tiempo transcurrido desde el inicio de la aplicación: " + dateFormat.format(new Date(tiempo)));
    }
}
