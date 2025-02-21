<%-- NumerosDeFibonacci.jsp --%>
<html>
	<head>
		<title>N&uacute;meros de Fibonacci</title>
	</head>
	<body>
	
	<%-- Declaramos el método fibonacci --%>
	<%!
		private int fibonacci(int n)
		{
			if(n == 0)
			{
				return 0;
			}
			if(n == 1)
			{
				return 1;
			}
			else
			{
				return (fibonacci(n-1) + fibonacci(n-2));
			}
		}
	%>
	
	Los primeros 10 n%uacute;meros de Fibonacci:<br/><br/>
	<%
		for(int i=0; i < 10; i++)
		{
	%>
		fibonacci(<% i %>) = <% fibonacci(i) %><br/>
	<%		
		}
	%>
	
	</body>
</html>