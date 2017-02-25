<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orders List</title>
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
      					<li class="active"><a href="${pageContext.request.contextPath}/admin">Clients list</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/categoriesList">Categories list</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/goodsList">Goods list</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/producersList">Producers list</a></li>
      					<li><a href="${pageContext.request.contextPath}/admin/ordersList">Orders list</a></li>
   					</ul>
    				<ul class="nav navbar-nav navbar-right">
      					<li><a href="${pageContext.request.contextPath}/admin/control"><span class="glyphicon glyphicon-user"></span>Admin</a></li>
      					<li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-log-in"></span> Log-out</a></li>
   					</ul>
  				</div>
			</nav>
    	</header> 
    	
    	<div class="container">
	  		<h2 align = "center" >ORDERS LIST</h2><br/><br/>            
				<table class="table table-hover">
			    	<thead>
			      		<tr>
			      			<th align="center">Order ID</th>
					        <th align="center">Goods ID</th>
					        <th align="center">Client ID</th>
					        <th align="center">Amount of goods</th>
					        <th align="center">Price</th>
					        <th align="center">Delivery method</th>
					        <th align="center">Payment method</th>
					        <th align="center">Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="ordersList" items="${ordersList}" varStatus="temp">
			    	<tbody align="center">
			      		<tr>
			      			<td>${ordersList.orderID}</td>
							<td>${ordersList.orderGoodsID}</td>
							<td>${ordersList.orderClientID}</td>			
					        <td>${ordersList.orderAmount}</td>
					        <td>${ordersList.orderPrice}</td>
					        <td>${ordersList.deliveryMeth}</td>
					        <td>${ordersList.paymentMeth}</td>
			        		<td>
					            <a href="${pageContext.request.contextPath}/admin/deleteOrder?orderID=${ordersList.orderID}"><span class="glyphicon glyphicon-ok"></span>Delete</a>
			        		</td>
			      		</tr>
			      	</tbody>
				</c:forEach>
			</table>
		</div>
    </body>
</html>