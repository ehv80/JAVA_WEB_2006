<!-- Importamos clases -->
<%@ page import="java.util.*, java.net.URL" %>
    <!-- Declaramos que vamos a usar la librería de tags logic y que la usaremos con el prefijo logic -->
    <%@ taglib uri="/tags/struts-logic" prefix="logic" %>
        <!-- Declaramos que vamos a usar la librería de tags bean y que la usaremos con el prefijo bean -->
        <%@ taglib uri="/tags/struts-bean" prefix="bean" %>

            <% // Una Colección de direcciones webs Collection urls=new Vector(); urls.add(new
                URL("http://www.google.com")); urls.add(new URL("http://onweb.tectimes.com")); urls.add(new
                URL("http://java.sun.com")); urls.add(new URL("http://struts.apache.org")); urls.add(new
                URL("http://java.sun.com/products/jsp/")); pageContext.setAttribute("colUrls", urls,
                PageContext.PAGE_SCOPE); %>

                <!-- Iteramos y mostramos todas las direcciones webs -->
                <h3>Toda la colecci&oacute;n:</h3>
                <logic:iterate id="url" name="colUrls">
                    <bean:write name="url" /><br>
                </logic:iterate>

                <!-- Iteramos y mostramos la propiedad del host de los primeros dos elementos de la colección -->
                <h3>Los primeros dos hosts:</h3>
                <logic:iterate id="url" name="colUrls" offset="0" length="2">
                    <bean:write name="url" property="host" /><br>
                </logic:iterate>
                <!-- Iteramos y mostramos la propiedad protocol de los primeros dos elementos de la colección y su posición -->
                <h3>Las direcciones 3 y 4:</h3>
                <logic:iterate indexId="i" id="url" name="colUrls" offset="2" length="2">
                    <bean:write name="url" />
                    (posici&oacute;n:
                    <bean:write name="i" />)
                    <br>
                </logic:iterate>