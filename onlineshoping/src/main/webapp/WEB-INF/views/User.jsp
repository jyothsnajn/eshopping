<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="Header.jsp"/>

<form:form  action="userPro" method="POST" modelAttribute="user">
<div class="form-group">
    <label >User name</label>
    <form:input class="form-control input-lg" path="username" type="text" />
  </div>

<div class="form-group">
    <label>Password</label>
    <form:input class="form-control" path="userpassword" type="Password"/>
  </div>
<div class="form-group">
    <label >mail id</label>
    <form:input class="form-control input-lg" path="usermailid" type="email" />
  </div>
<div class="form-group">
    <label >Phone number</label>
    <form:input class="form-control" path="contactno" type="text"/>
  </div>

<input type="submit" class="btn btn-primary btn-block" value="Register"/>
</form:form>
<jsp:include page="Footer.jsp" /> 
</body>
</html>