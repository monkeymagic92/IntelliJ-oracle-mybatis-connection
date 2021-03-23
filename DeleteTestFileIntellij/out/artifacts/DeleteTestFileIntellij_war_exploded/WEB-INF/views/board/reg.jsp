<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-03-23
  Time: 오전 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="frm" action="/board/regPost" method="post">
        <input type="text" name="title" placeholder="제목">
        <input type="text" name="ctnt" placeholder="제목">
        <input type="hidden" name="i_board" value="1">
        <input type="hidden" name="i_user" value="${num}">
        <input type="submit" value="글등록">
    </form>

</body>
</html>
