<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/register.action" method="post">
    工号：<input type="text" name="userId">
    密码：<input type="password" name="password">
    身份选择：<input type="radio" name="userState" value="user">学生
                <input type="radio" name="userState" value="teacher">教师
                <input type="radio" name="userState" value="admin">管理员
    <input type="submit" value="登录">
</form>
${msg}
</body>
</html>