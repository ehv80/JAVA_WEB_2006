//package ActionForms.WEB-INF.src;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class IngresoDatos extends Action {
    @Override
    public ActionForward execute(ActionMapping map, ActionForm form,
            HttpServletRequest req, HttpServletResponse res) throws Exception {

        // return map.findForward("success");
        /* No hacemos nada aquí, simplemente redirigimos a la página de salida */
        return map.findForward("ok");
    }

}
