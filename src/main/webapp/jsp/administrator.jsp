<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Visitor Checkin Web App</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${user.userName}<span class="caret">

      </span></a>
        <ul class="dropdown-menu">
          <!--<li><a href="../editUserServlet?queryParameter=editUser">Edit profile</a></li>-->
          <li><a href="EditUserProfile.jsp">Edit profile</a></li>
          <li><a href="#">Add user</a></li>
          <li><a href="#">Report</a></li>
          <li><a href="#">Add a class</a></li>
        </ul>
      </li>
      <!--<li><a href="#">Page 2</a></li>-->
    </ul>
    <ul class="nav navbar-nav navbar-right">
		<li><img src="/images/img-photo2.png" class="img-circle" alt="Cinque Terre" width="50" height="40"> </li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Out</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Administrator web page</h3>

  <p>${message}</p>
</div>

</body>
</html>
