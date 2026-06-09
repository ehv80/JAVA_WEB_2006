<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- Antes se hacía así en la versión 1 de Struts 
<%@ taglib uri="/tags/struts-html" prefix="html" %>
-->

<html:html xhtml="true">

<html:form action="wizard2">
    Nombre: <html:text property="nombre" /><html:errors property="nombre"/></br>
    Apellido:<html:text property="apellido" /><html:errors property="apellido"/></br>

    <!-- Atributo importante para el validador -->
    <html:hidden property="page" value="0" />

    <html:submit />

</html:form>

</html:html>