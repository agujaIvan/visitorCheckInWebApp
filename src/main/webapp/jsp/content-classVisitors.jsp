<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="mainDiv col-sm-12 m-auto">
    <div class="container">
        <form class="myForm mt-3">
            <div class="row m-auto col-sm-12 d-block">
                <div class="pt-5 form-group text-center">
                    <h2 class="">VISITORS</h2>
                    <h3 class="">Daniel Banderas</h3>
                </div>
            </div>

            <div class="row m-auto d-block pt-3">
                <div class="container">
                    <div class="col-sm-12 m-auto">
                        <table class="table-sm table-striped m-auto mt-3" id="tableClass">
                            <thead>
                            <tr>
                                <th>Status</th>
                                <th>Signed in</th>
                                <th>Name</th>
                                <th>Gender</th>
                                <th class="lastCol"></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="list" items="${listOfClasses}">
                                <tr>
                                    <th scope="row">${list.classDays}</th>
                                    <td>${list.classStartTime}-${list.classEndTime}</td>
                                    <td><a href="">${list.styleName}</a></td>
                                    <td>${list.userFirstName} ${list.userLastName}</td>
                                    <td class="lastCol">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                        </label>
                                    </td>
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