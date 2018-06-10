<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아임푸디</title>
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
<style>
	*{margin:0; padding:0; list-style:none;font-family: 'Lato', sans-serif;}
	#wrap{width:100%;height:980px;background-color:#fed330;overflow: auto;}
    form{width:20%;margin:0 auto; height:250px;padding:50px;margin-top:15%; background-color:#fff;box-shadow:10px 10px 0px #cccccc; }
    table{width:100%;padding:50px 0;}
    tr{height:50px;}
    td{width:65%;}
    input{width:95%;height:40px;border-radius: 5px;border:none;border:1px solid #ddd;}
    .row-td{width:35%;}
    .row-td input{height:100px;border:none;background-color:#fed330;color:#fff;font-size:18px; cursor: pointer;}
    .row-td input:hover{background-color:#2980b9;transition: 0.5s;}
</style>
</head>
<body>
	<div id="wrap">
			<form action="register.jsp" method="post">
			<h2>Register</h2>
				<table>
					<tr>
						<td><input type="text" name="id" placeholder="ID"></td><td rowspan="3" class="row-td"><input type="submit" value="Register"></td>
					</tr>
					<tr>
						<td><input type="password" name="pw" placeholder="PASSWORD"></td>
					</tr>
					<tr>
						<td><input type="password" name="pw2" placeholder="PASSWORD CHECK" /></td>
					</tr>
				</table>
			</form>
	</div>
</body>
</html>