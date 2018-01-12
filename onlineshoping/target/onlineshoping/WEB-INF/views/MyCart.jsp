<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<h3>
<br/>
<br/>
</h3>
</div>

<c:if test="${!empty cartlist}">
<table class="table table-condensed" align="center">
<tr>
<th width="125">Product name </th>
<th width="125">Image</th>
<th width="125">Price</th>
<th width="125">Delete</th>
</tr>
<tr>
<td></td>
</tr>
</table>
</c:if>
</body>
</html>