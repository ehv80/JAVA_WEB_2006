package action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.LazyValidatorForm;

public class Wizard1Action extends Action 
{
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception 
    {
        LazyValidatorForm dyna = (LazyValidatorForm) form;

        String nombre = (String) dyna.get("nombre");
        String apellido = (String) dyna.get("apellido");

        // El bean donde guardamos los datos
        DatosWizard dw = new DatosWizard();
        dw.setNombre(nombre);
        dw.setApellido(apellido);

        req.getSession().setAttribute("DatosWizard", dw);

        return map.findForward("ok");
    }
}