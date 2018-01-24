<%--
  Created by 蓝鸥科技有限公司  www.lanou3g.com.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1>注册</h1>
<form action="/dealRegister" method="post">
    用户名：<input type="text" name="username">
    <br><br>

    密码：<input type="password" name="password">
    <br><br>

    爱好：
    <input type="checkbox" name="hobby" value="eat">
    吃饭
    <input type="checkbox" name="hobby" value="sleep">
    睡觉
    <input type="checkbox" name="hobby" value="fitting">
    打豆豆
    <br><br>

    <input type="submit" value="注册">
    <input type="reset" value="重置">


</form>


</body>
</html>
