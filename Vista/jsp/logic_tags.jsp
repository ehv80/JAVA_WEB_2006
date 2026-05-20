<%-- Declaramos que vamos a usar la librería de tags logic y que la usaremos con el prefijo logic --%>

<%@ taglig uri="/tags/struts-logic" prefix="logic" %>
<%@ taglig uri="/tags/struts-bean" prefix="bean" %>

<%-- Definimos dos variables --%>
<bean:define id="dos" value="2" />
<bean:define id="cadena" value="java" />

<%-- Comparación por igualdad, numérica --%>
<logic:equal name="dos" value="2" >
    2 = 2
    <br/>
</logic:equal>

<%-- Comparación por desigualdad, numérica --%>
<logic:notEqual name="dos" value="<%= Double.toString(Math.E) %>">
    2 != e
    <br/>
</logic:notEqual>

<%-- Comparación por menor, numérica --%>
<logic:lessThan name="dos" value="<%= Double.toString(Math.E) %>">
    2 < e
    <br/>
</logic:lessThan>

<%-- Comparación por mayor, texto --%>
<logic:greaterThan name="cadena" value="a">
    java > a
    <br/>
</logic:greaterThan>

<%-- Comparación por mayor, texto --%>
<logic:greaterThan name="cadena" value="2">
    java > 2
    <br/>
</logic:greaterThan>
