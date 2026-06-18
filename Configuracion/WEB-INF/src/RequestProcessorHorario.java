//package Configuracion.WEB-INF.src;
package configuracion;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.RequestProcessor;

public class RequestProcessorHorario extends RequestProcessor {
    protected static Log log = LogFactory.getLog(RequestProcessorHorario.class);

    @Override
    /**
     * Verificamos estar dentro de un rango horario. Si lo estamos, dejamos que
     * RequestProcessor
     * siga con el procesamiento del pedido, sino, reenviamos a una página que
     * muestre un mensaje.
     * 
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    protected boolean processPreprocess(HttpServletRequest request, HttpServletResponse response) throws IOException {
        GregorianCalendar gc = new GregorianCalendar(TimeZone.getTimeZone("GMT"));

        int hora = gc.get(Calendar.HOUR_OF_DAY);

        if (hora < 9 || hora > 15) {
            try {
                // Reenviamos a una página que muestre un mensaje
                response.sendRedirect(response.encodeRedirectURL("fueraDeHorario.html"));
            } catch (IOException ioe) {
                // Registramos el error
                log.error("Error al redirigir por fuera de horario", ioe);
            }

            // Cortamos el procesamiento
            return false;
        } else {
            // Que siga el procesamiento normal
            return true;
        }
    }
}
