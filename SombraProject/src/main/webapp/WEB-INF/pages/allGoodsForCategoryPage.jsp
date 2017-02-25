<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goods for category</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body background="http://localhost:8080/SombraProject/img/ocean.jpg">
    	<header>  		
    		<nav class="navbar navbar-inverse">
  				<div class="container-fluid">
    				<div class="navbar-header">
     					<a class="navbar-brand">Sombra Shop</a>
    				</div>
    				<ul class="nav navbar-nav">
      					<li class="active"><a href="${pageContext.request.contextPath}/client">Home page</a></li>
   					</ul>
    				<ul class="nav navbar-nav navbar-right">
      					<li><a href="${pageContext.request.contextPath}/client/busket"><span class="glyphicon glyphicon-trash"></span>Busket</a></li>
      					<li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-off"></span> Log-out</a></li>
   					</ul>
  				</div>
			</nav>
    	</header> 
    	
    	<div class="container">
    		 <c:forEach var="choosedCategory" items="${choosedCategory}" varStatus="status">
	    		<div class="col-sm-4">
	    			<div align="center" class="col-sm-12">
						<a href="${pageContext.request.contextPath}/client/choosedCategory/choosedGoods?goodsID=${choosedCategory.goodsID}">
							<img src="http://localhost:8080/SombraProject/img/goods/${choosedCategory.goodsFirstImg}" width="100%" height="170" >
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