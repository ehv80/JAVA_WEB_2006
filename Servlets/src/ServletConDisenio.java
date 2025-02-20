/*
* ServletConDisenio.java
*/

//comentado para evitar errores en tiempo de ejecución paquete y clase no encontrados
//package capitulo3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConDisenio extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out = res.getWriter();
		
		//La Respuesta
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Bienvenidos</title>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
		out.println("<link href\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\">");
		out.println("</head>");
		out.println("<body class=\"body\">");
		out.println("<table width=\"740\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">");
		out.println("<tr>");
		for(int i = 0; i < 5 ; i++)
		{
			out.println("<td width=\"185\" height=\"64\" align=\"left\" "
					+ "valign=\"middle\" bgcolor=\"#1AA440\"><a href=\".\"><imgsrc=\"/_images/common/logo" + i + ".gif\" width=\"179\" height=\"60\" border=\"0\"></a></td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		//cerramos el stream
		out.flush();
		out.close();
	}
}