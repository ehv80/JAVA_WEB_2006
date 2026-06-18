//package Configuracion.WEB-INF.src;
package configuracion;

import java.io.IOException;

//import javax.servlet.ServletException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionServlet;

/**
 * Subclase de ActionServlet que sólo atiende pedidos HTTP GET
 */

public class GetActionServlet extends ActionServlet {
    @Override
    /**
     * Sobreescribimos este método para que la superclase no lo atienda
     * 
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // No hacemos nada, sólo atendemos GET
    }
}