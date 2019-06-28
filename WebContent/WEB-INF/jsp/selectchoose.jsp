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
<title>我选择的课题</title>
</head>
<body>
<form >
	<table>
	登录用户：${USER_SESSION.userId}
		<tbody>
		<c:forEach items="${mytopicmsg}" var="mytopicmsg">
		<tr>
			<td>课题编号</td>
			<td>${mytopicmsg.topicId }</td>
		</tr>
		<tr>
			<td>课题名称</td>
			<td>${mytopicmsg.topicName }</td>
		</tr>
		<tr>
			<td>发布教师</td>
			<td>${mytopicmsg.userName }</td>
		</tr>
		<tr>
			<td>具体要求</td>
			<td>${mytopicmsg.demand }</td>
		</tr>
		<tr>
			<td>人数限制</td>
			<td>${mytopicmsg.numberLimit }</td>
		</tr>
		<tr>
			<td>已选人数</td>
			<td>${mytopicmsg.numberNow }</td>
		</tr>
		<tr>
			<td>方向限制</td>
			<td>${mytopicmsg.majorLimit }</td>
		</tr>
		<tr>
			<td>截止日期</td>
			<td>${mytopicmsg.deadline }</td>
		</tr>
		<tr>
			<td colspan="2">
			<a href="<%=basePath%>topic/deletemychoose.action?userId=${USER_SESSION.userId}" >删除该课题</a>
			</td>
			<td></td>
		</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>