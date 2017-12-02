<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link href="css/LoginStyle.css" rel="stylesheet" />
</head>
<body>
    <div class="modal">
        <form id="loginForm" action="${pageContext.request.contextPath}/loginServlet" method="post">
            <h3 style="color: red">${notFound}</h3>
            <h2>LOGIN</h2>
            <div class="container1">
                <p class="labels">Username</p>
                <input type="text" placeholder="Your username" id="username" name="userName" autofocus required />
                <p class="labels password">Password</p>
                <input type="password" placeholder="Your password" id="password" name="userPassword" required />
            </div>
            <div class="container2">
                <!--<input type="checkbox" />
                <p class="labels2">Login as an Teacher / Admin</p>
                <input type="checkbox" checked="checked" />
                <p class="labels2">Remember me</p>-->
            </div>
            <button type="submit" id="btnLogin" name="submit">Login</button>
        </form>
    </div>
</body>
</html>