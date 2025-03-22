<%@ page isErrorPage="true" %>

<html>
	<head>
		<title>Error en página JSP</title>
	</head>
	<body>
		Error en la entrada de datos: <br/>
		<%= exception.getMessage() %>
		<br/>
		<a href="javascript:history.go(-1)">Volver</a>
	</body>

</html>