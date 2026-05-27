<!-- Usamos los tres paquetes de tags: html, bean y logic -->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>

<html:form action="procesarCheckboxForm">
    Condimentos: </br>
    <!-- Objetos checkbox que envían un valor que definimos nosotros -->
    <html:checkbox property="aceite" value="si"/>Aceite</br>
    <html:checkbox property="vinagre" value="si"/>Vinagre</br>
    <html:checkbox property="sal" value="si"/>Sal</br>

    Pa&iacute;ses visitados:</br>

    <!-- Iteramos sobre el conjunto de países para generar los otros checkbox -->
    <logic:iterate id="itPais" name="checkboxForm" property="paises">
        <html:multibox property="paisesVisitados">
            <!-- El cuerpo del tag es el valor que enviará -->
            <bean:write name="itPais" property="codigo" />
        </html:multibox>
        
        <!-- Escribimos el nombre del pais para el usuario -->
        <bean:write name="itPais" property="nombre" />
        </br>
    </logic:iterate>
</br>
<html:submit value="Enviar" />

</html:form>

</html:html>