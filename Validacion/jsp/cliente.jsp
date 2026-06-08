<!-- Ejemplo de Validación con Código JavaScript del lado del cliente en la página JSP -->

<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- Antes se hacía así en la versión 1 de Struts 
<%@ taglib uri="/tags/struts-html" prefix="html" %>
-->

<html:html>

<head>
    <!-- Agregamos validación en el cliente -->
    <html:javascript forName="clienteForm" method="validar" />
</head>

<!-- Un método JavaScript para cuando el formulario es enviado -->
<html:form action="cliente2" onsubmit="return validar(this);">
    Nombre: <html:text property="nombre" /><html:errors property="nombre" /></br>
    Edad: <html:text property="edad" /> <html:errors property="edad" /></br>

    <html:submit value="Enviar" />
    <html:cancel value="Cancelar" />

</html:form>

</html:html>