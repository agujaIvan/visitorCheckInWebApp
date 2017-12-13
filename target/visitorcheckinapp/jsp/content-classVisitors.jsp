<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="header11 cid-qv5CyvkyBc" id="header11-3x" data-rv-view="2583">
    <div class="container align-left"><div class="media-container-column mbr-white col-md-12"></div></div>
</section>

<!--table start here-->
<section class="section-table cid-qv5zEazjrk" id="table1-24" data-rv-view="2586">
    <div class="container container-table">
        <h2 class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">Visitors</h2>
        <div class="table-wrapper">
            <div class="container">
                <h3>${sectionVisitors.styleName} Lesson</h3>
                <p>${sectionVisitors.sectionDay} ${sectionVisitors.classStartTime}-${sectionVisitors.classEndTime}</p>
                <p>${sectionVisitors.userFirstName} ${sectionVisitors.userLastName}</p>
                <div class="row">
                        <div class="container scroll col-md-9">
                            <table class="table isSearch" cellspacing="0">
                                <thead>
                                <tr class="table-heads ">
                                    <th class="head-item mbr-fonts-style display-7">STATUS</th>
                                    <th class="head-item mbr-fonts-style display-7">SIGNED IN</th>
                                    <th class="head-item mbr-fonts-style display-7">NAME</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="visitors" items="${listOfVisitors}">
                                    <tr>
                                        <td class="body-item mbr-fonts-style display-7">
                                                ${visitors.statusName}</td>
                                        <td class="body-item mbr-fonts-style display-7">${visitors.whenSignedIn}</td>
                                        <td class="body-item mbr-fonts-style display-7">
                                                ${visitors.userName} - ${visitors.genderName}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    <div class="col-md-3 ">
                        <c:choose>
                            <c:when test = "${isInSection == 'yes'}">
                                <span><a href="${pageContext.request.contextPath}/ClassVisitorsServlet">
                                <button type="button"
                                        class="btn btn-primary display-7">REMOVE</button>
                                </a></span>
                            </c:when>
                            <c:otherwise>
                                <span><a href="${pageContext.request.contextPath}/ClassVisitorsServlet?signIn=true">
                                <button type="button"
                                        class="btn btn-primary display-7">SIGN IN</button>
                                </a></span>
                            </c:otherwise>
                        </c:choose>

                    </div>
                </div> <!---->
            </div>
        </div>
</section>
<!-- table finish here-->
