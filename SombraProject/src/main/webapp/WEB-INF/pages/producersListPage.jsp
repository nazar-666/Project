<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producers List</title>
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
	  		<h2 align = "center" >PRODUCERS LIST</h2><br/><br/>            
				<table class="table table-hover">
			    	<thead>
			      		<tr>
					        <th>Producer ID</th>
					        <th>Producer name</th>
					        <th>Producer description</th>
					        <th>Producer logo</th>
					        <th>Accessibility</th>
					        <th>Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="producersList" items="${producersList}" varStatus="status">
			    	<tbody>
			      		<tr>
							<td>${producersList.producerID}</td>
							<td>${producersList.producerName}</td>
			                <td>${producersList.producerDescr}</td>
			                <td>${producersList.producerLogo}</td>
			                <td>${producersList.producerEnable}</td>
			                <td>
			                <a href="${pageContext.request.contextPath}/admin/editingProducer?producerID=${producersList.producerID}">Edit</a>
			                        &nbsp;&nbsp;&nbsp;&nbsp;
			                    <a href="${pageContext.request.contextPath}/admin/deleteProducer?producerID=${producersList.producerID}">Delete</a>							
			            	</td>
			      		</tr>
			    	</tbody>
			    </c:forEach>
			 </table>
		</div>
    </body>
</html>