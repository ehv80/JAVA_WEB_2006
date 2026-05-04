<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

    <%-- Simplemente mostramos los datos ingresados por el usuario, notar que los estamos tomando del objeto datosForm
        que fue incluído por Struts en el contexto --%>

        <bean:write name="datosForm" property="nombre" /> <br>
        <bean:write name="datosForm" property="edad" /> <br>
        <bean:write name="datosForm" property="fumador" /> <br>