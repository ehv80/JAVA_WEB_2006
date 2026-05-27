package Vista.src;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
//import org.apache.struts.action.LabelValueBean;
import org.apache.struts.action.LazyValidatorForm;

public class ProcesarLoginAction extends Action {

    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res)
            throws Exception {
        // Cast al tipo específico de objeto LazyValidatorForm
        LazyValidatorForm dyna = (LazyValidatorForm) form;

        // Obtenemos todos los datos del formulario
        String usuario = (String) dyna.get("usuario");
        String clave = (String) dyna.get("clave");

        boolean e_i_pi = "on".equals(dyna.get("e_i_pi"));
        boolean abc = "on".equals(dyna.get("abc"));

        String baile = (String) dyna.get("baile");
        String[] aves = (String[]) dyna.get("SeleccionAves");
        String letra = (String) dyna.get("letra");

        // Comparamos los datos
        if (usuario.equals("juan") && clave.equals("perez") && e_i_pi && !abc && baile.equals("s") && letra.equals("b")
                && aves.length == 2 && aves[0].equals("z") && aves[1].equals("g")) {
            // Si el login es correcto, ir a la vista de nombre "ok"
            return map.findForward("ok");
        } else {
            // Si el login es incorrecto, ir a la vista de nombre "denegado"
            return map.findForward("denegado");
        }
    }

}
