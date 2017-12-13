<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<c:set var="pageTitle" value="Unregister user" scope="session" />
<c:import url="/jsp/bs4Head.jsp" />


<body>
<section class="mbr-section mbr-section-hero mbr-section-full mbr-parallax-background" id="header1-8"
         data-rv-view="6" style="background-image: url(${pageContext.request.contextPath}/assets/images/unregister2-1920x1280.jpg);">

    <div class="mbr-table-cell">

        <div class="container">
            <div class="row">
                <div class="mbr-section col-md-10 col-md-offset-1 text-xs-center">

                    <h1 class="mbr-section-title display-1">UNREGISTER USER</h1>
                    <p class="mbr-section-lead lead">Sorry but you either have to login or signup on this app</p>
                    <div class="mbr-section-btn"><a class="btn btn-lg btn-primary" href="${pageContext.request.contextPath}/index.jsp">GO BACK TO THE APP</a> </div>
                </div>
            </div>
        </div>
    </div>

</section>
<c:import url="/jsp/bs4JavaScriptLinks.jsp" />

  </body>
</html>