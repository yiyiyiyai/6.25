<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">
	function check(){
		var usercode = $("#userId").val();
	    var password = $("#password").val();
	    if(usercode=="" || password==""){
	    	$("#message").text("账号或密码不能为空！");
	        return false;
	    }  
	    return true;
	}
</script>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath }/login.action" 
			method="post" onsubmit="return check()"><br /><br />    
          账&nbsp;号：<input id="userId" type="text" name="userId" /><br /><br />          
          密&nbsp;码：<input id="password" type="password" name="password" /><br /><br />          
    <input type="submit" value="登录" /><br /><br />     
	</form>
	<span id="message">${msg }</span>
</body>
</html>