<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<!--<head>
    <title>ADD STYLE</title>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/AddUserStyle.css" />
</head>-->
<c:set var="pageTitle" value="Administrator page" scope="session" />
<c:import url="/jsp/head.jsp" />

<body>
    <c:import url="/jsp/navBar.jsp" />


    <div class="container">
        <div class="mainDiv m-auto">
            
			<button type="button" class="btn btn-warning "><a href="danceStyle.jsp">Add dance style</a></button>
			
        </div>
      <h2 style="color: red">${message}</h2>
    </div>
    <c:import url="/js/jQuery.jsp" />
</body>
</html>
