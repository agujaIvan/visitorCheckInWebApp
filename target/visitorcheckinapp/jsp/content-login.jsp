<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--login start here-->
<section class="mbr-section form1 cid-qv7s7YQkMT" id="form1-73" data-rv-view="2688">
    <div class="container">
        <div class="row justify-content-center">
            <div class="title col-12 col-lg-8">
                <h2 class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
                    LOGIN</h2>
                <h3 class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
                    Provide your user name and password.
                </h3>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row justify-content-center">
            <div class="media-container-column col-lg-8" data-form-type="formoid">

                <form class="mbr-form" action="${pageContext.request.contextPath}/loginServlet" method="post">
                    <div class="row row-sm-offset">
                        <div class="col-md-4 multi-horizontal" data-for="userName">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userName">
                                        User Name</label>
                                <input type="text" class="form-control" name="userName" data-form-field="userName"
                                       id="userName" autofocus required>
                            </div>
                        </div>
                        <div class="col-md-4 multi-horizontal" data-for="userPassword">
                            <div class="form-group">
                                <label class="form-control-label mbr-fonts-style display-7" for="userPassword">
                                        Password</label>
                                <input type="password" class="form-control" name="userPassword"
                                       data-form-field="userPassword" id="userPassword" required>
                            </div>
                        </div>

                    </div>
                    <span class="input-group-btn"><button href="" type="submit" name="submit"
                                   class="btn btn-primary btn-form display-4">Login</button></span>
                </form>
            </div>
        </div>
    </div>
</section>
<!-- login finish here-->