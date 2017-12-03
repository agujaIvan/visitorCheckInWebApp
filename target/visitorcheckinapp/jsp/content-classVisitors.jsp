<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="mainDiv col-sm-12 m-auto">
    <div class="container">
        <form class="myForm mt-3" method="get" action="${pageContext.request.contextPath}/ClassVisitorsServlet">
            <div class="row m-auto col-sm-12 d-block">
                <div class="pt-5 form-group text-center">
                    <h2 class="">VISITORS</h2>

                </div>
            </div>

            <div class="row m-auto d-block pt-3">
                <div class="container">
                    <div class="col-sm-12 m-auto">

                        <p class="">${sectionVisitors.styleName} lesson, ${sectionVisitors.sectionDay} ${sectionVisitors.classStartTime}-${sectionVisitors.classEndTime}</p>
                        <p>${sectionVisitors.userFirstName} ${sectionVisitors.userLastName}</p>
                        <table class="table-sm table-striped m-auto mt-3" id="tableClass">
                            <thead>
                            <tr>
                                <th>Status</th>
                                <th>Signed in</th>
                                <th>Name</th>
                                <th>Gender</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="visitors" items="${listOfVisitors}">
                                <tr>
                                    <td>${visitors.statusName}</td>
                                    <td>${visitors.whenSignedIn}</td>
                                    <td>${visitors.userName}</td>
                                    <td>${visitors.genderName}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="myContainers">
                <div class="w-50 m-auto pt-5 pb-4">
                    <button class="form-control btn-primary" type="submit" name="signIn" value="signIn">Sign in</button>
                </div>
            </div>
        </form>
    </div>
</div>