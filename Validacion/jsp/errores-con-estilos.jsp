<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- Antes se hacía así en la versión 1 de Struts 
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
-->

<html:html>
    <html:form action="cliente2">

        <html:errors
            header="errors.table.header"
            footer="errors.table.footer"
            prefix="errors.table.prefix"
            suffix="errors.table.suffix" />
        
        <h2>Ingrese sus datos</h2>

        Nombre: <html:text property="nombre" /><html:errors property="nombre" /></br>

        Edad: <html:text property="edad" /><html:errors property="edad" /></br>

        <html:submit value="Enviar" />

    </html:form>
    
</html:html>