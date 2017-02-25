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
		<link rel="stylesheet" href="http://localhost:8080/SombraProject/css/edit_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
			function editGoods(){
				var regex = /^(\$|)([0-9]\d{0,2}(\,\d{3})*|([0-9]\d*))(\.\d{2})?$/;
				var goodsID = $("#goodsID").val();
				var goodsCategoryName = $("#goodsCategoryName option:selected").text();
				var goodsProducerName = $("#goodsProducerName option:selected").text();
				var goodsName = $("#goodsName").val();
				var goodsDescr = $("#goodsDescr").val();
				var goodsPrice = $("#goodsPrice").val();
				var goodsFirstImg = $("#goodsFirstImg").val();
				var goodsSecondImg = $("#goodsSecondImg").val();
				var goodsThirdImg = $("#goodsThirdImg").val(); 
				var passed = goodsPrice.match(regex);
				
				if (goodsCategoryName == 'Select category'){
					$('#category').html("Please choose category");
					$('#producer').html("");
		        	$('#name').html("");
		        	$('#price').html("");
		        	$('#firstImg').html("");
				}else if (goodsProducerName == 'Select producer'){
					$('#category').html("");
					$('#producer').html("Please choose producer");
		        	$('#name').html("");
		        	$('#price').html("");
		        	$('#firstImg').html("");
				} else if (goodsName == ''){
					$('#category').html("");
					$('#producer').html("");
		        	$('#name').html("Goods name field is empty");
		        	$('#price').html("");
		        	$('#firstImg').html("");
				} else if (passed == null) {
					$('#category').html("");
					$('#producer').html("");
					$('#name').html("");
					$('#price').html("Enter price only. For example: 523.36 or 0.20");
			      	$('#firstImg').html("");
		        } else if (goodsFirstImg == ''){
		        	$('#category').html("");
					$('#producer').html("");
					$('#name').html("");
					$('#price').html("");
					$('#firstImg').html("Goods image field is empty");
				} else {
					$('#category').html("");
					$('#producer').html("");
					$('#name').html("");
					$('#price').html("");
					$('#firstImg').html(""); 
					
				 	$.ajax({
				  		type: "post",
				  		url: "${pageContext.request.contextPath}/admin/updateGoods",
				  		cache: false,    
	 			  		data: '&goodsID=' + goodsID +
	 			  			"&goodsCategoryName=" + goodsCategoryName + 
	 			  			"&goodsProducerName=" + goodsProducerName + 
	 			  			"&goodsName=" + goodsName +
	 			  			'&goodsDescr=' + goodsDescr + 
	 			  			"&goodsPrice=" + goodsPrice + 
	 			  			"&goodsFirstImg=" + goodsFirstImg +
	 			  			"&goodsSecondImg=" + goodsSecondImg + 
	 			  			"&goodsThirdImg=" + goodsThirdImg,
	 			  		success: function(response){
	 			  			$("#goodsCategoryName option:selected").text("Select category");
	 			  			$("#goodsProducerName option:selected").text("Select producer");
	 			  			$("#goodsName").val("");
	 			  			$("#goodsDescr").val("");
	 			  			$("#goodsPrice").val("");
	 			  		 	$("#goodsFirstImg").val("");
	 			  		 	$("#goodsSecondImg").val("");
	 			  		 	$("#goodsThirdImg").val(""); 
	 			  		 	
	 			  			$('#result').html("You update goods: " + response.goodsName);
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
		
		
		<div class="container">
			<div style="padding-bottom:20px" class= "col-xs-12 border" align="center">
					<h1>Edit goods</h1>
		        </div>
			<table align="center" style="width:70%">
				<thead>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods ID</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="goodsID" id="goodsID" value='${editGoods.goodsID}' placeholder="goods id" disabled>
							<div style = "color:red" id="name"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods category</th>
						<th style = "text-align:center"> 
							<select name="goodsCategoryName" id="goodsCategoryName" style="height: 30px; width: 480px" >
								<option>Select category</option>
								<c:forEach var="categoryNameList" items="${categoryNameList}">
									<option>${categoryNameList}</option>
								</c:forEach>
							</select>
							<div style = "color:red" id="category"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods producer</th>
						<th style = "text-align:center"> 
							<select name="goodsProducerName" id="goodsProducerName" style="height: 30px; width: 480px" >
								<option >Select producer</option>
								<c:forEach var="producerNameList" items="${producerNameList}">
									<option>${producerNameList}</option>
								</c:forEach>
							</select>
							<div style = "color:red" id="producer"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods name</th>
						<th style = "text-align:center"> 
							<input type="text" class="form-control" name="goodsName" id="goodsName" value='${editGoods.goodsName}' placeholder="goods name">
							<div style = "color:red" id="name"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods price</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="goodsPrice" id="goodsPrice" value='${editGoods.goodsPrice}' placeholder="goods price">
							<div style = "color:red" id="price"></div>
						</th>					
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods description</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="goodsDescr" id="goodsDescr" value='${editGoods.goodsDescr}' placeholder="goods description">
							<div style = "color:red" id="description"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">First image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="goodsFirstImg" id="goodsFirstImg" value='${editGoods.goodsFirstImg}' placeholder="goods image">
							<div style = "color:red" id="firstImg"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Second image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="goodsSecondImg" id="goodsSecondImg" value='${editGoods.goodsSecondImg}' placeholder="goods image">
							<div style = "color:red" id="secondImg"></div>
						</th>
					</tr>
					<tr style = "text-align:center" >
						<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Third image</th>
						<th style = "text-align:center">
							<input type="text" class="form-control" name="goodsThirdImg" id="goodsThirdImg" value='${editGoods.goodsThirdImg}' placeholder="goods image">
							<div style = "color:red" id="thirdImg"></div>
						</th>
					</tr>
				</thead>
			</table>
			
			<div align="center" style="padding-top:15px; font-size:15px; color:green" id="result"></div> 
			
			<div align="center" class="form-group">
				<div style="padding-top:20px" class="col-sm-12">
					<input type="button" class="btn btn-primary" value="Ajax Submit" onclick="editGoods()">
				</div>
			</div>
		</div>
	</body>
</html>