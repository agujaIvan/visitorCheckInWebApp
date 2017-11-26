<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<c:set var="pageTitle" value="Create Lesson / Class" scope="session" />
<c:import url="/jsp/head.jsp" />
<body>

    <c:import url="/jsp/navBar.jsp" />
    <div class="container">
        <div class="mainDiv m-auto">
            <form class="myForm mt-3" method="post" action="${pageContext.request.contextPath}/CreateLessonServlet">
                <div class="row m-auto">
                    <h2 class="text-center ml-auto mr-auto mt-4">LESSON CLASS</h2>
                    <div class="form-group form-inline m-auto p-4">
                        <label for="user" class="col-form-label col-sm-2">Teacher</label>
                        <select class="custom-select col-sm-4" id="user" name="user">
                            <c:forEach var="users" items="${listOfUsers}">
                            <option value="${users.idUserTable}">${users.userFirstName} ${users.userLastName} </option>
                            </c:forEach>

                        </select>
                        <label for="category" class="col-form-label col-sm-3">Style</label>
                        <select class="custom-select col-sm-3" id="category" name="category">

                            <c:forEach var="styles" items="${listOfStyles}">
                            <option value="${styles.idStyleTable}">${styles.styleName}</option>
                            </c:forEach>

                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="daysDiv m-auto">
                        <h2 class="text-center mb-4">DAYS</h2>
                        <div class="text-center chkDivs sunDiv rounded-circle">
                            <label class="myDaysLabel">Sun</label>
                            <label class="custom-control custom-checkbox" id="lblSun">
                                <input type="checkbox" class="custom-control-input" id="chkSun" name="chkSun" value="Sunday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                        <div class="text-center chkDivs monDiv rounded-circle">
                            <label class="myDaysLabel">Mon</label>
                            <label class="custom-control custom-checkbox" id="lblMon">
                                <input type="checkbox" class="custom-control-input" id="chkMon" name="chkMon" value="Monday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                        <div class="text-center chkDivs tueDiv rounded-circle">
                            <label class="myDaysLabel">Tue</label>
                            <label class="custom-control custom-checkbox" id="lblTue">
                                <input type="checkbox" class="custom-control-input" id="chkTue" name="chkTue" value="Tuesday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                        <div class="text-center chkDivs wedDiv rounded-circle">
                            <label class="myDaysLabel">Wed</label>
                            <label class="custom-control custom-checkbox" id="lblWed">
                                <input type="checkbox" class="custom-control-input" id="chkWed" name="chkWed" value="Wednesday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                        <div class="text-center chkDivs thuDiv rounded-circle">
                            <label class="myDaysLabel">Thu</label>
                            <label class="custom-control custom-checkbox" id="lblThu">
                                <input type="checkbox" class="custom-control-input" id="chkThu" name="chkThu" value="Thursday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="daysDiv m-auto">
                        <div class="text-center chkDivs friDiv rounded-circle">
                            <label class="myDaysLabel">Fri</label>
                            <label class="custom-control custom-checkbox" id="lblFri" >
                                <input type="checkbox" class="custom-control-input" id="chkFri" name="chkFri" value="Friday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                        <div class="text-center chkDivs satDiv rounded-circle">
                            <label class="myDaysLabel">Sat</label>
                            <label class="custom-control custom-checkbox" id="lblSat">
                                <input type="checkbox" class="custom-control-input" id="chkSat" name="chkSat" value="Saturday">
                                <span class="custom-control-indicator"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="daysDiv pt-4 m-auto">
                        <div class="form-group form-check-inline pr-2">
                            <label for="from" class="form-control-label">From:</label>
                            <input type="time" class="form-control" id="from" name="from" />
                        </div>
                        <div class="form-group form-check-inline">
                            <label for="to" class="form-control-label">To:</label>
                            <input type="time" class="form-control" id="to" name="to" />
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="daysDiv p-2 m-auto">
                        <div class="form-group form-check-inline m-auto pr-2">
                            <label for="classStartDate" class="form-control-label">Starting Date:</label>
                            <input type="date" class="form-control" id="classStartDate" name="classStartDate" />

                        </div>
                        <div class="form-group form-check-inline m-auto">
                            <label for="classEndDate" class="form-control-label">Ending Date:</label>
                            <input type="date" class="form-control" id="classEndDate" name="classEndDate" />
                        </div>
                    </div>
                </div>
                <div class="myContainers">
                    <div class="w-50 m-auto pt-5 pb-4">
                        <button class="form-control btn-primary" type="submit" value="createClass">Save</button>
                    </div>
                    <div class="w-50 m-auto pb-5">
                        <button class="form-control btn-outline-danger">Cancel</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
</body>
</html>
