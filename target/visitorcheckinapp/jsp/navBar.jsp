<nav class="navbar navbar-toggleable-sm navbar-inverse bg-inverse">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="navbar-brand text-white" href="#">VISITOR CHECK IN WEB APP</a>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item active mr-5">
                <a class="nav-link text-white" href="../index.jsp">Home</a>
            </li>
            <li class="nav-item mr-4">
                <a class="nav-link text-white" href="#"><img class= "rounded-circle" src="../images/img_user.png" width="40" id="myImg"/>Sign Out</a>
            </li>
        </ul>
        <div class="btn-group">
            <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                    aria-expanded="false">${user.userName}
            </button>
            <div class="dropdown-menu myDropdownMenu ">
                <a class="dropdown-item" href="EditUserProfile.jsp">Edit profile</a>
                <a class="dropdown-item" href="AddUser.jsp">Add user</a>
                <a class="dropdown-item" href="#">Add class</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="administrator.jsp">Administrator</a>
            </div>
        </div>
    </div>
</nav>