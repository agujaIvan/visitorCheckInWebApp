<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--login start here-->
<section class="mbr-section form1 cid-qv7s7YQkMT" id="form1-73" data-rv-view="2688">
    <div class="container">
        <div class="row justify-content-center">
            <div class="title col-12 col-lg-8">
                <h2 class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
                    WELCOME TO THE TEAM</h2>
                <h3 class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
                    Go ahead and signup.
                </h3>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row justify-content-center">
            <div class="media-container-column col-lg-8" data-form-type="formoid">

                <form class="mbr-form" action="${pageContext.request.contextPath}/userServlet" method="post" id="editProfileForm">
                    <div class="row row-sm-offset">
                        <div class="col-md-6 multi-horizontal" data-for="userName">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userName-form1-4t">
                                    User</label>
                                <input type="text" class="form-control" name="userName"
                                       data-form-field="userName" id="userName-form1-4t" autofocus required>
                            </div>

                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="type">

                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="gender">Gender:</label>
                                <select class="form-control"  id="gender" name="gender">
                                    <c:forEach var="list" items="${listOfGender}">
                                        <option value="${list.idGenderTable}" selected>${list.genderName}</option>
                                    </c:forEach>
                                </select>
                            </div>

                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="firstName">
                            <div class="form-group has-success has-feedback">
                                <label class="form-control-label mbr-fonts-style display-7" for="firstName">
                                    First Name</label>
                                <input type="text" class="form-control" name="firstName" data-form-field="firstName"
                                       id="firstName" required>
                                <span class="glyphicon glyphicon-ok form-control-feedback"></span>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="lastName">
                            <div class="form-group has-success has-feedback">
                                <label class="form-control-label mbr-fonts-style display-7" for="lastName">
                                    Last Name</label>
                                <input type="text" class="form-control" name="lastName" data-form-field="lastName"
                                       id="lastName" required>
                                <span class="glyphicon glyphicon-ok form-control-feedback"></span>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="password">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="password">
                                    Password</label>
                                <input type="password" class="form-control" name="password" data-form-field="password"
                                       id="password" required>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="confirm_password">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="confirm_password">
                                    Confirm Password</label>
                                <input type="password" class="form-control" name="confirm_password"
                                       data-form-field="confirm_password" id="confirm_password" required>
                            </div>
                        </div>


                        <div class="col-md-12 multi-horizontal" data-for="email">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="email">
                                    Email</label>
                                <input type="email" class="form-control" name="email" data-form-field="Email" required=""
                                       id="email">
                            </div>

                        </div>

                        <div class="col-md-4 multi-horizontal">
                            <span class="input-group-btn form-group">
                                <button href="" type="submit" name="submit" value="signup"
                                        class="btn btn-primary btn-form display-4">SIGNUP</button>
                            </span>
                        </div>
                </form>
            </div>
        </div>
    </div>
</section>

<!-- login finish here-->