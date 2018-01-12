<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="Header.jsp">
<jsp:param name="title" value="My website"/>
</jsp:include>
<form:form  action="addsup" method="POST" modelAttribute="supplier"> 
<%-- <div class="form-group">
    <label for="inputdefault">Supplier Id</label>
    <form:input class="form-control" path="supid" type="text"/>
  </div> --%>
<div class="form-group">
    <label >Supplier name</label>
    <form:input class="form-control input-lg" path="supname" type="text"/>
  </div>

<div class="form-group">
    <label for="inputlg">Supplier address</label>
    <form:input class="form-control input-lg" path="supaddress" type="text"/>
  </div>
<button type="submit" class="btn btn-primary btn-block">Add Supplier</button>
</form:form>
<div>
	<c:if test="${!empty supplierlist}"></c:if>
	<table class="table table-bordered">
	<tr>
		<th>Supplier Id</th>
		<th>Supplier name</th>
		<th>Supplier address</th>
	</tr>
	<c:forEach items="${allSupplier }" var="sulist">
	<tr>
		<td>${sulist.supid}</td>
		<td>${sulist.supname}</td>
		<td>${sulist.supaddress}</td>
		<td><a href="updatesup-${sulist.supid}"><button class="btn btn-primary" name="button"  type="submit">Edit</button></a></td>
		<td><a href="deletesup-${sulist.supid}"><button class="btn btn-primary" name="button"  type="submit">Remove</button></a></td>
	</tr>
	</c:forEach>
	</table>
	</div>
	<jsp:include page="Footer.jsp" />
</body>
</html>