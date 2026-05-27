//package capitulo7.action

import java.util.Collection;
import java.util.Vector;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.LazyValidatorForm;

import Vista.src.Pais;

public class VerCheckboxAction extends Action 
{
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception 
    {
        // Cast al tipo específico de objeto
        LazyValidatorForm dyna = (LazyValidatorForm) form;

        // Una colección de países
        Collection paises = new Vector();
        paises.add(new Pais("bo", "Bolivia"));
        paises.add(new Pais("co", "Colombia"));
        paises.add(new Pais("cl", "Chile"));
        paises.add(new Pais("pe", "Perú"));
        paises.add(new Pais("py", "Paraguay"));
        paises.add(new Pais("ve", "Venezuela"));
        paises.add(new Pais("uy", "Uruguay"));

        // Agregamos los países al form
        dyna.set("paises", paises);

        // Queremos ir a la vista de nombre "ok"
        return map.findForward("ok");
    }
}