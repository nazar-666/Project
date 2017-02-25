<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category List</title>
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
		
    </body>
</html>