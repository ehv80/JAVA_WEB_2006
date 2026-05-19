<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
    <% /* Declaramos un objeto de tipo String y lo agregamos al scope de la página */ String clave="saludo.inicial" ;
        pageContext.setAttribute("clave", clave, PageContext.PAGE_SCOPE); %>

        <!-- Llamado directo -->

        Saludo:
        <bean:message key="saludo.inicial" /></br>

        <!-- Llamado directo con parámetro -->
        Saludo con par&aacute;metro:
        <bean:message key="saludo.parametrico" arg0="Signore Rigoberto" /></br>

        <!-- Llamado dinámico -->
        Saludo din&aacute;mico:
        <bean:message key="saludo.parametrico" arg0="<%= Double.toString(Math.PI * 10) %>" /></br>

        <!-- Llamado indirecto -->
        Saludo indirecto:
        <bean:message name="clave" /></br>