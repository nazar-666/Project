<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goods by category</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body background="img/ocean.jpg">
    	<header>  		
    		<nav class="navbar navbar-inverse">
  				<div class="container-fluid">
    				<div class="navbar-header">
     					<a class="navbar-brand">Sombra Shop</a>
    				</div>
    				<ul class="nav navbar-nav">
      					<li class="active"><a href="${pageContext.request.contextPath}/admin">Home page</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/addCategory">New category</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/addGoods">New goods</a></li>
   					</ul>
    				<ul class="nav navbar-nav navbar-right">
      					<li><a href="#"><span class="glyphicon glyphicon-user"></span>Admin</a></li>
      					<li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Log-out</a></li>
   					</ul>
  				</div>
			</nav>
    	</header> 
    	
    	<div class="container">
    		 <c:forEach var="choosedCategory" items="${choosedCategory}" varStatus="status">
	    		<div class="col-sm-4">
	    			<div align="center" class="col-sm-12">
						<a href="${pageContext.request.contextPath}/client/choosedGoods?goodsID=${choosedCategory.goodsID}">
							<img src="${choosedCategory.goodsFirstImg}" class="img-thumbnail" width="100%" height="170" >
						</a>
					</div>
					<div align="center" class="col-sm-12">
						<p class="h3">${choosedCategory.goodsName}</p>
			        </div>
			        <div align="center" class="col-sm-12">
			        	<p class="h5">${choosedCategory.goodsPrice}</p>
			        </div>
				</div>
			</c:forEach>
			
    	</div>
    </body>
</html>