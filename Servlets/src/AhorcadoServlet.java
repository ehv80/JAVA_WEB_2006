/*
* AhorcadoServlet.java
*/

//comentado para evitar error en tiempo de ejecución paquete y clase no encontrado
//package capitulo2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AhorcadoServlet extends HttpServlet
{
	//Las palabras disponibles para jugar
	private static final string[] PALABRAS = { "GATO", "CAPILLA", "BABOR", "MURCIELAGO", "VENTANAL", "HAMACA"};
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession sesion = req.getSession();
		
		int maxIntentos = Integer.parseInt(getInitParameter("maxIntentos"));
		
		//La palabra sobre la que está adivinando 
		String palabra = (String) session.getAttribute("palabra");
		
		//Las letras que acertó
		String aciertos;
		
		//Las letras que no acertó
		String errados;
		
		/* Primera vez del usuario, no tiene palabra asignada */
		if(palabra == null)
		{
			Random rand = new Random();
			
			/* Le agregamos una al azar de las disponibles */
			palabra = PALABRAS[rand.nextInt(PALABRAS.length)];
			aciertos = "";
			errados = "";
			/* Guardamos los datos iniciales en "sesion" */
			sesion.setAttribute("palabra", palabra);
			sesion.setAttribute("aciertos", aciertos);
			sesion.setAttribute("errados", errados);
		}
		else
		{
			/* Obtenemos los datos de este usuario de "sesion" */
			aciertos = (String) sesion.getAttribute("aciertos");
			errados = (String) sesion.getAttribute("errados");
			
			/* Verificamos si la letra que se arriesgó pertenece o no a la palabra */
			String letra = req.getParameter("letra");
			if(palabra.indexOf(letra) >= 0)
			{
				aciertos += letra;
			}
			else
			{
				errados += letra;
			}
			
			//Guardamos los datos actualizados en "sesion"
			sesion.setAttribute("aciertos", aciertos);
			sesion.setAttribute("errados", errados);
		}
		
		//Imprimimos el resultado
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>AHORCADO</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		
		/* Iteramos por las letras de la palabra. Si ya la acertó, la mostramos,
		 * sino, mostramos un "_" 
		 * */
		for(int i = 0; i < palabra.length(); i++)
		{
			String letra = palabra.substring(i, i + 1);
			if(aciertos.indexOf(letra) >= 0)
			{
				out.println(" " + letra);
			}
			else
			{
				out.println(" _");
			}
		}
		
		out.println("</h1>");
		out.println("<br/>");
		
		/* Nos fijamos si erró más de los intentos permitidos */
		if(maxIntentos > errados.length() )
		{
			// Todavía está en juego
			out.println("Intentos: " + (maxIntentos - errados.length() ));
			out.println(<br/>);
			
			// Las chances restantes
			for(char c = 'A'; c <= 'Z'; c++)
			{
				if(aciertos.indexOf(Character.toString(c)) == -1 && errados.indexOf(Character.toString(c)) == -1) 
				{
					/* Mostramos letra como opción si no fue arriesgada aún */
					out.println("<a href=\ahorcado?letra=" + c + "\">" + c + "</a>");
				}
			}
		}
		else
		{
			//Juego Terminado
			/* Invalidamos "sesion", limpiando todo su contenido */
			sesion.invalidate();
			out.println("<h2>Juego Terminado!</h2>");
			out.println("<br/");
			
			/* Le damos la oportunidad de que juegue de nuevo */
			
			out.println("<a href=\"ahorcado\">Jugar de nuevo</a>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}