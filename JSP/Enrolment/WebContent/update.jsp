<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="enrolemnt.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/edit.css">
<title>수강신청 도우미 사이트</title>
<%
	String id = request.getParameter("id");

	Db db = new Db();
	ResultSet lecuturer_rs = db.getLecturer(); // 강사 목록
	ResultSet subject_rs = db.getSubject(id); 
	int i = 0;
%>
</head>
<body>
	<div id="wrap">
		<%@include file="header.jsp" %>
		<section>
			<article>
				<p>교과목 정보 수정</p>
				<form action="action.jsp">
					<table>
					<%
						while(subject_rs.next()){
					%>
						<tr>
							<td>교과목 코드</td>
							<td><input type="text" name="id" value="<%=subject_rs.getString(1) %>" required></td>
						</tr>
						<tr>
							<td>과목명</td>
							<td><input type="text" name="name" value="<%=subject_rs.getString(2) %>"  required></td>
						</tr>
						<tr>
							<td>담당강사</td>
							<td>
								<select name="lecturer" required>
									<option value="">--담당강사선택--</option>
									<%
										while(lecuturer_rs.next()){ // 강사 목록 option
											i++;
											String optionTag = String.format("<option value='%d'>%s</option>",i,lecuturer_rs.getString(1));  
											if(subject_rs.getString(7).equals(Integer.toString(i))){ // selected된 option
												optionTag = String.format("<option value='%d' selected>%s</option>",i,lecuturer_rs.getString(1));
											}
									%>
										<%=optionTag %>
									<%
										}
									%>
								</select>
							</td>
						</tr>
						<tr>
							<td>학점</td>
							<td><input type="text" name="credit" value="<%=subject_rs.getString(3) %>" required></td>
						</tr>
						<tr>
							<td>요일</td>
							<td>
								<%
									String dates[] = {"월","화","수","목","금","토","일"}; // radio 태그 출력.
								
									for(int day=1;day<8;day++){
										String weekTag = String.format("<input type='radio' value='%d' name='week' id='week%d'><label for='week'>%s</label>",day,day,dates[day-1]);
										if(subject_rs.getInt(4) == day){ // checked 된 radio.
											weekTag = String.format("<input type='radio' value='%d' name='week' id='week%d' checked><label for='week'>%s</label>",day,day,dates[day-1]); 
										}
								%>
									<%=weekTag %>
								<% 
									}
								%>
							</td>
						</tr>
						<tr>
							<td>시작</td>
							<td><input type="text" name="start_hour" required value="<%=subject_rs.getString(5)%>"></td>
						</tr>
						<tr>
							<td>종료</td>
							<td><input type="text" name="end_end" required value="<%=subject_rs.getString(6)%>"></td>
						</tr>
						<input type="hidden" name="action" value="update">
						
						<%
							}
						%>
					</table>
					<div>
							<a href="index.jsp"><button type="button">목록</button></a>
								<button>완료</button>
						</div>
				</form>
			</article>
		</section>		
		<%@include file ="footer.jsp" %>
	</div>
</body>
</html>