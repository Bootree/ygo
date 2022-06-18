<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加卡片</title>
</head>
<body>
<h3>添加卡片</h3>
<form action="/ygo/addServlet" method="post">
    卡密：<input name="id"><br>
    中文名：<input name="cname"><br>
    英文名：<input name="ename"><br>
    日文名：<input name="jname"><br>
    图片：<input name="pic"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>