package action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BDAction extends Action 
{
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception
    {
        DataSource dataSource;
        Connection conexion = null;
        try
        {
            // Obtenemos el datasource por defecto
            dataSource = getDataSource(req);

            // Obtenemos la conexión del datasource
            conexion = dataSource.getConnection();

            // Código JDBC
            Statement stmt = conexion.createStatement();
            stmt.execute("SELECT * FROM PAIS");
        }
        // Debemos cerrar siempre la conexión
        finally
        {
            try
            {
                conexion.close();
            }
            catch(SQLException e)
            {
                // Registramos la excepción
            }
        }
        return map.findforward("ok");
    }
}