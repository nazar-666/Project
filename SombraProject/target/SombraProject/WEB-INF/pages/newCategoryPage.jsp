<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>New Category</title>
		<link rel="stylesheet" href="css/edit_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<script type="text/javascript" language="javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
		<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		
		<script type="text/javascript">
			function madeAjaxCall(){
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
				  		url: "${pageContext.request.contextPath}/admin/addCategory",
				  		cache: false,    
	 			  		data: '&categoryName=' + categoryName + "&categoryDescr=" + categoryDescr + "&categoryImg=" + categoryImg,
	 			  		success: function(response){
	 			  			$("#categoryName").val("");
	 						$("#categoryDescr").val("");
	 						$("#categoryImg").val("");
	 						
	 			  			$('#result').html("You create new category: " + response.categoryName);
						},
				  		error: function(){      
				   			alert('Error while request..');
				  		}
					});
				 }
			}
		</script>
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
			
			<div style="padding-bottom:20px"class= "col-xs-12 border" align="center">
					<h1>New сategory</h1>
		        </div>
			<table align="center" style="width:70%">
				<thead>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Сategory name</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="categoryName" id="categoryName" value='' placeholder="category name">
							<div style = "color:red" id="name"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Category description</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="categoryDescr" id="categoryDescr" value='' placeholder="category description">
							<div style = "color:red" id="descr"></div>
						</th>					
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Category image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="categoryImg" id="categoryImg" value='' placeholder="category image">
							<div style = "color:red" id="img"></div>
						</th>
				</thead>
			</table>
			
			<div align="center" style="padding-top:15px; font-size:15px; color:green" id="result"></div> 
			
			<div align="center" class="form-group">
				<div style="padding-top:20px" class="col-sm-12">
					<input type="button" class="btn btn-primary" value="Ajax Submit" onclick="madeAjaxCall()">
				</div>
		</div>
	</body>
</html>