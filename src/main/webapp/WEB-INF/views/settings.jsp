<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Email Settings</title>
</head>
<body>

<h2>Settings</h2>
<%--@elvariable id="settings" type="com.example.emailsettingsapp.model.Settings"--%>
<form:form method="post" action="${pageContext.request.contextPath}/settings" modelAttribute="settings">
    <div>
        <label>Language:</label>
        <form:select path="language">
            <form:options items="${languages}"/>
        </form:select>
    </div>

    <br>

    <div>
        <label>Page Size:</label>
        <form:select path="pageSize">
            <form:options items="${pageSizes}"/>
        </form:select>
    </div>

    <br>

    <div>
        <label>Spam Filter:</label>
        <form:checkbox path="spamFilter"/>
    </div>

    <br>

    <div>
        <label>Signature:</label><br>
        <form:textarea path="signature" rows="4" cols="40"/>
    </div>

    <br>

    <button type="submit">Update</button>

</form:form>

</body>
</html>