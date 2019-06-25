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
<title>学生课程界面</title>
 <script type="text/javascript">
	<%-- function OptTopic(topicId){
		if(confirm('确认添加该课题吗？'+userId+topicId)){
			$.ajax({
		         url:"<%=basePath%>topic/optTopic.action",
		         data:{"topicId":topicId},
		         type:"POST",
		         dataType:"XML",
		         success:function(data){
		        	 if(data=="OK"){
							alert("添加课题成功！");
							window.location.reload();
						}else{
							alert("添加课题失败！");
							window.location.reload();
						}
		         }
		     });
			}
		} --%>	 
		<%-- function OptTopic(topicId){
			if(confirm('确认添加该课题吗？')){
				$.post("<%=basePath%>topic/optTopic.action",
						{"topicId":topicId},
					function(data){
					if(data=="OK"){
						alert("添加课题成功！");
						window.location.reload();
					}else{
						alert("添加课题失败！");
						window.location.reload();
					}
				});
			}
		} --%>
</script>
</head>
<body>	
	登录用户：${LOGIN_SESSION.userId}
	<a href="<%=basePath%>topic/topicmsg.action?userId=${LOGIN_SESSION.userId}">查看已选课程</a>
	<h1>课程管理</h1>		
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
					<td>具体要求</td>
					<td>人数要求</td>
					<td>方向限制</td>
					<td>截止日期</td>					
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${topics}" var="topics">
					<tr>
						<td>${topics.topicId }</td>
						<td>${topics.topicName }</td>
						<td>${topics.demand }</td>
						<td>${topics.numberLimit }</td>
						<td>${topics.majorLimit }</td>			
						<td>${topics.deadline }</td>			
						<td>
							<a href="<%=basePath%>topic/optTopic.action?topicId=${topics.topicId}&userId=${LOGIN_SESSION.userId}" >添加</a>							
						</td>						
					</tr>
				</c:forEach>
			</tbody>
			
		</table>		
	</form>
	
</body>
</html>