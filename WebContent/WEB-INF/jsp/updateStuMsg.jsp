<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/manager/editStu.action">
	<table>
		<tbody>
		<c:forEach items="${editUsersmsg }" var="editUsersmsg">		
		<tr>
			<td>工号</td>
			<td><input type="text" name="userId" id="userId" disabled="disabled" value="${editUsersmsg.userId }"></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="userName" id="userName" value="${editUsersmsg.userName }"></td>
		</tr>
		<tr>
			<td>性别</td>  
			<td><input type="text" name="gender" id="gender" disabled="disabled" value="${editUsersmsg.gender }"></td>
		</tr>
		<tr>
			<td>入学年份</td>
			<td><input type="text" name="enterYear" id="enterYear" disabled="disabled" value="${editUsersmsg.enterYear }"></td>
		</tr>
		<tr>
			<td>专业班级</td>
			<td><input type="text" name="className" id="className" value="${editUsersmsg.className }"></td>
		</tr>

		<tr>
			<td>具体方向</td>
			<td><input type="text" name="majorIn" id="majorIn" value="${editUsersmsg.majorIn }"></td>
		</tr>		
		<tr>
		<td colspan="2">
			<td colspan="2"><input type="submit" value="确认修改"></td>
		</td>			
		</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>