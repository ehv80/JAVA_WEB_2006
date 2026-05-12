//package Actions.WEB-INF.src;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
// import org.apache.struts.action.DispatchAction;

public class ProcesarFormularioAction extends Action {
    @Override
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        /* La marca es válida */
        if(isTokenValid(req)) {
            // Invalidamos la marca para evitar reenvíos
            resetToken(req);

            // Procesamos el formulario
            //String nombre = req.getParameter("nombre");
            //String email = req.getParameter("email");

            // Guardamos los datos en la sesión para mostrarlos en el JSP
            //req.getSession().setAttribute("nombre", nombre);
            //req.getSession().setAttribute("email", email);
            return map.findForward("ok");
        }
        else {
            // La marca no es válida, redirigimos a la página de error
            return map.findForward("mal");
        }
    }

}
