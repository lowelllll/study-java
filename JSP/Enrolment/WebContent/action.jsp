<%@page import="enrolemnt.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	<%
		
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("action");
		String id = request.getParameter("id");
		
		String name = "";
		String lecturer = "";
		String credit = ""; 
		String week = ""; 
		String start_hour = ""; 
		String end = "";
		
		if(action.equals("create") || action.equals("update")){
			name = request.getParameter("name");
			lecturer = request.getParameter("lecturer");
			credit = request.getParameter("credit");
			week = request.getParameter("week");
			start_hour = request.getParameter("start_hour");
			end = request.getParameter("end_end");
		}
		
		
		Db db = new Db();
		if(action.equals("create")){
			if(db.createSubject(id, name, credit, lecturer, week, start_hour, end)){
	%>
		alert("교과목 추가를 완료했습니다.");
		location.href = "index.jsp"
	<%
			} else{
	%>
		alert("교과목 추가를 실패했습니다.");
		history.back();
	<%
			}
		}else if(action.equals("update")){
			if(db.updateSubject(id, name, credit, lecturer, week, start_hour, end)) {
	%>
		alert("교과목 수정을 완료했습니다.");
		location.href = "index.jsp"
	<%
		} else{
	%>
		alert("교과목 수정를 실패했습니다.");
		history.back();
	<%
			}
		}else if(action.equals("delete")) {
			if(db.deleteSubject(id)){
	%>
		alert("교과목 삭제을 완료했습니다.");
		location.href = "index.jsp"
	<%
			} else{
	%>
		alert("교과목 삭제를 실패했습니다.");
		history.back();
	<%
			}
		}
	%>
</script>
</body>
</html>