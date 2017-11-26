<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<c:set var="pageTitle" value="Edit user profile" scope="session" />
<c:import url="/jsp/head.jsp" />

<body>
    <c:import url="/jsp/navBar.jsp" />


    <div class="container">
        <div class="mainDiv m-auto">
            <form class="myForm" action="${pageContext.request.contextPath}/userServlet" method="post">
                <div class="myContainers text-center">
                    <div class="form-group">
                        <h2 class="p-4">EDIT USER PROFILE</h2>
                        <div class="">
                            <img src="${pageContext.request.contextPath}/images/img-photo2.png" alt="load photo" class="outside imgOut" />
                        </div>
                        <label>
                            <a href="#" class="btn btn-default">Upload photo</a>
                        </label>
                    </div>
                </div>
                <div class="myContainers pl-5 pr-5">
                    <div class="form-group row">
                        <label for="optionSelect" class="col-form-label col-md-2">Type</label>
                        <select class="custom-select ml-3" id="optionSelect" name="typeOfUser">
                            <option value="administrator">Administrator</option>
                            <option value="teacher">Teacher</option>
                            <option value="dancer">Dancer</option>
                        </select>
                    </div>

                    <div class="form-group row">
                        <label for="userName" class="col-form-label col-md-2">User name</label>
                        <div class="col-md-8">
                            <input type="text" id="userName" class="form-control" placeholder="User name"
                                   name="userName" value="${user.userName}" required DISABLED>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="email" class="col-form-label col-md-2">Email</label>
                        <div class="col-md-8">
                            <input type="email" id="email" class="form-control" placeholder="email address"
                                   name="email" value="${user.userEmail}" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="firstname" class="col-form-label col-md-2">Firstname</label>
                        <div class="col-md-8">
                            <input type="text" id="firstname" class="form-control" placeholder="your first name"
                                   name="firstName" value="${user.userFirstName}" required autofocus>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="lastname" class="col-form-label col-md-2">Lastname</label>
                        <div class="col-md-8">
                            <input type="text" id="lastname" class="form-control" placeholder="your last name"
                                   name="lastName" value="${user.userLastName}" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="genderSelect" class="col-form-label col-md-2">Gender</label>
                        <select class="custom-select ml-3" id="genderSelect" name="gender">
                            <option value="1">Male</option>
                            <option value="2">Female</option>
                        </select>
                    </div>

                    <div class="form-group row">
                        <label for="password" class="col-form-label col-md-2">Password</label>
                        <div class="col-md-8">
                            <input type="password" id="password" class="form-control" placeholder="your password"
                                   name="password" value="${user.userPassword}" required>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="rePassword" class="col-form-label col-md-2">Repeat password</label>
                        <div class="col-md-8">
                            <input type="password" id="rePassword" class="form-control" placeholder="repeat password"
                                   name="rePassword" value="${user.userPassword}" required>
                        </div>
                    </div>

                </div>
                <div class="myContainers">
                    <div class="w-50 m-auto pt-5 pb-4">
                        <button class="form-control btn-primary" type="submit" name="submit" value="editUser">Save</button>
                    </div>
                    <div class="w-50 m-auto pb-5">
                        <button class="form-control btn-outline-danger" type="submit" name="submit" value="cancel">
                            Cancel</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <c:import url="/js/jQuery.jsp" />
</body>
</html>
