<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User List</title>
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
	  		<h2 align = "center" >CLIENTS LIST</h2><br/><br/>            
				<table class="table table-hover">
			    	<thead>
			      		<tr>
					        <th>ID</th>
					        <th>Login</th>
					        <th>Name</th>
					        <th>Surname</th>
					        <th>Date of birth</th>
					        <th>E-mail</th>
					        <th>Role</th>
					        <th>Accessibility</th>
					        <th>Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="clientList" items="${clientList}" varStatus="temp">
			    	<tbody>
			      		<tr>
							<td>${clientList.clientID}</td>
					        <td>${clientList.login}</td>
					        <td>${clientList.clientName}</td>
					        <td>${clientList.clientSurname}</td>
					        <td>${clientList.clientDate}</td>
					        <td>${clientList.clientEmail}</td>
					        <td>${clientList.role}</td>
			        		<td>${clientList.clientEnable}</td>
			        		<td>
					            <a href="${pageContext.request.contextPath}/admin/lockClient?clientID=${clientList.clientID}">Lock</a>
					               &nbsp;&nbsp;&nbsp;&nbsp;
					            <a href="${pageContext.request.contextPath}/admin/unblockClient?clientID=${clientList.clientID}">Unblock</a>
			        		</td>
			      		</tr>
			      	</tbody>
				</c:forEach>
			</table>
		</div>
    </body>
</html>