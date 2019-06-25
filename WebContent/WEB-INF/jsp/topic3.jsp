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
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
 <script>
	 function createTopic() {
	     $.post("<%=basePath%>/topic/create",$("#new_topic_form").serialize(),function (data) {
	         if(data == "OK"){
	             alert("课题创建成功！");
	             window.location.reload();
	         }else{
	             alert("课题创建失败！");
	             window.location.reload();
	         }
	     });
	 }
 	function deleteTopic(topicId) {
 		alert(topicId);
 		alter("test=" + $("#test").html());
        if(confirm('确实要删除该课题吗？')){ 
            $.post("topic/deletetopic",{"topicId":topicId},function (data) {
	                if(data == "OK"){
	                    alert("删除课题成功！");
	                    window.location.reload();
	                }else if(data == "FALL"){
	                    alert("删除课题失败！");
	                    window.location.reload();
	                }else{
	                	alert(data);
	                }
            	});
        }
    }
</script>
</head>
<body>	
	登录用户：${LOGIN_SESSION.userId}	
	<p id="test">ccc</p>
	
	<a href="#">学生管理</a>
	<h1>教师课程管理</h1>		
	<form method="get" action="${pageContext.request.contextPath }/topic/list.action" id="ttt">		
			<table>
			<tr>
				<td>课题编号</td>
				<td>课题名称</td>
				<td>专业限制</td>
				<td><button type="submit">查询</button></td>
			</tr><br>
			<tr>
				<td><input type="text" id="topicId" value="${topicId }" name="topicId"></td>
				<td><input type="text" id="topicName" value="${topicName }" name="topicName"></td>				
				<td><input type="text" id="majorLimit" value="${majorLimit }" name="majorLimit"></td>
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
						<td>${topics.releaseSingal }</td>			
						<td>
							<a href="#" onclick="deleteTopic(${topics.topicId})">删除</a>							
						</td>						
					</tr>
				</c:forEach>
			</tbody>
			
		</table>		
	</form>
<script src="../jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
</body>
</html>