//package Actions.WEB-INF.src;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
//import org.apache.struts.action.DispatchAction;

public class VerFormularioAction extends Action {
    @Override
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        /* Guardamos la marca en la sesión para proteger la página */
        saveToken(req);

        // Mostramos el JSP
        return map.findForward("ok");
    }

}
