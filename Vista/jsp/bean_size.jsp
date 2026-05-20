<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<!-- Creamos una colección y la guardamos en el scope de la página -->

<%
    java.util.Vector v = new java.util.Vector();
    v.addElement("s");
    v.addElement("t");
    v.addElement("z");
    pageContext.setAttribute("v", v, PageContext.PAGE_SCOPE);
%>

<!-- Diferentes formas de acceder al tamaño de la colección -->
<bean:size id="s" collection="<%= v %>" />
<bean:size id="s2" name="v" />
