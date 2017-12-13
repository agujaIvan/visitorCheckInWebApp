<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<c:set var="pageTitle" value="Home page" scope="session" />
<c:import url="/jsp/bs4Head.jsp" />

<body>
<section class="mbr-section mbr-section-hero mbr-section-full mbr-parallax-background" id="header1-3" data-rv-view="6"
         style="background-image: url(${pageContext.request.contextPath}/bs4/assets/images/bglandpage-2000x1129.jpg);">

    <div class="mbr-table-cell">

        <div class="container">
            <div class="row">
                <div class="mbr-section col-md-10 col-md-offset-1 text-xs-center">

                    <h1 class="mbr-section-title display-1">VISITOR CHECK IN APP</h1>
                    <p class="mbr-section-lead lead">Have fun dancing!</p>
                    <div class="mbr-section-btn"><a class="btn btn-lg btn-primary" href="${pageContext.request.contextPath}/jsp/login.jsp">
                        LOGIN</a> <a class="btn btn-lg btn-success-outline btn-success" href="${pageContext.request.contextPath}/signupPage">
                        SIGNUP</a></div>
                </div>
            </div>
        </div>
    </div>
</section>

<c:import url="/jsp/bs4JavaScriptLinks.jsp" />
  </body>
</html>