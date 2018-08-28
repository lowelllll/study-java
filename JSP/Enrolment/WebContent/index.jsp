<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="enrolemnt.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청 도우미 사이트</title>
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/list.css">
<%
	String week[] = {"월","화","수","목","금","토","일"};

	Db db = new Db();
	ResultSet rs = db.getSubjectList();
	int count = db.getListCount();
%>
</head>
<body>
	<div id="wrap">
		<%@include file="header.jsp" %>
		<section>
			<article>
				<p>
					총 <%=count %>개의 교과목이 있습니다.</h4>
				</p>
				<table>
					<tr>
						<th>과목코드</th>
						<th>과목명</th>
						<th>학점</th>
						<th>담당강사</th>
						<th>요일</th>
						<th>시작시간</th>
						<th>종료시간</th>
						<th>관리</th>
					</tr>
				<tr>
			<%
				while(rs.next()){
			%>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td> 
					<td><%=week[rs.getInt(5)-1] %></td>
					<td><%=rs.getString(6) %></td>
					<td><%=rs.getString(7) %></td>
					<td>
						<a href="update.jsp?id=<%=rs.getString(1)%>">수정</a>/
						<form action="action.jsp" id="delete_form">
							<input type="hidden" name="action" value="delete">
							<input type="hidden" name="id" value="<%=rs.getString(1) %>">
							<button>삭제</button>
						</form>
					</td>
				</tr>
			<%
				}
			%>
				</table>
				<div>
					<a href="register.jsp"><button type="button">작성</button></a>
				</div>
			</article>
		</section>		
		<%@include file ="footer.jsp" %>
	</div>
</body>
</html>