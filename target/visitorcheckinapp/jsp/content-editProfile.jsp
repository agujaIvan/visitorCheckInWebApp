<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    var shopcartSettings = {"shopcart_top_offset":120,"side_offset":20,"site_width":1150,"shopcart_icon_color":"#FFFFFF",
        "shopcart_back_color":"#2969b0", "shopcart_icon_size":48,"sc_count_color":"#FFFFFF","sc_count_back_color":"#fc26ae",
        "sc_count_size":12,"checkout_button":"Check Out with"};
</script>

<section class="engine">
    <a href="https://mobirise.co/n">bootstrap modal</a>
</section>

<section class="header11 cid-qv5CDUA98n" id="header11-40" data-rv-view="1072">
    <div class="container align-left">
        <div class="media-container-column mbr-white col-md-12"></div>
    </div>
</section>

<section class="mbr-section form1 cid-qv5ApHdm7c mbr-parallax-background" id="form1-4t" data-rv-view="2418">

    <div class="mbr-overlay" style="opacity: 0.7; background-color: rgb(239, 239, 239);">
    </div>
    <div class="container">
        <div class="row justify-content-center">
            <div class="title col-12 col-lg-8">
                <<h2 class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">EDIT PROFILE</h2>

            </div>
        </div>
    </div>
    <div class="container">
        <div class="row justify-content-center">
            <div class="media-container-column col-lg-8" data-form-type="formoid">
                <div data-form-alert="" hidden="">
                    Thanks for filling out the form!
                </div>

                <form class="mbr-form" action="${pageContext.request.contextPath}/userServlet" method="post" id="editProfileForm">
                    <div class="row row-sm-offset">
                        <div class="col-md-6 multi-horizontal" data-for="userName">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userName-form1-4t">
                                    User</label>
                                <input type="text" class="form-control" name="userName" value="${user.userName}"
                                       data-form-field="userName" id="userName-form1-4t" disabled>
                            </div>

                        </div>
                        <div class="col-md-6 multi-horizontal" data-for="userRole">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userRole-form1-4t">
                                    Type</label>
                                <input type="text" class="form-control" name="userRole" data-form-field="userRole"
                                       value="${user.userRole}" id="userRole-form1-4t" disabled>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="userGender">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userGender-form1-4t">
                                    Gender</label>
                                <input type="text" class="form-control" name="userGender" data-form-field="userGender"
                                       value="${user.genderName}" id="userGender-form1-4t" disabled>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="firstName">
                            <div class="form-group has-success has-feedback">
                                <label class="form-control-label mbr-fonts-style display-7" for="firstName">
                                    First Name</label>
                                <input type="text" class="form-control" name="firstName" data-form-field="firstName"
                                       value="${user.userFirstName}" id="firstName" required>
                                <span class="glyphicon glyphicon-ok form-control-feedback"></span>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="lastName">
                            <div class="form-group has-success has-feedback">
                                <label class="form-control-label mbr-fonts-style display-7" for="lastName">
                                    Last Name</label>
                                <input type="text" class="form-control" name="lastName" data-form-field="lastName"
                                       value="${user.userLastName}" id="lastName" required>
                                <span class="glyphicon glyphicon-ok form-control-feedback"></span>
                            </div>
                        </div>

                        <div class="col-md-6 multi-horizontal" data-for="password">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="password-form1-4t">
                                    Password</label>
                                <input type="password" class="form-control" name="password" data-form-field="password"
                                       value="${user.userPassword}" id="password-form1-4t" required>
                            </div>
                        </div>

                        <div class="col-md-12 multi-horizontal" data-for="email">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="email">
                                    Email</label>
                                <input type="email" class="form-control" name="email" data-form-field="Email" required
                                       value="${user.userEmail}" id="email">
                            </div>

                        </div>

                        <div class="col-md-4 multi-horizontal">
                            <span class="input-group-btn form-group">
                                <button href="" type="submit" name="submit" value="editUser"
                                        class="btn btn-primary btn-form display-4">UPDATE</button>
                            </span>
                        </div>
                </form>
            </div>
        </div>
    </div>
</section>

<!-- from here-->
