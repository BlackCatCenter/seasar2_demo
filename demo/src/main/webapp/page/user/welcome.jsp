<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
		<title>success</title>
	</head>
	<body>
		<h2 align="center">登陆成功，欢迎来访</h2>
		 <button id = "btn">查询用户信息</button> 
		 <p id = "showInfo"></p>
	</body>
<script>
$(document).ready(function(){
	$("#btn").click(function(){ 
		console.log("ajax");
	    $.ajax({
	        url : "${pageContext.request.contextPath}/getUserInfo", //后台查询验证的方法
	        dataTpye : "json",
	        data : {
	           
	        }, 
	        type : "post",
	        success : function(msg) {
	            var userInfo = jQuery.parseJSON(msg);           //jQuery.parseJSON(msg);
	            $("#showInfo").html(msg+"<br/>姓名"+userInfo[0].username+"<br/>昵称"+userInfo[0].nickname+"<br/>性别"+userInfo[0].sex+"<br/>年龄"+userInfo[0].age);
	        },
	        error:function(){  //请求失败的回调方法
	        	alert("请求失败，请重试");
	        }
	    });
		});
	});
</script>

</html>
