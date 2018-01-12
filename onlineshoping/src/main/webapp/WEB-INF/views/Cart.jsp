<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
  
  <c:if test="${!empty cartpList }">
 
  
  <table class="table table-bordered">
  <tr>
  <th>Image</th>
  <th>Productname</th>
  <th>Price</th>
  </tr>
   <c:forEach items="${cartpList }" var="cartproductlist">
  <tr>
  <td><img alt="Bootstrap Thumbnail First" width="50%" height="100px" src="resources/images/${cartproductlist.cartproduct_id }.jpg"></td>
  <td>${cartproductlist.productName}</td>
  <td>Rs. ${cartproductlist.price }</td>

  <td><a class="btn btn-primary" href="remove-${cartproductlist.id}">remove</a></td>
  </tr>
  </c:forEach>
  </table>
  Total=${SUM}  <a class="btn btn-primary" href="Payment">Check out</a>
  </c:if>
  </div>
</body>
</html>