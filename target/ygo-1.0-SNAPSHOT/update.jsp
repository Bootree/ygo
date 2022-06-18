<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>修改卡片</title>
</head>
<body>
<h3>修改卡片</h3>
<form action="/ygo/updateServlet" method="post">


    卡密：<input name="id" value="${card.id}"><br>
    中文名：<input name="cname" value="${card.cname}"><br>
    英文名：<input name="ename" value="${card.ename}"><br>
    日文名：<input name="jname" value="${card.jname}"><br>
    图片：<input name="pic" value="${card.pic}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>