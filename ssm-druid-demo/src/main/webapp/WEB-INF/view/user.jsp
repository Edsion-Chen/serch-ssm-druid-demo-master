<%--
  Created by IntelliJ IDEA.
  User: MGZ
  Date: 2017/8/20
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    hello!${user.username}
    <p>返回主页<a href="${pageContext.request.contextPath}/user/show.do">index.jsp</a></p>
</body>
</html>
