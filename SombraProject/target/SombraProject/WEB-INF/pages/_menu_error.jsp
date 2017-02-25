<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 
	<div style="border: 1px solid #ccc;padding:5px;margin-bottom:20px;">
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<a href="${pageContext.request.contextPath}/login">Logout</a>
	  	</c:if>
	</div>