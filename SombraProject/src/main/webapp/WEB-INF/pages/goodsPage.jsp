<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goods by category</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			function buyGoods(){
				var goodsID = ${choosedGoods.goodsID};
				$.ajax({
			  		type: "get",
			  		url: "${pageContext.request.contextPath}/client/buyGoods",
			  		cache: false,    
 			  		data: '&goodsID=' + goodsID,
 			  		success: function(response){
 			  			$('#added').html("Product successfully added into busket");
					},
			  		error: function(){      
			   			alert('Error while request..');
			  		}
				});
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
      					<li class="active"><a href="${pageContext.request.contextPath}/client">Home page</a></li>
   					</ul>
    				<ul class="nav navbar-nav navbar-right">
      					<li><a href="${pageContext.request.contextPath}/client/busket"><span class="glyphicon glyphicon-trash"></span>Busket</a></li>
      					<li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-off"></span> Log-out</a></li>
   					</ul>
  				</div>
			</nav>
    	</header> 
    	
    	<div class="container">
			<div id="photoes" class= "row border" align="center">
				<div class= "col-xs-4 border" align="center">
					<p><img src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsFirstImg}" height="350" width="350" class="img-thumbnail" data-toggle="modal" data-target=".main_Photo"></p>
					<h2>${choosedGoods.goodsName}</h2> 
				</div>
				<div class= "col-xs-8 border" >
					<div id="duscription_of_product" class= "row border">
						<div class= "col-xs-12 border">
							<div class= "col-xs-6 border" >
								<p><img align="middle" src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsSecondImg}" height="200" width="200" class="img-thumbnail" data-toggle="modal" data-target=".main_Photo"></p>
							</div>
							<div class= "col-xs-6 border" >
								<p><img align="middle" src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsThirdImg}" height="200" width="200" class="img-thumbnail" data-toggle="modal" data-target=".main_Photo"></p>
							</div>
						</div>
						<div class= "col-xs-12 border">
							<h2 align="center">Description of product</h2>
							<h4 align="left">${choosedGoods.goodsDescr}</h4>
							<h3 align="center">Producer</h3>
							<h4 align="left">${producerInfo.producerName}</h4>
							
						</div>
						<div class= "col-xs-12 border" align="left">
							<div align = "center" class= "col-xs-6 border">
								<h4>If you like it, buy it now!</h4>
								<div id="added" style="color:green"></div>
								<div style="padding-top:10px" class="col-sm-12">
									<input type="button" class="btn btn-primary" value="Buy now" onclick="buyGoods()">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade main_Photo" tabindex="-1" role="dialog" aria-labelledby="Main photo">
	 		<div class="modal-dialog modal-lg">
	    		<div class="modal-content">
	     			<div class="modal-header">
	        			<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        			<h4 class="modal-title" id="gridSystemModalLabel">${choosedGoods.goodsName}</h4>
	      			</div>	
	      			<div class="modal-body">
	  					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						    <!-- Indicators -->
						  	<ol class="carousel-indicators">
						   		<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						    	<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						    	<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						  	</ol>
						  	<!-- Wrapper for slides -->
						  	<div class="carousel-inner" role="listbox" align="center">
						    	<div class="item active">
								  	<img src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsFirstImg}" height="600" width="600">
								</div>
								<div class="item">
								  	<img src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsSecondImg}" height="600" width="600">
								</div>	
								<div class="item">
								  	<img src="http://localhost:8080/SombraProject/img/goods/${choosedGoods.goodsThirdImg}" height="600" width="600">
								</div>									  	
							</div>
							<!-- Controls -->
							<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						 		<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					    		<span class="sr-only">Previous</span>
						  	</a>
						  	<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						    	<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							  	<span class="sr-only">Next</span>
							</a>
						</div>
	  				</div>
	      			<div class="modal-footer">
	      				<h3 align="center" style="color:blue;">${choosedGoods.goodsName}</h3>
	       				<button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
	       			</div>
	   			</div>
	  		</div>
		</div>
    </body>
</html>