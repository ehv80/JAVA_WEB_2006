/* 
 * ¡Hola Mundo!
 * Veamos un ejemplo de servlet, el clásico "Hola Mundo".
 */

//package capitulo1; //comentado para evitar error en tiempo de ejecución
//paquete y clase no encontrados

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletException;
import jakarta.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponse;

/* 
 * Extendemos la clase HttpServlet para definir
 * nuestra propia funcionalidad cuando el servlet
 * sea invocado
 */

public class HolaMundoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /*
         * Llamamos al método doPost. Este servlet responde de la misma
         * manera tanto a pedidos GET como POST
         */
        doPost(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /* Obtenemos el objeto que envía texto al cliente */
        PrintWriter out = res.getWriter();

        /* La respuesta */
        out.println("Hola Mundo!");

        /* Cerramos el stream */
        out.flush();
        out.close();
    }
}