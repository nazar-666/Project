<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Editing producer</title>
		<link rel="stylesheet" href="http://localhost:8080/SombraProject/css/edit_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
			function editProducer(){
				var producerID = $("#producerID").val();
				var producerName = $("#producerName").val();
				var producerDescr = $("#producerDescr").val();
				var producerLogo = $("#producerLogo").val();
				
				if (producerName == ''){
		        	$('#name').html("Producer name field is empty");
		        	$('#img').html("");
				} else if (producerLogo == ''){
					$('#name').html("");
					$('#img').html("Producer image field is empty");
				} else {
					$('#name').html("");
					$('#img').html("");
				 	$.ajax({
				  		type: "post",
				  		url: "${pageContext.request.contextPath}/admin/editProducer",
				  		cache: false,    
	 			  		data: '&producerID=' + producerID + "&producerName=" + producerName + "&producerDescr=" + producerDescr + "&producerLogo=" + producerLogo,
	 			  		success: function(response){
	 			  			$("#producerName").val("");
	 						$("#producerDescr").val("");
	 						$("#producerLogo").val("");
	 			  			$('#result').html("You successful edit producer");
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
				<h1>Editing producer</h1>
		    </div>
			<table style="width:70%">
				<thead>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Producer ID</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="producerID" id="producerID" value='${editProducer.producerID}' disabled>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New producer name</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="producerName" id="producerName" value='${editProducer.producerName}' placeholder="category name">
							<div style = "color:red" id="name"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New producer description</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="producerDescr" id="producerDescr" value='${editProducer.producerDescr}' placeholder="category description">
							<div style = "color:red" id="descr"></div>
						</th>					
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">New producer image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="producerLogo" id="producerLogo" value='${editProducer.producerLogo}' placeholder="producer image">
							<div style = "color:red" id="img"></div>
						</th>
				</thead>
			</table>
			<div align="center" style="padding-top:15px; font-size:15px; color:green" id="result"></div> 
			
			<div align="center" class="form-group">
				<div style="padding-top:20px" class="col-sm-12">
					<input type="button" class="btn btn-primary" value="Edit Producer" onclick="editProducer()">
				</div>
			</div>
		</div>
	</body>
</html>