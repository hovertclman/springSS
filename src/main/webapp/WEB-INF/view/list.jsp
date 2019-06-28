<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/26
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>所有用户</h2>
<table border="1" width="600">
    <tr>
        <th>编号</th><th>姓名</th><th>密码</th><th>操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td><td>${user.name}</td><td>${user.pwd}</td><td>修改删除</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
