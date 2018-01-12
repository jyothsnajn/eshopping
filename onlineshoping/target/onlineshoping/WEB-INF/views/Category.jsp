<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width-device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
	</head>
<body>
<jsp:include page="Header.jsp">
<jsp:param name="title" value="My website"/>
</jsp:include>
	<form:form  action="category" method="POST" modelAttribute="addcategory"> 
<div class="form-group">
	<label >Category Name</label>
    <form:input path="categoryname" class="form-control"  type="text" />
	
	<form:button type="submit" class="btn btn-default form-control" value="/addcategory"> Add category</form:button>
</div>
	</form:form>
<div>
	<div>
	<c:if test="${!empty Category}"></c:if>
	<table class="table table-bordered">
	<tr>
		<th>Category Id</th>
		<th>Category name</th>
	</tr>
	<c:forEach items="${allcategory }" var="category">
	<tr>
		<td>${category.catid}</td>
		<td>${category.categoryname}</td>
		<td><a href="editcategory-${category.catid}"><button type="button" class="btn btn-primary">Edit</button></a></td>
		<td><a href="delete-${category.catid}"><button type="button" class="btn btn-primary">Delete</button></a></td>
	</tr>
	</c:forEach>
</div>
<jsp:include page="Footer.jsp" />
</body>
</html>