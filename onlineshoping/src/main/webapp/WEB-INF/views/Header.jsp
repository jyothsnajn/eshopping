<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Online Shopping</a>
    </div>
    <div class="navbar-menu">
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
     
            
     
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">men <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Pant</a></li>
          <li><a href="#">shirt</a></li>
          <li><a href="#">traditional</a></li>
          <li><a href="#">accessories</a></li>
          <li><a href="#">shoes</a></li>
        </ul>
      </li>
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">women <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Pant</a></li>
          <li><a href="#">shirt</a></li>
          <li><a href="#">traditional</a></li>
          <li><a href="#">accessories</a></li>
          <li><a href="#">shoes</a></li>
        </ul>
      </li>
      <ul class="nav navbar-nav navbar-right">
		<c:forEach items="${cList }" var="categorylist">
		<li>${categorylist.catid}</li>
		<li>${categorylist.categoryname}</li>
		</c:forEach>		

 		          
 		           
				<c:if test="${pageContext.request.userPrincipal.name  != null}">
			<li><a>Hello, ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href="<c:url value="/j_spring_security_logout"/>"><span
						class="glyphicon glyphicon-log-out" aria-hidden="true">Logout</span></a></li>
			</c:if>
		<c:if test="${pageContext.request.userPrincipal.name == 'Aparna'}">
     <li><a href="Admin">Admin</a></li>
     </c:if>
      </ul>
      
    
    <ul class="nav navbar-nav navbar-right">
    <c:if test="${pageContext.request.userPrincipal.name  == null}">
    	<li><a href="User" ><span class="glyphicon glyphicon-user" aria-hidden="true" ></span> Sign Up</a></li>
      <li><a href="LoginPage"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> Login</a></li>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name!='Aparna' }">
      <c:if test="${pageContext.request.userPrincipal.name!=null }">
      <li><a href="userCart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a>${cartSize}</li>
      </c:if>
      </c:if>
      
    </ul>
  </div>
  
</nav>
  
  
</body>
</html>