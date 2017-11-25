<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>ADD STYLE</title>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/AddUserStyle.css" />
</head>
<body>
    <c:import url="/jsp/navBar.jsp" />


    <div class="container">
        <div class="mainDiv m-auto">
            <form class="myForm" action="../StyleServlet" method="post">
                <div class="myContainers text-center">
                    <div class="form-group">
                        <h2 class="p-4">Dance Style</h2>
                        
                    </div>
                </div>
                <div class="myContainers pl-5 pr-5">
                   
                    <div class="form-group row">
                        <label for="name" class="col-form-label col-md-2">Style name</label>
                        <div class="col-md-8">
                            <input type="text" id="name" class="form-control" placeholder="Style name"
                                   name="name" required>
                        </div>
                    </div>

                </div>
                <div class="myContainers">
                    <div class="w-50 m-auto pt-5 pb-4">
                        <button class="form-control btn-primary" type="submit" name="submit" value="addStyleSave">Save</button>
                    </div>
                    <div class="w-50 m-auto pb-5">
                        <button class="form-control btn-outline-danger" type="button" name="submit"
                                value="addUserCancel"><a href="administrator.jsp">Cancel</a></button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <c:import url="/js/jQuery.jsp" />
</body>
</html>
