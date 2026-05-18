<!-- Declaramos que vamos a usar la librería de tags de beans y que la usaremos con el prefijo bean -->

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

    <h2>Fechas</h2>

    <!-- Declaramos un objeto Date que hará las veces de bean -->
    <jsp:useBean id="fecha" class="java.util.Date" />

    <!-- Imprimimos el objeto -->

    Fecha:
    <bean:write name="fecha" /></br>

    <!-- Imprimimos propiedades del objeto (¡este código es caduco!) -->
    Día:
    <bean:write name="fecha" property="date" /></br>
    Mes:
    <bean:write name="fecha" property="month" /></br>
    A&ntilde;o:
    <bean:write name="fecha" property="year" /></br>

    <!-- Imprimimos la fecha pero dándole un formato -->
    Fecha con formato:
    <bean:write name="fecha" format="dd/MM/yyyy" /></br>

    <!-- Imprimimos la fecha con formato pero usando el atributo formatKey -->
    Fecha con formatKey:
    <bean:write name="fecha" formatKey="fecha.formato" /></br>

    <h2>N&uacute;meros</h2></br>

    <% /* Declaramos un objeto de tipo Double y lo agregamos al scope de la página */ Double pi=Math.PI;
        pageContext.setAttribute("pi", pi, PageContext.PAGE_SCOPE); %>

        <!-- Imprimimos el númrero Pi -->
        PI:
        <bean:write name="pi" /></br>

        <!-- Imprimimos el número Pi con formato -->
        PI con 4 decimales:
        <bean:write name="pi" format="##.####" /></br>

        <!-- Uso del atributo ignore, el siguiente tag no arrojará una excepción pese a que el bean no existe -->
        Bean inexistente:
        <bean:write name="inexistente" property="prop" ignore="true" /></br>