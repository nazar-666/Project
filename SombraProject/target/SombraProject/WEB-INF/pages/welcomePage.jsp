<%@page session="false"%>
<html>
	<head>
		<meta charset="UTF-8">			
		<link rel="stylesheet" href="css/start_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	</head>
	<body background="img/ocean.jpg">
		<header>
			<div class="container">
				<div class= "row border" align="center">
					<div id="welcome" class= "col-xs-12 border" align="center">
						<h2>Welcome To Our Website!</h2>
						<h1>IT'S NICE TO MEET YOU</h1>
		            </div>
		 		</div>
		 		<div class= "row border" align="center">          
		            <div class= "col-xs-4 border" align="center">
		        	</div>
		        	<div id="join" class= "col-xs-4 border" align="center">
		        		<a type="button" class="btn btn-default" data-toggle="modal" href="${pageContext.request.contextPath}/login"><h3>Join To Us</h3></a>
		        	</div>
				</div>
			</div>
		</header>
	</body>
</html>