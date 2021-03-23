<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-03-23
  Time: 오전 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/board/reg">글등록</a>

    <c:forEach items="${list}" var="item">
        <div>${item.i_board}</div>
        <div>${item.title}</div>
        <div>${item.ctnt}</div>
    </c:forEach>
</body>
</html>
