<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<jsp:useBean id="hm" class="model.HolaMundoBean" />

<b>
<bean:write name="hm" property="saludo" />
</b>