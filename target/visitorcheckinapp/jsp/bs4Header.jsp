<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="menu-0" data-rv-view="0">

    <nav class="navbar navbar-dropdown transparent navbar-fixed-top bg-color">
        <div class="container">

            <div class="mbr-table">
                <div class="mbr-table-cell">

                    <div class="navbar-brand">

                        <a class="navbar-caption" href="#">VISITOR CHECK IN APP</a>
                    </div>

                </div>
                <div class="mbr-table-cell">

                    <button class="navbar-toggler pull-xs-right hidden-md-up" type="button" data-toggle="collapse"
                            data-target="#exCollapsingNavbar">
                        <div class="hamburger-icon"></div>
                    </button>

                    <ul class="nav-dropdown collapse pull-xs-right nav navbar-nav navbar-toggleable-sm"
                        id="exCollapsingNavbar"><li class="nav-item">
                        <a class="nav-link link" href="${pageContext.request.contextPath}/LogOutServlet">
                            LOGOUT</a></li>


                        <li class="nav-item dropdown">
                            <a class="nav-link link dropdown-toggle" data-toggle="dropdown-submenu" href="#">${user.userName}</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/editProfile.jsp">Edit profile</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/AddUserServlet">Add user</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/CreateLessonServlet">Create class</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/danceStyle.jsp">add dance style</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/ChooseSectionServlet">List of sections</a>
                                <a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/adminPortal.jsp">Administrator</a>
                            </div>
                        </li>

                    </ul>

                    <button hidden="" class="navbar-toggler navbar-close" type="button" data-toggle="collapse"
                            data-target="#exCollapsingNavbar">
                        <div class="close-icon"></div>
                    </button>

                </div>
            </div>

        </div>
    </nav>

</section>