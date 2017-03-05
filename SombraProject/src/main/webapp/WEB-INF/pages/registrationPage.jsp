<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 
 <html>
	<head>
		<title>LOGIN PAGE</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/start_form.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
		<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){	
				$('#password').keyup(function() {
					$('#passwd').html(checkStrength($('#password').val()));
				});
				
				$('#repeatPasswd').keyup(function() {
					$('#repPasswd').html(checkEquals($('#password').val(), $('#repeatPasswd').val()));
				});
			});
			function checkEquals(password, repeatPasswd){
				if (password == repeatPasswd){
					$('#repPasswd').removeClass();
					$('#repPasswd').addClass('equal');
					return 'The same passwords';
				}else{
					$('#repPasswd').removeClass();
					$('#repPasswd').addClass('notEqual');
					return 'Not a same passwords';
				}
			}
			
			function checkStrength(password) {
				var strength = 0;
				if (password.length < 4) {
					$('#passwd').removeClass();
					$('#passwd').addClass('short');
					return 'Too short';
				}
				if (password.length > 4) strength += 1;
				// If password contains both lower and uppercase characters, increase strength value.
				if (password.match(/([a-z].*[A-Z])|([A-Z].*[a-z])/)) strength += 1;
				// If it has numbers and characters, increase strength value.
				if (password.match(/([a-zA-Z])/) && password.match(/([0-9])/)) strength += 1;
				// If it has one special character, increase strength value.
				if (password.match(/([!,%,&,@,#,$,^,*,?,_,~])/)) strength += 1;
				// If it has two special characters, increase strength value.
				if (password.match(/(.*[!,%,&,@,#,$,^,*,?,_,~].*[!,%,&,@,#,$,^,*,?,_,~])/)) strength += 1;
				if (strength < 2) {
					$('#passwd').removeClass();
					$('#passwd').addClass('weak');
					return 'Weak';
				} else if (strength == 2) {
					$('#passwd').removeClass();
					$('#passwd').addClass('good');
					return 'Good';
				} else {
					$('#passwd').removeClass();
					$('#passwd').addClass('strong');
					return 'Strong';
				}
			}
			
			
			function registerNow(){
				var emailReg = /^([a-z0-9_\.-])+@[a-z0-9-]+\.([a-z]{2,4}\.)?[a-z]{2,4}$/i;
				var login = $("#login").val();
				var clientName = $("#clientName").val();
				var clientSurname = $("#clientSurname").val();
				var date = $('#clientDate').val();
				var clientEmail=$("#clientEmail").val();
				var password = $('#password').val();
				var repeatPasswd = $("#repeatPasswd").val();
				
				if (login.length<5){
		        	$('#logIN').html("Field Login should be at least 5 character");
		        	$('#name').html("");
		        	$('#surname').html("");
		        	$('#date').html("");
		        	$('#email').html("");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("");
				} else if (clientName.length < 2){
					$('#logIN').html("");
		        	$('#name').html("Field Name should be at least 2 character");
		        	$('#surname').html("");
		        	$('#date').html("");
		        	$('#email').html("");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("");
				}else if (clientSurname.length < 2){
					$('#logIN').html("");
		        	$('#name').html("");
		        	$('#surname').html("Field Surname should be at least 2 character");
		        	$('#date').html("");
		        	$('#email').html("");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("");
				}else if (date==''){
					$('#logIN').html("");
		        	$('#name').html("");
		        	$('#surname').html("");
		        	$('#date').html("Date of birth field is empty");
		        	$('#email').html("");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("");
				}else if (!emailReg.test(clientEmail)){
					$('#logIN').html("");
		        	$('#name').html("");
		        	$('#surname').html("");
		        	$('#date').html("");
		        	$('#email').html("E-mail field is not correct");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("");
				}else if (checkStrength($('#password').val())=='Too short'){
					$('#logIN').html("");
		        	$('#name').html("");
		        	$('#surname').html("");
		        	$('#date').html("");
		        	$('#email').html("");
		        	$('#passwd').removeClass();
					$('#passwd').addClass('short');
		        	$('#repPasswd').html("");
				}else if (repeatPasswd != password){
					$('#logIN').html("");
		        	$('#name').html("");
		        	$('#surname').html("");
		        	$('#date').html("");
		        	$('#email').html("");
		        	$('#passwd').html("");
		        	$('#repPasswd').html("Repeat password field isn't equal password field");
				} else{ 
					$('#logIN').html("");
	        		$('#name').html("");
	        		$('#surname').html("");
	        		$('#date').html("");
	        		$('#email').html("");
	        		$('#passwd').html("");
	        		$('#repPasswd').html("");
					$.ajax({
				  		type: "post",
				  		url: "${pageContext.request.contextPath}/registration",
				  		cache: false,    
	 			  		data: '&login=' + login + 
	 			  			"&clientName=" + clientName + 
	 			  			"&clientSurname=" + clientSurname + 
	 			  			"&clientDate=" + date +
	 			  			"&clientEmail=" + clientEmail +
	 			  			"&password=" + password,
	 			  			
	 			  		success: function(response){
	 			  			$("#login").val("");
	 						$("#clientName").val("");
	 						$("#clientSurname").val("");
	 						$("#clientDate").val("");
	 						$("#clientEmail").val("");
	 						$("#password").val("");
	 						$("#repeatPasswd").val("");
	 		
	 						$('#result').html("You create new user: " + response.clientName);
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
		<h1 align="center">Registration area</h1>
		<div id="main" align="right" class="form-group">
			<div class="form-group">
    			<label class="col-sm-4 control-label">Login</label>
   				<div class="col-sm-6">
					<input type="text" class="form-control" name="login" id="login" placeholder="nazar-666">
					<div align="center" style = "color:red" id="logIN"></div>
				</div>
			</div>
			<div class="form-group">
    			<label class="col-sm-4 control-label">Name</label>
   				<div class="col-sm-6">
					<input type="text" class="form-control" name="clientName" id="clientName" placeholder="Nazar">
					<div align="center" style = "color:red" id="name"></div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">Surname</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="clientSurname" id="clientSurname" placeholder="Motruk">
					<div align="center" style = "color:red" id="surname"></div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">Date of Birth</label>
				<div class="col-sm-6">
					<input type="date" class="form-control" name="clientDate" id="clientDate">
					<div align="center" style = "color:red" id="date"></div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 control-label">E-mail</label>
				<div class="col-sm-6">
			  		<input type="email" class="form-control" name="clientEmail" id="clientEmail" placeholder="nazar-666@yandex.ua">
					<div align="center" style = "color:red" id="email"></div>
				</div>
			</div>
			
			<div class="form-group">
				<form id="passwdRes">
					<label class="col-sm-4 control-label">Password</label>
					<div class="col-sm-6">
						<input type="password" class="form-control" name="password" id="password" placeholder="Password">
							<div align="center" id="passwd"></div>
					</div>
				</form>
			</div>
		
			<div class="form-group">
				<form id="repPasswdRes">
					<label class="col-sm-4 control-label">Repeat password</label>
					<div class="col-sm-6">
						<input type="password" class="form-control" name="repeatPasswd" id="repeatPasswd" placeholder="Password">
						<div align="center" id="repPasswd"></div>
					</div>
				</form>
			</div>
		</div>
		
		 
		<div class="col-sm-12">	
			<div align="center" style="padding-top:15px; font-size:15px; color:green" id="result"></div>
			<div align="center" class="col-sm-12">
				<input type="button" class="btn btn-primary" value="Register Now" onclick="registerNow()">
			</div>
			<div align="center" class="col-sm-12">
		       	<a class="btn btn-primary" data-toggle="modal" href="${pageContext.request.contextPath}/login">Back</a>
		    </div>
		</div>	
	</body>			
</html>
