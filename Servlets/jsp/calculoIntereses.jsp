<%@ errorPage="error.jsp" %>

<html>
	<head>
		<title>Calculador de Intereses JSP</title>
	</head>
	<body>
		<jsp:useBean id="intereses" class"InteresesBean">
		<jsp:setProperty name="intereses" property="*"/>
		</jsp:useBean>
		
		Inversi&oacute;n: <jsp:getProperty name="intereses" property="inversion"/><br/>
		Meses: <jsp:getProperty name="intereses" property="meses" /><br/>
		Tasa Anual %: <jsp:getProperty name="intereses" property="tasa" /><br/>
		<br/>
		Ganancias: <jsp:getProperty name="intereses" property="ganancias" /><br/> 
	</body>

</html>