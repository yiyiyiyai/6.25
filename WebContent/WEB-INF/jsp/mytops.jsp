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
<title>我创建的课题们</title>
</head>
<body>
	登录用户：${USER_SESSION.userId}
	<a href="<%=basePath%>teacher/stopMyTopic.action?userId=${USER_SESSION.userId}" >一键结束我的所有课题</a>
	<br><br>
	<form>			
		<table>
			<thead>
				<tr>
					<td>课题编号</td>
					<td>课题名称</td>
					<td>出题老师</td>										
					<td>具体要求</td>
					<td>人数要求</td>
					<td>已选人数</td>
					<td>方向限制</td>
					<td>截止日期</td>	
					<td>课题年份</td>										
					<td>是否发布</td>										
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${mytopics}" var="mytopics">
					<tr>
						<td>${mytopics.topicId }</td>
						<td>${mytopics.topicName }</td>
						<td>${mytopics.userName }</td>						
						<td>${mytopics.demand }</td>
						<td>${mytopics.numberLimit }</td>
						<td>${mytopics.numberNow }</td>
						<td>${mytopics.majorLimit }</td>			
						<td>${mytopics.deadline }</td>
						<td>${mytopics.topicYear }</td>			
						<td>${mytopics.releaseSingal }</td>			
						<td>
							<a href="<%=basePath%>teacher/deleteTopic.action?topicId=${mytopics.topicId}" >删除</a>
							<a href="<%=basePath%>teacher/toeditTopic.action?topicId=${mytopics.topicId}" >修改</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>		
	</form>
</body>
</html>