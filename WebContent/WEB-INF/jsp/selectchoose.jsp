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
<title>已选课题</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/topic/list.action">
	<table>
		<tbody>
		<c:forEach items="${topicmsg}" var="topicmsg">
		<tr>
			<td>课题编号</td>
			<td>${topicmsg.TopicId }</td>
		</tr>
		<tr>
			<td>课题名称</td>
			<td>${topicmsg.TopicName }</td>
		</tr>
		<tr>
			<td>发布教师</td>
			<td></td>
		</tr>
		<tr>
			<td>具体要求</td>
			<td>${topicmsg.demand }</td>
		</tr>
		<tr>
			<td>人数限制</td>
			<td>${topicmsg.numberLimit }</td>
		</tr>
		<tr>
			<td>方向限制</td>
			<td>${topicmsg.majorLimit }</td>
		</tr>
		<tr>
			<td>截止日期</td>
			<td>${topicmsg.deadline }</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="删除该课题并重新选择课题" ></td>
			<td></td>
		</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>