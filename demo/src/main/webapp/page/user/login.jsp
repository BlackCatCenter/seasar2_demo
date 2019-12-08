<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
	</head>
	<body>
		<form action="/demo/LoginServletAction" method="post">
			用 名： <input type="text" name="username" /><br><br>
			密 码： <input type="password" name="password"/><br><br>
			<input type="submit" value="登录" />
		</form>
	</body>
</html>
