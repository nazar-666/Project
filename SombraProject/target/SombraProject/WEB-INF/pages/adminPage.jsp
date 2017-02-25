<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category Manager Home</title>
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
    	
    <form action="${pageContext.request.contextPath}/categories">
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
			
		<div class="container">
	  		<h2 align = "center" >CATEGORIES LIST</h2><br/><br/>            
				<table class="table table-hover">
			    	<thead>
			      		<tr>
					        <th>ID</th>
					        <th>Name</th>
					        <th>Description</th>
					        <th>Image</th>
					        <th>Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="categoryList" items="${categoryList}" varStatus="status">
			    	<tbody>
			      		<tr>
							<td>${categoryList.categoryID}</td>
			                <td>${categoryList.categoryName}</td>
			                <td>${categoryList.categoryDescr}</td>
			                <td>${categoryList.categoryImg}</td>
			                <td>
			                <a href="${pageContext.request.contextPath}/admin/editingCategory?categoryID=${categoryList.categoryID}">Edit</a>
			                        &nbsp;&nbsp;&nbsp;&nbsp;
			                    <a href="${pageContext.request.contextPath}/admin/deleteCategory?categoryID=${categoryList.categoryID}">Delete</a>							
			            	</td>
			      		</tr>
			    	</tbody>
			    </c:forEach>
			  </table>
			</div>
        </form>
    </body>
</html>