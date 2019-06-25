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
<title>教师课程界面</title>
</head>
<body>	
	<h1>课程管理</h1>
	<a href="#">查看我的课题</a>
	<a>删除该课题</a>
	<a>修改该课题</a>
	<a href="#">结束所有课题</a>
	<form method="get" action="${pageContext.request.contextPath }/topic2/list.action" >		
			<table>
			<tr>
				<td>课题编号</td>
				<td>课题名称</td>
				<td>出题老师</td>
				<td><button type="submit">查询</button></td>
			</tr><br>
			<tr>
				<td><input type="text" id="topicId" value="${topicId }" name="topicId"></td>
				<td><input type="text" id="topicName" value="${topicName }" name="topicName"></td>				
				<td><input type="text" id="userId" value="${userId }" name="userId"></td>
				<td></td>
			</tr>
		</table>
		<table>
			<thead>
				<tr>
					<td>课题编号</td>
					<td>课题名称</td>
					<td>课题年份</td>					
					<td>具体要求</td>
					<td>人数要求</td>
					<td>方向限制</td>
					<td>截止日期</td>					
					<td>是否发布</td>					
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${topics}" var="topics">
					<tr>
						<td>${topics.topicId }</td>
						<td>${topics.topicName }</td>
						<td>${topics.topicYear }</td>
						<td>${topics.demand }</td>
						<td>${topics.numberLimit }</td>
						<td>${topics.majorLimit }</td>			
						<td>${topics.deadline }</td>			
						<td>
							<a href="<%=basePath%>topic/optTopic.action?topicId=${topics.topicId}" >添加</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>		
	</form>
	
</body>
</html>