//package Actions.WEB-INF.src;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DispatchAction;

public class CuentaAction extends DispatchAction {

    public ActionForward depositar(ActionMapping map, ActionForm form,
            HttpServletRequest req, HttpServletResponse res)
            throws Exception {
        // Lógica para depositar dinero en la cuenta
        return map.findForward("success");
    }

    public ActionForward extraer(ActionMapping map, ActionForm form,
            HttpServletRequest req, HttpServletResponse res)
            throws Exception {
        // Lógica para retirar dinero de la cuenta
        return map.findForward("success");
    }
}
