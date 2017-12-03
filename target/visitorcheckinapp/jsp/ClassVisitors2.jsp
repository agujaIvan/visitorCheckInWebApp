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
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        body{
            background-image:url('./images/infinito.jpg');
        }

        .bgWhite{background-color: white}

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {height: 450px}

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            /*background-color: #f1f1f1;*/

            height: 100%;
        }


        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }
            .row.content {height:auto;}
        }
    </style>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Visitors check in app</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">${user.userName}<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/jsp/EditUserProfile.jsp">Edit profile</a></li>
                        <li><a href="${pageContext.request.contextPath}/jsp/AddUser.jsp">Add user</a></li>
                        <li><a href="${pageContext.request.contextPath}/CreateLessonServlet">Create class</a></li>
                        <li><a href="${pageContext.request.contextPath}/jsp/danceStyle.jsp">add dance style</a></li>
                        <li><a href="${pageContext.request.contextPath}/jsp/administrator.jsp">Administrator</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">

                <li><a href="${pageContext.request.contextPath}/LogOutServlet"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
            </ul>
        </div>
    </div>
</nav>


<div class="container-fluid text-center">
    <div id="mainContainer" class="m-auto">
        <div class="row content">
            <div class="col-sm-2 ">

            </div>

            <div class="col-sm-8 text-left bgWhite">
                <h3>${sectionVisitors.styleName} Lesson</h3>
                <p>${sectionVisitors.sectionDay} ${sectionVisitors.classStartTime}-${sectionVisitors.classEndTime}</p>
                <p>${sectionVisitors.userFirstName} ${sectionVisitors.userLastName}</p>
                <div class="row">
                    <div class="col-sm-2">

                    </div>

                    <div class="col-sm-8">
                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>Status</th>
                                <th>Signed in</th>
                                <th>Name</th>
                                <th>Gender</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="visitors" items="${listOfVisitors}">
                                <tr>
                                    <td>${visitors.statusName}</td>
                                    <td>${visitors.whenSignedIn}</td>
                                    <td>${visitors.userName}</td>
                                    <td>${visitors.genderName}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>

                    <div class="col-sm-2">
                        <a href="${pageContext.request.contextPath}/ClassVisitorsServlet" class="btn btn-info btn-lg">
                            <span class="glyphicon glyphicon-plus"></span> SignIn
                        </a>
                    </div>
                </div>
            </div>

            <div class="col-sm-2 sidenav">

            </div>
        </div>

    </div>
</div>
</body>
</html>
