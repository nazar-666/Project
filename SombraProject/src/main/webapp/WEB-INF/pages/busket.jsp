<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busket</title>
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
	  		<h2 align = "center" >BUSKET</h2><br/><br/>            
				<table class="table table-hover">
			    	<thead>
			      		<tr>
					        <th align="center">Goods ID</th>
					        <th align="center">Goods Name</th>
					        <th align="center">Amount of goods</th>
					        <th align="center">Price</th>
					        <th align="center">Delivery method</th>
					        <th align="center">Payment method</th>
					        <th align="center">Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="newOrder" items="${newOrder}" varStatus="temp">
			    	<tbody align="center">
			      		<tr>
							<td id = "orderGoodsID">${newOrder.orderGoodsID}</td>
					        <td id = "orderGoodsName">${newOrder.orderGoodsName}</td>
					        <td id = "orderAmount">${newOrder.orderAmount} &nbsp;&nbsp;&nbsp;&nbsp;
					      		<a href="${pageContext.request.contextPath}/client/busket/plus?orderGoodsID=${newOrder.orderGoodsID}"><span class="glyphicon glyphicon-plus"></span></a>
					      		&nbsp;
					      		<a href="${pageContext.request.contextPath}/client/busket/minus?orderGoodsID=${newOrder.orderGoodsID}"><span class="glyphicon glyphicon-minus"></span></a>
					        </td>
					        <td id = "orderPrice">${newOrder.orderPrice}</td>
					        <td id = "deliveryMeth">${newOrder.deliveryMeth}</td>
					        <td id = "paymentMeth">${newOrder.paymentMeth}</td>
			        		<td>
					            <a href="${pageContext.request.contextPath}/client/busket/buy?orderGoodsID=${newOrder.orderGoodsID}"><span class="glyphicon glyphicon-ok"></span></a>
					               &nbsp;&nbsp;&nbsp;&nbsp;
					            <a href="${pageContext.request.contextPath}/client/busket/delete?orderGoodsID=${newOrder.orderGoodsID}"><span class="glyphicon glyphicon-remove"></span></a>
			        		</td>
			      		</tr>
			      	</tbody>
				</c:forEach>
			</table>
		</div>
    </body>
</html>