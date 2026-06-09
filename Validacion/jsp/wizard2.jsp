<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- Antes se hacía así en la versión 1 de Struts 
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
-->

<html:html xhtml="true">

<html:form action="procesarWizardForm">
    Correo electr&oacute;nico: <html:text property="email" /><html:errors property="email"/></br>
    Direcci&oacute;n:<html:textarea rows="3" cols="30" property="dir" /><html:errors property="dir"/></br>

    <!-- Atributo importante para el validador -->
    <html:hidden property="page" value="1" />

    <html:hidden property="nombre" />
    <html:hidden property="apellido" />

    <html:submit />

</html:form>

</html:html>