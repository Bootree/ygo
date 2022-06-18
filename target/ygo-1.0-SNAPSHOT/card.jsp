<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<input type="button" value="新增" id="add"><br>
<div id="chaxunDiv">
    <form action="/ygo/selectBycnameServlet" method="post" id="form1">
        <p>查询<input id="sum" name="sum" type="text"></p>
        <div id="subDiv1">
            <input type="submit" class="button" value="查询">
        </div>
    </form>
</div>

<div id="ykdDiv">
    <form action="/ygo/add1Servlet" method="post" id="form2">
        <p>查询2<textarea id="ykd" name="ykd" >
           </textarea></p>
        <div id="subDiv2">
            <input type="submit" class="button" value="查询">
        </div>
    </form>
</div>
<hr>
<table border="1" cellspacing="0" width="100%">
    <tr>
        <th>序号</th>
        <th>卡密</th>
        <th>中文名</th>
        <th>英文名</th>
        <th>日文名</th>
        <th>卡图</th>
        <th>操作</th>

    </tr>


    <c:forEach items="${cards}" var="card" varStatus="status">
        <tr align="center">
            <td>${status.count}</td>
            <td>${card.id}</td>
            <td>${card.cname}</td>
            <td>${card.ename}</td>
            <td>${card.jname}</td>
            <td>${card.pic}</td>
            <td><a href="/ygo/selectByIdServlet?id=${card.id}">修改</a> <a href="/ygo/deleteByIdServlet?id=${card.id}">删除</a></td>
        </tr>

    </c:forEach>

</table>

<script>
    document.getElementById("add").onclick = function (){
        location.href = "/ygo/addCard.jsp";
    }

</script>
</body>
</html>