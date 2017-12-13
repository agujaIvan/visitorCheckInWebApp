<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link href="css/SignUpStyle.css" rel="stylesheet" />
    <script>
        function validateForm() {
            var password = document.forms["myForm"]["password"].value;
            var confirmPassword = document.forms["myForm"]["confirmPassword"].value;

            if (password != confirmPassword) {
                alert("The password doesnt match");
                return false;
            }
        }
    </script>
</head>
<body>
    <c:import url="/jsp/content-signupPage.jsp" />
</body>
</html>
