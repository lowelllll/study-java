<%@page import="shoppingmall.ShoppingMall"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Action</title>
</head>
<%
	ShoppingMall shop = new ShoppingMall();
	
	String action = request.getParameter("action");
	
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String date = request.getParameter("date");
	String grade = request.getParameter("grade");
	String code = request.getParameter("code");
	String custno = request.getParameter("custno");
%>
<body>
</body>
<script>
<%
if("create".equals(action)){
	if(shop.createUser(name, tel, address, date, grade, code)){
%>
	alert("회원 등록에 성공했습니다!");
	location.href="list.jsp";
<%
	}else{
%>
	alert("회원가입에 실패했습니다!");
	history.back();
<%
	}
}else if("update".equals(action)){
	if(shop.updateUser(name, tel, address, date, grade, code, custno)){
%>
		alert("회원 정보 수정에 성공했습니다!");
		location.href="list.jsp";
<%		
	}else{
		%>
		alert("회원 정보 수정에 실패했습니다!");
		history.back();
<%
	}
}
%>
</script>
</html>