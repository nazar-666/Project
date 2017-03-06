<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goods List</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
   		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--    		<script type="text/javascript"> 
	   		$(document).ready(function(){
	   		    $("#table").on('click','.btnSelect',function(){
	   		         // get the current row
	   		         var currentRow=$(this).closest("tr"); 
	   		         var goodsID=currentRow.find("td:eq(0)").html(); // get current row 1st table cell TD value
	   		      
	   		         $.ajax({
					 	type: "delete",
					  	url: "${pageContext.request.contextPath}/admin/deleteGoods",
					  	cache: false,
		 			  	data: "&goodsID=" + goodsID,
		 			  	success: function(response){
						},
				  		error: function(){      
				   			alert(goodsID);
				  		}
					});
	   		    });
	   		});
		</script>-->
		<script type="text/javascript">
	   		$(document).ready(function(){
	   		    $("#table").on('click','.btnSelect',function(){
	   		         // get the current row
	   		         var currentRow=$(this).closest("tr"); 
	   		         var goodsID=currentRow.find("td:eq(0)").html(); // get current row 1st table cell TD value
	   		      
	   		         $.ajax({
					 	type: "post",
					  	url: "${pageContext.request.contextPath}/admin/deleteGoods",
					  	cache: false,
		 			  	data: "&goodsID=" + goodsID,
		 			  	success: function(response){
						},
				  		error: function(){      
				   			alert(goodsID);
				  		}
					});
	   		    });
	   		});
		</script>
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
	  		<h2 align = "center" >GOODS LIST</h2><br/><br/>            
				<table id="table" class="table table-hover">
			    	<thead>
			      		<tr>
					        <td>Goods ID</td>
					        <th>Category ID</th>
					        <th>Producer ID</th>
					        <th>Name</th>
					        <th>Price</th>
					        <th>Description</th>
					        <th>Available</th>
					        <th>First photo</th>
					        <th>Second photo</th>
					        <th>Third photo</th>
					        <th>Action</th>
			      		</tr>
			    	</thead>
			    <c:forEach var="goodsList" items="${goodsList}" varStatus="status">
			    	<tbody>
			      		<tr>
							<td>${goodsList.goodsID}</td>
							<td>${goodsList.goodsCategoryID}</td>
			                <td>${goodsList.goodsProducerID}</td>
			                <td>${goodsList.goodsName}</td>
			                <td>${goodsList.goodsPrice}</td>
			                <td>${goodsList.goodsDescr}</td>
			                <td>${goodsList.goodsAvail}</td>
			                <td><img src="http://localhost:8080/SombraProject/img/goods/${goodsList.goodsFirstImg}" class="img-thumbnail" width="50" height="50" ></td>
			                <td><img src="http://localhost:8080/SombraProject/img/goods/${goodsList.goodsSecondImg}" class="img-thumbnail" width="50" height="50" ></td>
			                <td><img src="http://localhost:8080/SombraProject/img/goods/${goodsList.goodsThirdImg}" class="img-thumbnail" width="50%" height="50" ></td>
			                <td>
			                <a href="${pageContext.request.contextPath}/admin/editingGoods?goodsID=${goodsList.goodsID}">Edit</a>
			                        &nbsp;&nbsp;&nbsp;&nbsp;
			                <button class="btnSelect">Select</button>						
			            	</td>
			      		</tr>
			    	</tbody>
			    </c:forEach>
			 </table>
		</div>
		
    </body>
</html>