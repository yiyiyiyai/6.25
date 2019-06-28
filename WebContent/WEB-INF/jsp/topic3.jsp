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
<title>管理员课程界面</title>
</head>
<body>	
	登录用户：${LOGIN_SESSION.userId}	
	<h1>管理员学生管理</h1>		
	<a href="<%=basePath%>manager/toaddStu.action">增加</a>							
	<form method="get" action="${pageContext.request.contextPath }/manager/list.action">		
			<table>
			<tr>
				<td>工号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>入学年份</td>
				<td>班级</td>
				<td>方向</td>
				<td>是否已选课</td>
				<td><button type="submit">查询</button></td>
			</tr><br>
			<tr>
				<td><input type="text" id="userId" value="${userId }" name="userId"></td>
				<td><input type="text" id="userName" value="${userName }" name="userName"></td>				
				<td><input type="text" id="gender" value="${gender }" name="gender"></td>
				<td><input type="text" id="enterYear" value="${enterYear }" name="enterYear"></td>
				<td><input type="text" id="className" value="${className }" name="className"></td>
				<td><input type="text" id="majorIn" value="${majorIn }" name="majorIn"></td>
				<td><input type="text" id="selectedSignal" value="${selectedSignal }" name="selectedSignal"></td>
				<td></td>
			</tr>
		</table>
		<table>
			<thead>
				<tr>
					<td>工号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>入学年份</td>
					<td>班级</td>
					<td>方向</td>
					<td>是否已选课</td>				
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${students}" var="students">
					<tr>
						<td>${students.userId }</td>
						<td>${students.userName }</td>
						<td>${students.gender }</td>
						<td>${students.enterYear }</td>
						<td>${students.className }</td>
						<td>${students.majorIn }</td>			
						<td>${students.selectedSignal }</td>
						<td>
							<a href="<%=basePath%>manager/deleteStu.action?userId=${students.userId }">删除</a>							
							<a href="<%=basePath%>manager/toeditStu.action?userId=${students.userId }">修改</a>							
						</td>						
					</tr>
				</c:forEach>
			</tbody>
			
		</table>		
	</form>
</body>
</html>