<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="main">
<div class="mainDiv col-sm-12 m-auto">
    <div class="container">
        <form class="myForm mt-3">
            <div class="row m-auto col-sm-12 d-block">
                <div class="pt-5 form-group text-center">
                    <h2 class="">SECTIONS</h2>
                </div>
            </div>

            <div class="row m-auto d-block pt-3">
                <div class="container">
                    <div class="col-sm-12 m-auto">
                        <table class="table-sm table-striped m-auto mt-3" id="tableClass">
                            <thead>
                            <tr>
                                <th>Date</th>
                                <th>Schedule</th>
                                <th>Class</th>
                                <th>Teacher</th>
                                <th class="lastCol"></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="list" items="${listOfSections}">
                                <tr>
                                    <th scope="row">${list.sectionDay}</th>
                                    <td>${list.classStartTime}-${list.classEndTime}</td>
                                    <td><a href="${pageContext.request.contextPath}/ClassVisitorsServlet?id=${list.idSectionTable}">${list.styleName}</a></td>
                                    <td>${list.userFirstName} ${list.userLastName}</td>
                                    <!--<td class="lastCol">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                        </label>
                                    </td>-->
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</div>