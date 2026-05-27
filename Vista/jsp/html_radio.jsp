<!-- Importamos clases -->
<%@ page import="java.util.*, Vista.src.Pais" %>

<!-- En este ejemplo usamos tres paquetes de tags -->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%

// Una Colección de países 
Collection paises = new Vector();
paises.add(new Pais("bo", "Bolivia"));
paises.add(new Pais("co", "Colombia"));
paises.add(new Pais("cl", "Chile"));
paises.add(new Pais("pe", "Perú"));
paises.add(new Pais("py", "Paraguay"));
paises.add(new Pais("ve", "Venezuela"));
paises.add(new Pais("uy", "Uruguay"));
pageContext.setAttribute("paises", paises, PageContext.PAGE_SCOPE);

%>

<html:html xhtml="true">

<!-- Le pasamos el foco al tercer componente del grupo de botones país -->
<html:form action="procesarFormulario" focus="pais" focusIndex="2">
    Sexo: </br>

    <!-- Dos radios button con valor constante -->
    <html:radio property="sexo" value="M" />Masculino</br>
    <html:radio property="sexo" value="F" />Femenino</br>

</br>

Pa&iacute;s</br>

<!-- Iteramos sobre el conjunto de países para generar los radios button -->
<logic:iterate id="itPais" name="paises">
    <!-- Cada radio button obtiene su valor de la propiedad codigo del bean itPais, el bean actual de la iteración -->
    <html:radio property="pais" idName="itPais" value="codigo" />

    <!-- Escribimos el nombre del país para el usuario -->
    <bean:write name="itPais" property="nombre" />
</br>

</logic:iterate>

</html:form>

</html:html>