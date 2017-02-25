<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Category</title>
		<link rel="stylesheet" href="css/edit_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<script type="text/javascript" language="javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
		<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>
		<script type="text/javascript">
		function madeAjaxCall(){
		 $.ajax({
		  type: "post",
		  url: "${pageContext.request.contextPath}/newCategory",
		  cache: false,    
		  data:'categoryName=' + $("#categoryName").val() + "&categoryDescr;=" + $("#categoryDescr").val() + "&categoryImg;=" + $("#categoryImg").val(),
		  success: function(response){
		   $('#result').html("");
		   var obj = JSON.parse(response);
		   $('#result').html("categoryName:- " + obj.categoryName +"</br>categoryDescr:- " + obj.categoryDescr  + "</br>categoryImg:- " + obj.categoryImg);
		  },
		  error: function(){      
		   alert('Error while request..');
		  }
		 });
		}
	</script>

</head>
<body>
	<form:form action="saveCategory" method="post" modelAttribute="category">
<%-- 	<form:hidden path="categoryID"/> --%>
    		<nav class="navbar navbar-inverse">
  				<div class="container-fluid">
    				<div class="navbar-header">
     					<a class="navbar-brand">Sombra Shop</a>
    				</div>
    				<ul class="nav navbar-nav">
      					<li class="active"><a href="${pageContext.request.contextPath}/categories">Home page</a></li>
      					<li><a href="${pageContext.request.contextPath}/newCategory">New category</a></li>
      					<li><a href="#">Page 2</a></li>
   					</ul>
    				<ul class="nav navbar-nav navbar-right">
      					<li><a href="#"><span class="glyphicon glyphicon-user"></span>Admin</a></li>
      					<li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Log-out</a></li>
   					</ul>
  				</div>
			</nav>
			
				<div align="center" class="form-group" id="page">
					<div id="page" class= "col-xs-12 border" align="center">
						<h1>New/Edit Category</h1>
		            </div>
					<div id="page" class="form-group">
						<label class="col-sm-4 control-label">Category name</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="categoryName" id="categoryName" placeholder="category name">
						</div>
					</div>
					<div id="page" class="form-group">
						<label class="col-sm-4 control-label">Category description</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="categoryDescr" id="categoryDescr" placeholder="category name">
						</div>
					</div>
					<div id="page" class="form-group">
						<label class="col-sm-4 control-label">Category image</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="categoryImg" id="categoryImg" placeholder="category name">
						</div>
					</div>
					
				</div>
				
				<div id="page" align="center" class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary" value="Submit"> SAVE</button>
						<input type="button" value="Ajax Submit" onclick="madeAjaxCall();">
					</div>
				</div>
		</form:form>
		
		<div id="result"></div>
	</body>
</html>