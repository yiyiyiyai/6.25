<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>增加学生填写信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/manager/addStu.action" >
	<h1>学生信息</h1>
	<tabele>
		<tr>
			<td>工号</td>
			<td><input type="text" name="userId" id="userId"></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="userName" id="userName"></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><input type="text" name="gender" id="gender"></td>
		</tr>
		<tr>
			<td>入学年份</td>
			<td><input type="text" name="enterYear" id="enterYear"></td>
		</tr>
		<tr>
			<td>专业班级</td>
			<td><input type="text" name="className" id="className"></td>
		</tr>
		<tr>
			<td>具体方向</td>
			<td><input type="text" name="majorIn" id="majorIn"></td>
		</tr>
		<tr>			
			<td colspan="2"><input type="submit" value="提交"></td>
		</tr>
	</tabele>
</form>
</body>
</html>