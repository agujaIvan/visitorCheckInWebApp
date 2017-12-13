<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    var shopcartSettings = {"shopcart_top_offset":120,"side_offset":20,"site_width":1150,"shopcart_icon_color":"#FFFFFF",
        "shopcart_back_color":"#2969b0", "shopcart_icon_size":48,"sc_count_color":"#FFFFFF","sc_count_back_color":"#fc26ae",
        "sc_count_size":12,"checkout_button":"Check Out with"};
</script>
<section class="menu cid-qv1frvgcz3" once="menu" id="menu1-s" data-rv-view="1070">

    <nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm
            bg-color transparent">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <div class="hamburger">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
            </div>
        </button>
        <div class="menu-logo">
            <div class="navbar-brand">
                <span class="navbar-caption-wrap"><a class="navbar-caption text-white display-4" href="#">
                    VISITOR CHECKIN APP</a></span>
            </div>
        </div>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav nav-dropdown" data-app-modern-menu="true">
                <li class="nav-item">
                    <a class="nav-link link text-white  display-4" href="${pageContext.request.contextPath}/LogOutServlet">LOGOUT</a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link link text-white dropdown-toggle display-4" href="page36.html"
                       data-toggle="dropdown-submenu" aria-expanded="false">${user.userName}</a>
                    <div class="dropdown-menu">
                        <a class="text-white dropdown-item display-4" href="${pageContext.request.contextPath}/jsp/editProfile.jsp">Edit profile<br></a>
                        <a class="text-white dropdown-item display-4" href="${pageContext.request.contextPath}/ChooseSectionServlet">List of sections<br></a>
                    </div>
                </li>
            </ul>
            <!--<div class="navbar-buttons mbr-section-btn">
                <a class="btn btn-sm btn-primary display-4" href="#">#</a>
            </div>-->
        </div>
    </nav>
</section>

<section class="engine"><a href="#">bootstrap modal</a>
</section>