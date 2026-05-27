package Vista.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.LabelValueBean;
import org.apache.struts.action.LazyValidatorForm;

public class VerLoginAction extends Action {
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res)
            throws Exception {
        // Cast al tipo específico de objeto LazyValidatorForm
        LazyValidatorForm dyna = (LazyValidatorForm) form;

        // Una colección de bailes
        Collection bailes = new HashSet();
        bailes.add(new LabelValueBean("Tango", "t"));
        bailes.add(new LabelValueBean("Merengue", "m"));
        bailes.add(new LabelValueBean("Vals", "v"));
        bailes.add(new LabelValueBean("Swing", "s"));

        // Una colección de aves
        Collection aves = new Vector();
        aves.add(new LabelValueBean("Zorzal", "z"));
        aves.add(new LabelValueBean("Colibri", "c"));
        aves.add(new LabelValueBean("Golondrina", "g"));
        aves.add(new LabelValueBean("Bencejo", "b"));
        aves.add(new LabelValueBean("Chucao", "ch"));

        // Una colección de letras griegas
        Collection letras = new ArrayList();
        letras.add(new LabelValueBean("alfa", "a"));
        letras.add(new LabelValueBean("beta", "β"));
        letras.add(new LabelValueBean("gama", "g"));
        letras.add(new LabelValueBean("delta", "d"));
        letras.add(new LabelValueBean("epsilon", "e"));

        // Asignar las colecciones a los atributos del formulario
        dyna.set("bailes", bailes);
        dyna.set("aves", aves);
        dyna.set("letras", letras);

        // Queremos ir a la vista de nombre "ok"

        return map.findForward("ok");
    }
}
