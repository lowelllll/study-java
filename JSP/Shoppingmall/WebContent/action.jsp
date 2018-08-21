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
	String custno = request.getParameter("custno");
	String action = request.getParameter("action");
	
	boolean flag = false;
	if ("create".equals(action)) {
		flag = shop.createUser(name, tel, address, joindate,grade, code);
	} else {
		flag = shop.updateUser(custno,name, tel, address, joindate,grade, code);
	}
	

%>
</head>
<body>
</body>
<script>
<%
	if("create".equals(action)){
		if(flag){
%>
		alert("회원정보 등록에 성공했습니다.");
		location.href="list.jsp";
<%
		}else{
%>
		alert("회원 정보등록에 실패했습니다.");
		history.back();
<%	
		}
	}else {
		if(flag){
%>
		alert("회원정보 수정에 성공했습니다.");
		location.href="list.jsp";
<%
		}else{
%>
		alert("회원 정보등록에 실패했습니다.");
		history.back();
<%
		}
	}
%>
</script>
</html>