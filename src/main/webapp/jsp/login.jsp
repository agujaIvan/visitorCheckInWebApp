<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link href="css/LoginStyle.css" rel="stylesheet" />
</head>
<body>
    <div class="modal">
        <form id="loginForm">
            <h2>LOGIN</h2>
            <div class="container1">
                <p class="labels">Username</p>
                <input type="text" placeholder="Your username" id="username" />
                <p class="labels password">Password</p>
                <input type="password" placeholder="Your password" id="password" />
            </div>
            <div class="container2">
                <input type="checkbox" />
                <p class="labels2">Login as an Teacher / Admin</p>
                <input type="checkbox" checked="checked" />
                <p class="labels2">Remember me</p>
            </div>
            <button type="submit" id="btnLogin">Login</button>
        </form>
    </div>
</body>
</html>