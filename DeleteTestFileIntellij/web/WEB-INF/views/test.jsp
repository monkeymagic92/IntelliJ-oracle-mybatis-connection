<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-03-22
  Time: 오후 5:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${name}
    테스트 페이지
    게시글 : ${vo.i_board}
    <br>
    제목 : ${vo.title}
    <br>
    내용 : ${vo.ctnt}
<br><br>
<hr>
    db 아디 : ${username}<br>
    db 비번 : ${password}
</body>
</html>
