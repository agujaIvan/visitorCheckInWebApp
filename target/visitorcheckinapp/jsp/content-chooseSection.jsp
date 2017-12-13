<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<section class="header11 cid-qv5CDUA98n" id="header11-40" data-rv-view="1072">-->
<section class="header11 cid-qv5CyvkyBc" id="header11-3x" data-rv-view="2583">
    <div class="container align-left"><div class="media-container-column mbr-white col-md-12"></div></div>
</section>

<!--table start here-->
<section class="section-table cid-qv5zEazjrk" id="table1-24" data-rv-view="2586">
    <div class="container container-table">
        <h2 class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">List of sections</h2>
        <div class="table-wrapper">
            <div class="container">
                <div class="container scroll">
                    <table class="table isSearch" cellspacing="0">
                        <thead>
                        <tr class="table-heads ">
                            <th class="head-item mbr-fonts-style display-7">SCHEDULE</th>
                            <th class="head-item mbr-fonts-style display-7">CLASS</th>
                            <th class="head-item mbr-fonts-style display-7">TEACHER</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="list" items="${listOfSections}">
                            <tr>
                                <td class="body-item mbr-fonts-style display-7">
                                        ${list.sectionDay} ${list.classStartTime}-${list.classEndTime}</td>
                                <td class="body-item mbr-fonts-style display-7">
                                        <a href="${pageContext.request.contextPath}/ClassVisitorsServlet?id=${list.idSectionTable}">
                                                ${list.styleName}</a></td>
                                <td class="body-item mbr-fonts-style display-7">${list.userFirstName} ${list.userLastName}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
</section>
<!-- table finish here-->
