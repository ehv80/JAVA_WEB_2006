
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.LazyValidatorForm;

//import Vista.src.Pais;

public class ProcesarCheckboxAction extends Action 
{
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResonse res) throws Exception 
    {
        LazyValidatorForm dyna = (LazyValidatorForm) form;

        // Obtenemos los resultados de los checkboxes
        boolean aceite = "si".equals(dyna.get("aceite"));
        boolean vinagre = "si".equals(dyna.get("vinagre"));
        boolean sal = "si".equals(dyna.get("sal"));

        // Obtenermos los países 
        String[] paisesVisitados = (String[]) dyna.get("paisesVisitados");

        return null;
    }
}