<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>New Category</title>
		<link rel="stylesheet" href="http://localhost:8080/SombraProject/css/edit_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
			function editCategory(){
				var categoryID = $("#categoryID").val();
				var categoryName = $("#categoryName").val();
				var categoryDescr = $("#categoryDescr").val();
				var categoryImg = $("#categoryImg").val();
				
				if (categoryName == ''){
		        	$('#name').html("Category name field is empty");
		        	$('#descr').html("");
		        	$('#img').html("");
				} else if (categoryDescr == ''){
					$('#name').html("");
		        	$('#descr').html("Category description field is empty");
		        	$('#img').html("");
				} else if (categoryImg == ''){
					$('#name').html("");
		        	$('#descr').html("");
					$('#img').html("Category image field is empty");
				} else {
					$('#name').html("");
					$('#descr').html("");
					$('#img').html("");
				 	$.ajax({
				  		type: "post",
				  		url: "${pageContext.request.contextPath}/admin/editCategory",
				  		cache: false,    
	 			  		data: '&categoryID=' + categoryID + "&categoryName=" + categoryName + "&categoryDescr=" + categoryDescr + "&categoryImg=" + categoryImg,
	 			  		success: function(response){
	 			  			$("#categoryName").val("");
	 						$("#categoryDescr").val("");
	 						$("#categoryImg").val("");
	 			  			$('#result').html("You successful edit you category ");
						},
				  		error: function(){      
				   			alert('Error while request..');
				  		}
					});
				 }
			}
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
    	    	
		<div class="container" align="center">
			<div style="padding-bottom:20px"class= "col-xs-12 border" align="center">
				<h1>Edit сategory</h1>
		    </div>
			<table style="width:70%">
				<thead>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Category ID</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="categoryID" id="categoryID" value='${editCategory.categoryID}' disabled>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New category name</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="categoryName" id="categoryName" value='${editCategory.categoryName}' placeholder="category name">
							<div style = "color:red" id="name"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New category description</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="categoryDescr" id="categoryDescr" value='${editCategory.categoryDescr}' placeholder="category description">
							<div style = "color:red" id="descr"></div>
						</th>					
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New category image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="categoryImg" id="categoryImg" value='${editCategory.categoryImg}' placeholder="category image">
							<div style = "color:red" id="img"></div>
						</th>
				</thead>
			</table>
			<div align="center" style="padding-top:15px; font-size:15px; color:green" id="result"></div> 
			
			<div align="center" class="form-group">
				<div style="padding-top:20px" class="col-sm-12">
					<input type="button" class="btn btn-primary" value="Edit category" onclick="editCategory()">
				</div>
			</div>
		</div>
	</body>
</html>