<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/style.css">
	<title>Bootstrap Example</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 </head>





<body>
<div>
<div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding-8 w3-card-2">
    <a href="welcome.html" class="w3-margin-left w3-bar-item w3-button"><b>CW</b> CarWash</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">      
		<a href="welcome.html" class="w3-bar-item w3-button">Kaart</a>
      	<a href="pakkumised.html" class="w3-bar-item w3-button">Pakkumised</a>
      	<a href="blog.html" class="w3-bar-item w3-button w3-margin-right">Blog</a>
      	<a href="meist.html" class="w3-bar-item w3-button w3-margin-right">Meist</a>
    </div>
  </div>
</div>
</div>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/fishoop.jpg" alt="New York" width="1200" height="700">
        <div class="carousel-caption">
          <h3>Fishoop OU</h3>
          <p>Punane tn 73, 13619, Tallinn, Estonia.</p>
		  <p>www.fishoop.com</p>
        </div>      
      </div>

      <div class="item">
        <img src="images/fishoop.jpg" alt="Chicago" width="1200" height="700">
        <div class="carousel-caption">
          <h3>Chicago</h3>
          <p>Thank you, Chicago - A night we won't forget.</p>
        </div>      
      </div>
    
      <div class="item">
        <img src="images/fishoop.jpg" alt="Los Angeles" width="1200" height="700">
        <div class="carousel-caption">
          <h3>LA</h3>
          <p>Even though the traffic was a mess, we had the best time playing at Venice Beach!</p>
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<div class="container text-center">
  <h3>Meie partnerid</h3>
  <p><em>Me anname kõige paremat meie klienditele!</em></p>
  <p>Meie partnerid kes suudavad meile selle eesmärki täidata</p>
  <br>
  <div class="row">
  
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="images/fishoop.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
    </div>
	
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="images/fishoop.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
    </div>
	
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="images/fishoop.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a> 
    </div>
	
	
  </div>
</div>

<div>
<div class="w3-bottom">
  <div class="w3-bar w3-white w3-wide w3-padding-8 w3-card-2">
    <a href="#home" class="w3-margin-left w3-bar-item w3-button"><b>CW</b> CarWash</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
        <a class="facebook" href="https://www.facebook.com/nikita.vlassenkov.5?fref=ts"><img src="images/facebook.jpg"></a>
		<a class="facebook" href="https://www.instagram.com/artjom.njumainen/"><img src="images/instagram.png"></a>
        <a class="facebook" href="https://www.instagram.com/nikitavlassenkov/"><img src="images/instagram.png"></a>
        <a class="facebook" href="https://www.instagram.com/kaldma_/"><img src="images/instagram.png"></a>
    </div>
  </div>
</div>
    </div>
</body>
</html>
