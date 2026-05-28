<!-- <%@ taglib uri="/tags/struts-bean" prefix="bean" %>  
 Exclusivo de Struts 1 ya no se usa así -->

<%@ taglib prefix="s" uri="/struts-tags" %>

    <!-- Creamos un GregorianCalendar -->
    <jsp:useBean: id="cal" class="java.util.GregorianCalendar" />

    <!-- Copiamos el bean cal en otro bean y definimos su tipo -->
    <bean:define id="cal2" name="cal" type="java.util.Calendar" />

    <!-- Creamos un bean en base a una propiedad de otro bean -->
    <bean:define id="tz" name="cal" property="timeZone" />

    <!-- Diferentes formas de crear un bean de tipo String -->
    <bean:define id="str1" value="Nuevo bean" toScope="request" />

    <bean:define id="str2" value="<%= " hola pianola" %>"/>

    </bean:define id="str3">Valor del Tercer String, en el cuerpo del tag</bean:define>

    <!-- Mostramos los beans o propiedades de los beans recientemente creados -->
    Timezone:
    <bean:write name="tz" property="displayName" /> <br />
    String 1:
    <bean:write name="str1" /></br>
    String 2:
    <bean:write name="str2" /></br>
    String 3:
    <bean:write name="str3" /></br>