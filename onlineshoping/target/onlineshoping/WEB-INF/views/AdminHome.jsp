<html lang="en">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
<jsp:include page="Header.jsp"></jsp:include>

<div class="container">  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="C:/Users/Srinivasarao/Pictures/ethnic-wear-for-women.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="C:/Users/Srinivasarao/Pictures/HTB1_II7KVXXXXbiXpXXq6xXFXXX5.jpg" alt="Chicago" style="width:100%;">
      </div>
    
    
      <div class="item">
        <img src="C:/Users/Srinivasarao/Pictures/1130967848_1681315390.jpg" alt="Chicago" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="C:/Users/Srinivasarao/Pictures/korean-fashionable-clothes.jpg" alt="New york" style="width:100%;">
      </div>
       <div class="item">
        <img src="C:/Users/Srinivasarao/Pictures/chikankari-sarees.jpg" alt="New york" style="width:100%;">
      </div>
       <div class="item">
        <img src="C:/Users/Srinivasarao/Pictures/images9MDPVP9Y.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
  <div class="container-fluid">
  <div class="row">
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories1.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessorie 2.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessorie 3.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
  </div>
</div>


<div class="container-fluid">
  <div class="row">
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 4.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 5.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 6.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
  </div>
</div>


<div class="container-fluid">
  <div class="row">
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 7.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 8.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
    <div class="col-sm-4" style="background-color:none;">
    <img src="C:/Users/Srinivasarao/Downloads/accessories 9.jpg" height="150px" width="200px"/>
    <button type="button" class="btn">Add to cart</button>
    <button type="button" class="btn btn-primary">Buy</button>
    </div>
  </div>
</div>
  <jsp:include page="Footer.jsp" />
</body>
</html>
