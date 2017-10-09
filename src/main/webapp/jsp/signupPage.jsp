<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link href="css/SignUpStyle.css" rel="stylesheet" />
</head>
<body>
<div class="modal">
    <form id="signup" action="createUserServlet" method="post" >
        <h1>SIGN UP</h1>
        <div class="container divPhoto">
            <img src="images/img_user.png" />
        </div>
        <div class="container">
            <p class="left">Username</p>
            <input type="text" placeholder="Username" id="txtUsername" name="userName"/>
            <p class="left">First name</p>
            <input type="text" placeholder="First name" id="txtFirstname" name="firstName" />
            <p class="left">Last name</p>
            <input type="text" placeholder="Last name" id="txtLastname" name="lastName"/>
        </div>
        <div class="container">
            <p class="left">Email</p>
            <input type="text" placeholder="Email" id="txtEmail" name="email"/>
            <p class="left">Password</p>
            <input type="text" placeholder="Enter your password" id="txtPassword" name="password" />
            <p class="left">Re-password</p>
            <input type="text" placeholder="Your password again" id="txtRepassword"/>
        </div>
        <div class="container">
            <p class="left">Gender</p>
            <select id="genderList" name="gender">
                <option value="1">Male</option>
                <option value="2">Female</option>
                <option value="no-comment">No comment</option>
            </select>
        </div>
        <div id="botones">
            <button type="submit" id="btnCreate">Create</button>
            <button type="button" id="btnCancel">Cancel</button>
        </div>
    </form>
</div>
</body>
</html>
