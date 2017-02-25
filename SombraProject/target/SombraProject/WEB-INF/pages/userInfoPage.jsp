<%@page session="false"%>
<html>
	<head>
		<title>SIMPLE USER</title>
	</head>
	<body>
		<header>
		    <jsp:include page="_menu_user.jsp" /> 
		    <h1>Message : ${message}</h1>
		</header>
	</body>
</html>