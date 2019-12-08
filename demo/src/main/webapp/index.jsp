<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>文件上传</title>
	</head>
	<body>
		<h2 style="color: red;">demo</h2>
		<h2 style="color: red;">demo</h2>
		<form action="/demo/UploadServlet" method="post" enctype="multipart/form-data">
			文件描述：<input type="text" name="description" /><br /><br />
			选择文件：<input type="file" name="photo" /><br /><br />
			<input type="submit" value="上传文件" /><br /><br />
		</form>
	</body>
</html>
