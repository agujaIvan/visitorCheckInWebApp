<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/HomePageStyle.css"/>


</head>
<body>
<div class="modal">
    <form id="homePage" action="${pageContext.request.contextPath}/HomePageServlet">
        <h2>Visitor Check in App</h2>
        <button type="submit" id="btnRegistered" name="submit" value="registered">Registered User</button>
        <!--<button type="submit" id="btnGuest" name="submit" value="guest">Guest</button>-->
        <span><a href="signupPage">New Sign Up?</a></span>
    </form>
</div>
</body>
</html>