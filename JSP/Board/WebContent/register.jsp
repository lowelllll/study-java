<%@page import="board2.Members"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아임푸디</title>
</head>
<%
	Members members = null;

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String pw_check = request.getParameter("pw2");
	
	if (!pw.equals(pw_check)) {
		out.print("비밀번호 확인이 일치하지 않습니다.");
	}else {
		members = new Members();
		if(!members.register(id,pw)){
			out.print("회원가입 실패");
		}else {
			out.print("회원가입 완료");
		}
	}
%>
<body>

</body>
</html>