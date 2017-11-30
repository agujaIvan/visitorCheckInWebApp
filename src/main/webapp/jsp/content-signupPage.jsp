<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal">
    <form id="signup" action="${pageContext.request.contextPath}/userServlet" method="post" name="myForm" onsubmit="return validateForm()" >
        <h1>SIGN UP</h1>
        <div class="container divPhoto">
            <img src="${pageContext.request.contextPath}/images/img_user.png" />
        </div>
        <div class="container">
            <p class="left">Username</p>
            <input type="text" placeholder="Username" id="txtUsername" name="userName" required/>
            <p class="left">First name</p>
            <input type="text" placeholder="First name" id="txtFirstname" name="firstName" required />
            <p class="left">Last name</p>
            <input type="text" placeholder="Last name" id="txtLastname" name="lastName" required/>
        </div>
        <div class="container">
            <p class="left">Email</p>
            <input type="text" placeholder="Email" id="txtEmail" name="email" required/>
            <p class="left">Password</p>
            <input type="text" placeholder="Enter your password" id="txtPassword" name="password" required />
            <p class="left">Re-password</p>
            <input type="text" placeholder="Your password again" id="txtRepassword" name="confirmPassword" required/>
        </div>
        <div class="container">
            <p class="left">Gender</p>
            <select id="genderList" name="gender">
                <c:forEach var="list" items="${listOfGender}">
                    <option value="${list.idGenderTable}" selected>${list.genderName}</option>
                </c:forEach>
            </select>
        </div>
        <div id="botones">
            <button type="submit" id="btnCreate" name="submit" value="signup">Create</button>
            <button type="button" id="btnCancel"><a href="index.jsp">Cancel</a></button>
        </div>
    </form>
</div>