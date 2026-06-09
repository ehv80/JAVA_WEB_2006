<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- Antes se hacía así en la versión 1 de Struts 
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
-->

<html:html xhtml="true">

<html:form action="procesarValidatorForm" focus="nombre">

<bean:message key="form.nombre" />:<html:text property="nombre" /><html:errors property="nombre"/></br>

<bean:message key="form.cp" />:<html:text property="cp" /><html:errors property="cp"/></br>

<bean:message key="form.edad" />:<html:text property="edad" /><html:errors property="edad"/></br>

<bean:message key="form.sueldo" />:<html:text property="sueldo" /><html:errors property="sueldo"/></br>

<bean:message key="form.fecha_nacimiento" />:<html:text property="fecha_nacimiento" /><html:errors property="fecha_nacimiento"/></br>

<bean:message key="form.litros" />:<html:text property="litros" /><html:errors property="litros"/></br>

<bean:message key="form.tarjeta" />:<html:text property="tarjeta" /><html:errors property="tarjeta"/></br>

<bean:message key="form.correo" />:<html:text property="correo" /><html:errors property="correo"/></br>

<bean:message key="form.url" />:<html:text property="url" /><html:errors property="url"/></br>

<html:checkbox property="cuotas" /><bean:message key="form.cuotas" /></br>

<bean:message key="form.cantCuotas" />:<html:text property="cantCuotas" /><html:errors property="cantCuotas"/></br>

Campos amigos:</br>
<html:text property="campo1" />
<html:text property="campo2" /><html:errors property="campo1" /></br>

<bean:message key="form.n" />:<html:text property="n" size="4" /><html:errors property="n"/></br>

<html:javascript formName="validatorForm" />

<html:submit value="Enviar" >

</html:form>

</html:html>