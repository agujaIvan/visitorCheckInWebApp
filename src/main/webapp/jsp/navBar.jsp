<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-toggleable-sm navbar-inverse bg-inverse">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="navbar-brand text-white" href="#">VISITOR CHECK IN WEB APP</a>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item active mr-5">
                <a class="nav-link text-white" href="${pageContext.request.contextPath}/index.jsp">Home</a>
            </li>
            <li class="nav-item mr-4">
                <a class="nav-link text-white" href="#"><img class= "rounded-circle" src="${pageContext.request.contextPath}/images/img_user.png" width="40" id="myImg"/>Sign Out</a>
            </li>
        </ul>
        <div class="btn-group">
            <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                    aria-expanded="false">${user.userName}
            </button>
            <div class="dropdown-menu myDropdownMenu ">
                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/EditUserProfile.jsp">Edit profile</a>
                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/AddUser.jsp">Add user</a>
                <a class="dropdown-item" href="${pageContext.request.contextPath}/CreateLessonServlet">Create class</a>
                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/danceStyle.jsp">add dance style</a>
                <!--todo add a link to choose a section -->
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/administrator.jsp">Administrator</a>
            </div>
        </div>
    </div>
</nav>