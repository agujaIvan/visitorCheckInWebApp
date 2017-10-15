<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link href="../css/EditUserProfile.css" rel="stylesheet" />
</head>
<body>
    <div class="modal">        
        <img src="images/img-photo2.png" alt="load photo" class="outside imgOut"/>
        <select class="outside list2">
            <option value="admin">Administrator</option>
            <option value="teacher">Teacher</option>
            <option value="dancer">Dancer</option>
        </select>
        <p class="outside textOut">Login as</p>            
    <form id="editUserPForm" action="../userServlet" method="post">
        <h2>EDIT USER PROFILE</h2>
        <div class="containers container1">                        
            <p class="labels">Evan Roger</p>           
            <img src="images/img-photo2.png" alt="load photo" /> 
        </div>
        <div class="containers container2">
            <p class="labels2">First Name</p>
            <input type="text" placeholder="your first name" id="txtFirstname" name="firstName" value="${user.userFirstName}" />
            <p class="labels2">Last Name</p>
            <input type="text" placeholder="your last name" id="txtLastname" name="lastName" value="${user.userLastName}" />
            <p class="labels2">Email</p>
            <input type="text" placeholder="your email" id="txtEmail" name="email" value="${user.userEmail}" />
            <p class="labels2">Password</p>
            <input type="password" placeholder="your password" id="txtPassword" name="password" value="${user.userPassword}" />
            <p class="labels2">Confirm Password</p>
            <input type="password" placeholder="confirm password" id="txtCpassword" />
        </div>
        <button type="submit" id="btnSave" name="submit" value="editUser">Save</button>
        <button type="button" id="btnCancel">Cancel</button>
    </form>
    </div>
</body>
</html>
