//package Configuracion.WEB-INF.src;
package configuracion;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

public class EjemploLogger extends Action {

    private static final Log log = LogFactory.getLog(EjemploLogger.class);

    public ActionForward execute(ActionMapping map, ActionForm form,
            HttpServletRequest req, HttpServletResponse res)
            throws Exception {
        log.trace("Inicia la acción EjemploLogger");

        try 
        {
            int edad = Integer.parseInt(req.getParameter("edad"));
        } 
        catch (NumberFormatException nfe) 
        {
            log.warn("Edad inválida", nfe);
        }

        return map.findForward("ok");
    }

}
