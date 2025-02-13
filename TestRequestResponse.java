/*
 * Veamos un pequeño ejemplo. Crearemos un servlet que se fije si el pedido
 * contiene una cookie,
 * caso contrario, la agrega a la respuesta. Luego dependiendo de si cierto
 * parámetro
 * está contenido en el pedido, responderá de distinta forma, y en el idioma en
 * que el usuario
 * lo desee.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestRequestResponse extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /*
         * Llamamos al método doPost. Este servlet responde de la misma
         * manera tanto a pedidos GET como POST
         */
        doPost(req, res);
    }

    /* Al recibir un GET o un POST se ejecuta este método */
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /* Obtenemos las cookies que envió el cliente */
        Cookie[] cookies = req.getCookies();
        boolean tieneCookie = false;

        /* Iteramos en busca de una cookie de nombre PruebaCookie */
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            if (cookie.getName().equals("PruebaCookie")) {
                tieneCookie = true;
                break;
            }
        }
        /* Si la cookie no existía, la agregamos a la respuesta */
        if (!tieneCookie) {
            /* El constructor de la clase Cookie toma dos parámetros: nombre y valor */
            Cookie nuevaCookie = new Cookie("PruebaCookie", "Valor de la cookie");

            /* La agregamos a la respuesta */
            res.addCookie(nuevaCookie);
        }

        /* Obtenemos el lenguaje de preferencia del cliente */
        String language = req.getLocale().getLanguage();

        /* Obtenemos el objeto para escribir el contenido de la respuesta */
        PrintWriter out = res.getWriter();

        /*
         * Nos fijamos que el parámetro de nombre clave exista y
         * que su valor sea "servlet"
         */
        if (req.getParameter("clave") != null && req.getParameter("clave").equals("servlet")) {
            /* Dependiendo de las preferencias de idioma del usuario, varía la respuesta */
            if (language.equals("es")) {
                out.println("La clave es correcta");
            } else {
                out.println("The key is correct");
            }
        } else {
            if (language.equals("es")) {
                out.println("La clave es incorrecta");
            } else {
                out.println("Wrong key");
            }
        }
    }
}