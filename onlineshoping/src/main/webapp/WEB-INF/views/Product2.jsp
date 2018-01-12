<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
<div class="container">
<form:form  action="addpro" method="POST" modelAttribute="product" enctype="multipart/form-data"> 
<div class="form-group">

    <label >Product name</label>
    <form:input path="productname" value="${product.productname}" class="form-control"  type="text" />


    <label >Number of product</label>
    <form:input path="quantity" value="${product.quantity}" class="form-control" type="text" />
 

    <label >Enter price</label>
    <form:input path="price" value="${product.price}" class="form-control"  type="text" />
  

    <label >Product description</label>
    <form:input path="productdescription" value="${product.productdescription}" class="form-control input-lg"  type="text" />

<label>Select Image</label>
<form:input type="file" path="image" class="form-control" />
 </div>
<c:if test="${empty product.productname}">
<form:button  class="btn btn-default form-control" type="submit"> Add product</form:button>
</c:if>
<c:if test="${!empty product.productname}">
<form:button  class="btn btn-default form-control" type="submit" readonly="true"> Edit product</form:button>
</c:if>
</form:form> 
</div>
<div>
<c:if test="${!empty allproducts}">
	<table class="table table-bordered">
	<tr>
		<th>Product Id</th>
		<th>Product name</th>
		<th>Product Description</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Image</th>
	</tr>
	<c:forEach items="${allproducts }" var="product">
	<tr>
		<td>${product.id}</td>
		<td>${product.productname}</td>
		<td>${product.productdescription}</td>
		<td>${product.price}</td>
		<td>${product.quantity}</td>
		<td><img src="resources/images/${product.id}.jpg" width="100px" height="100 px"/> </td>
		<td><a href="updatepro-${product.id}"><button class="btn btn-primary" name="button"  type="submit">Update</button></a></td>
		<td><a href="deletepro-${product.id}"><button class="btn btn-primary" name="button"  type="submit">Remove</button></a></td>
	</tr>
	</c:forEach>
	
	</table>
	</c:if>
</div>
<jsp:include page="Footer.jsp" />

</body>
</html>