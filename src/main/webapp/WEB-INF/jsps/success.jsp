<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by 蓝鸥科技有限公司  www.lanou3g.com.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>注册成功</h1>

姓名：${name}
<br>

密码：${pwd}
<br>

爱好：${hobbies}
<br>
<c:forEach items="${hobbies}" var="ho">
    ${ho}
</c:forEach>
<br>


</body>
</html>
