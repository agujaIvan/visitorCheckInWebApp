<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="mainDiv m-auto">
        <form class="myForm" action="${pageContext.request.contextPath}/StyleServlet" method="post">
            <div class="myContainers text-center">
                <div class="form-group">
                    <h2 class="p-4">Dance Style</h2>

                </div>
            </div>
            <div class="myContainers pl-5 pr-5">

                <div class="form-group row">
                    <label for="styleName" class="col-form-label col-md-2">Style name</label>
                    <div class="col-md-8">
                        <input type="text" id="styleName" class="form-control" placeholder="Style name"
                               name="styleName" required>
                    </div>
                </div>

            </div>
            <div class="myContainers">
                <div class="w-50 m-auto pt-5 pb-4">
                    <button class="form-control btn-primary" type="submit" name="submit" value="addStyleSave">Save</button>
                </div>
                <div class="w-50 m-auto pb-5">
                    <button class="form-control btn-outline-danger" type="button" name="submit"
                            value="addUserCancel"><a href="administrator.jsp">Cancel</a></button>
                </div>
            </div>
        </form>
    </div>
</div>