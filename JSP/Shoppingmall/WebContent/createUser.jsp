<%@page import="java.sql.*"%>
<%@page import="shoppingmall.ShoppingMall"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create user</title>
<%
	ShoppingMall shop = new ShoppingMall();
	
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String code = request.getParameter("code");
	
	boolean flag = shop.createUser(name, tel, address, joindate,grade, code);

%>
</head>
<body>
</body>
<script>
<%
	if(flag){
%>
	alert("회원등록에 성공했습니다.");
	location.href="index.jsp";
<%
	}else{
%>
	alert("회원등록에 실패했습니다.");
<%
	}
%>
</script>
</html>