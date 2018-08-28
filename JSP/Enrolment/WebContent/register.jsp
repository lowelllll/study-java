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
	Db db = new Db();
	ResultSet rs = db.getLecturer();
	int i=0;
%>
</head>
<body>
	<div id="wrap">
		<%@include file="header.jsp" %>
		<section>
			<article>
				<p>교과목 추가</p>
				<form action="action.jsp">
					<table>
						<tr>
							<td>교과목 코드</td>
							<td><input type="text" name="id" required maxlength="10"></td>
						</tr>
						<tr>
							<td>과목명</td>
							<td><input type="text" name="name" required maxlength="15"></td>
						</tr>
						<tr>
							<td>담당강사</td>
							<td>
								<select name="lecturer" required>
									<option value="">--담당강사선택--</option>
									<%
										while(rs.next()){
											i++;
									%>
									<option value="<%=i%>"><%=rs.getString(1) %></option>
									<%
										}
									%>
								</select>
							</td>
						</tr>
						<tr>
							<td>학점</td>
							<td><input type="text" name="credit" required maxlength="1"></td>
						</tr>
						<tr>
							<td>요일</td>
							<td>
								<%
									String dates[] = {"월","화","수","목","금","토","일"};
								
									for(int day=1;day<8;day++){
										String weekTag = String.format("<input type='radio' value='%d' name='week' id='week%d'><label for='week'>%s</label>",day,day,dates[day-1]);
										if(day==1){
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
							<td><input type="text" name="start_hour" required maxlength="4"></td>
						</tr>
						<tr>
							<td>종료</td>
							<td><input type="text" name="end_end" required maxlength="4"></td>
						</tr>
						<input type="hidden" name="action" value="create">
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