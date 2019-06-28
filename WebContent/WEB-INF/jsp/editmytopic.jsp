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
<title>修改课题界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/teacher/editThistopic.action" method="post">
	<table>
	登录用户：${USER_SESSION.userId}
		<tbody>
		<c:forEach items="${edittopicsmsg}" var="edittopicsmsg">
		<tr>
			<td>课题编号</td>
			<td><input type="text" value="${edittopicsmsg.topicId } " disabled="disabled"/></td>
		</tr>
		<tr>
			<td>课题名称</td>
			<td><input type="text" value="${edittopicsmsg.topicName }" /></td>
		</tr>
		<tr>
			<td>发布教师</td>  
			<td><input type="text" value="${edittopicsmsg.userName } " disabled="disabled" /></td>
		</tr>
		<tr>
			<td>具体要求</td>
			<td><input type="text" value="${edittopicsmsg.demand }" /></td>
		</tr>
		<tr>
			<td>人数限制</td>
			<td><input type="text" value="${edittopicsmsg.numberLimit }" /></td>
		</tr>

		<tr>
			<td>方向限制</td>
			<td><input type="text" value="${edittopicsmsg.majorLimit }" /></td>
		</tr>
		<tr>
			<td>截止日期</td>
			<td><input type="text" value="${edittopicsmsg.deadline }" /></td>
		</tr>
		<tr>
			<td>发布年份</td>
			<td><input type="text" value="${edittopicsmsg.topicYear }" /></td>
		</tr>
		<tr>
			<td>是否发布</td>
			<td><input type="text" value="${edittopicsmsg.releaseSingal }" /></td> 	
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