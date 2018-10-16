<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="account/saveAccount" method="post">
    账户:<input type="text" name="name"><br>
    余额:<input type="text" name="money"><br>
    <input type="submit" value="保存"><br>
</form>

<form action="account/transfer" method="post">
    账户A:<input type="text" name="old_id"><br>
    账户B:<input type="text" name="new_id"><br>
    余额:<input type="text" name="money"><br>
    <input type="submit" value="转账"><br>
</form>
</body>
</html>
