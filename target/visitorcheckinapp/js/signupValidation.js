$(document).ready(function() {
    $("#editProfileForm").validate({
        rules: {
            password: {
                required: true,
                minlength: 4
            },
            confirm_password: {
                required: true,
                minlength: 4,
                equalTo: "#password"
            },

        },
        messages:{
            password: {
                required: "please enter the password",
                minlength: "it must contain 4 charaters"
            },
            confirm_password: {
                required: "please provide a match password",
                minlength: "it must contain 4 charaters",
                equalTo: "please enter the same password above"
            }
        }

    });
});