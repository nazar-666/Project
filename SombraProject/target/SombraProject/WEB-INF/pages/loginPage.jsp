<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 
 <html>
	<head>
		<title>LOGIN PAGE</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/start_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	</head>
	<body background="img/ocean.jpg">
		<header>
			<form name='f' action="${pageContext.request.contextPath}/j_spring_security_check" method='POST' >
				<div align="center" class="form-group">
					<div id="welcome" class= "col-xs-12 border" align="center">
						<h1>LOG IN</h1>
		            </div>
					<div class="form-group">
						<label class="col-sm-4 control-label">Login</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="username" placeholder="andriy">
						</div>
					</div>
					<div class="form-group">
							<label class="col-sm-4 control-label">Password</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" name="password" placeholder="andriy" />
							</div>
					</div>
				</div>
				
				<div align="center" class="form-group">
					<div class="col-sm-12">
						<c:if test="${param.error == 'true'}">
		         			<div style="color:red;margin:10px 0px;">
		          				Login or password are incorrect!
		                 	</div>
		    			</c:if>
    				</div>
    				
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary" value="Submit"> LOG IN</button>
					</div>
					<div class="col-sm-12">
				       	<a class="btn btn-primary" data-toggle="modal" href="${pageContext.request.contextPath}/register">Register now</a>
				    </div>
				</div>
			</form>
		</header>
	</body>
</html>