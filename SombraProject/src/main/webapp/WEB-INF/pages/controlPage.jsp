<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding information</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  		<script type="text/javascript">
			function createCategory(){
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
	 						
	 			  			$('#categoryResult').html("You create new category: " + response.categoryName);
						},
				  		error: function(){      
				   			alert('Error while request..');
				  		}
					});
				 }
			}
			
			function createGoods(){
				var regex = /^(\$|)([0-9]\d{0,2}(\,\d{3})*|([0-9]\d*))(\.\d{2})?$/;
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
				  		url: "${pageContext.request.contextPath}/admin/addGoods",
				  		cache: false,    
	 			  		data: '&goodsCategoryName=' + goodsCategoryName + 
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
	 			  		 	
	 			  			$('#goodsResult').html("You create new goods: " + response.goodsName);
						},
				  		error: function(){      
				   			alert('Error while request..');
				  		}
					});
				 }
			}
			
			function createProducer(){
				var producerName = $("#producerName").val();
				var producerDescr = $("#producerDescr").val();
				var producerLogo = $("#producerLogo").val();
				
				if (producerName == ''){
		        	$('#name').html("Producer name field is empty");
		        	$('#img').html("");
				} else if (producerLogo == ''){
					$('#name').html("");
					$('#img').html("Producer logo field is empty");
				} else {
					$('#name').html("");
					$('#img').html("");
				 	$.ajax({
				  		type: "post",
				  		url: "${pageContext.request.contextPath}/admin/addProducer",
				  		cache: false,    
	 			  		data: '&producerName=' + producerName + "&producerDescr=" + producerDescr + "&producerLogo=" + producerLogo,
	 			  		success: function(response){
	 			  			$("#producerName").val("");
	 						$("#producerDescr").val("");
	 						$("#producerLogo").val("");
	 						
	 			  			$('#producerResult').html("You create new category: " + response.producerName);
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
	    	<ul class="nav nav-tabs">
		    	<li class="active"><a data-toggle="tab" href="#addCategory">New category</a></li>
		  		<li><a data-toggle="tab" href="#addGoods">New goods</a></li>
		  		<li><a data-toggle="tab" href="$#addProducer">New producer</a></li>
			</ul>
			
			<div class="tab-content">
				<p></p>
	    		<div align="center" id="addCategory" class="tab-pane fade in active">
	      			<table style="width:70%">
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
					<div align="center" style="padding-top:15px; font-size:15px; color:green" id="categoryResult"></div> 					
					<div align="center" class="form-group">
						<div style="padding-top:20px" class="col-sm-12">
							<input type="button" class="btn btn-primary" value="Create category" onclick="createCategory()">
						</div>
					</div>
	      		</div>
	      		
	      		
			    <div align="center" id="addGoods" class="tab-pane fade">
					<table style="width:70%">
						<thead>
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
									<input type="text" class="form-control" name="goodsName" id="goodsName" value='' placeholder="goods name">
									<div style = "color:red" id="name"></div>
								</th>
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods price</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="goodsPrice" id="goodsPrice" value='' placeholder="goods price">
									<div style = "color:red" id="price"></div>
								</th>					
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Goods description</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="goodsDescr" id="goodsDescr" value='' placeholder="goods description">
									<div style = "color:red" id="description"></div>
								</th>
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">First image</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="goodsFirstImg" id="goodsFirstImg" value='' placeholder="goods image">
									<div style = "color:red" id="firstImg"></div>
								</th>
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Second image</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="goodsSecondImg" id="goodsSecondImg" value='' placeholder="goods image">
									<div style = "color:red" id="secondImg"></div>
								</th>
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Third image</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="goodsThirdImg" id="goodsThirdImg" value='' placeholder="goods image">
									<div style = "color:red" id="thirdImg"></div>
								</th>
							</tr>
						</thead>
					</table>					
					<div align="center" style="padding-top:15px; font-size:15px; color:green" id="goodsResult"></div> 					
					<div align="center" class="form-group">
						<div style="padding-top:20px" class="col-sm-12">
							<input type="button" class="btn btn-primary" value="Create goods" onclick="createGoods()">
						</div>
					</div>
			    </div>
			    
			    
			    <div align="center" id="addProducer" class="tab-pane fade">
			    	<table style="width:70%">
						<thead>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Producer name</th>
								<th style = "text-align:center"> 
									<input type="text" class="form-control" name="producerName" id="producerName" value='' placeholder="Producer name">
									<div style = "color:red" id="name"></div>
								</th>
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Producer description</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="producerDescr" id="producerDescr" value='' placeholder="Producer description">
									<div style = "color:red" id="descr"></div>
								</th>					
							</tr>
							<tr style = "text-align:center" >
								<th style = "vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%">Producer image</th>
								<th style = "text-align:center">
									<input type="text" class="form-control" name="producerLogo" id="producerLogo" value='' placeholder="Producer logo">
									<div style = "color:red" id="img"></div>
								</th>
						</thead>
					</table>		
					<div align="center" style="padding-top:15px; font-size:15px; color:green" id="producerResult"></div> 					
					<div align="center" class="form-group">
						<div style="padding-top:20px" class="col-sm-12">
							<input type="button" class="btn btn-primary" value="Create producer" onclick="createProducer()">
						</div>
					</div>			    
				</div>
	 		</div>
	 	</div>
	</body>
</html>