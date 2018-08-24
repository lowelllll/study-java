<%@page import="java.sql.ResultSet"%>
<%@page import="shoppingmall.ShoppingMall"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쇼핑몰 회원관리 ver 1.0</title>
<link rel="stylesheet" href="common.css">
<link rel="stylesheet" href="list.css">
<%
	ShoppingMall shop = new ShoppingMall();
	ResultSet rs = shop.userList();
%>
</head>
<body>
	<div id="wrap">
		<%@ include file= "header.jsp" %>
		<section>
			<article>
				<h2>회원 목록 조회 수정</h2>
				<div>
					<table>
						<tr>
							<th>회원 번호</th>
							<th>회원 성명</th>
							<th>회원 전화</th>
							<th>회원 주소</th>
							<th>가입 날짜</th>
							<th>고객 등급</th>
							<th>거주 지역</th>
						</tr>
						<%
							while(rs.next()){
						%><tr>
							<td><a href="update.jsp?no=<%=rs.getString(1)%>"><%=rs.getString(1) %></a></td>
							<td><%=rs.getString(2) %></td>
							<td><%=rs.getString(3) %></td>
							<td><%=rs.getString(4) %></td>
							<td><%=rs.getString(5) %></td>
							<td><%=rs.getString(6).equals("A")? "VIP":rs.getString(6).equals("B")?"일반":"직원" %></td>
							<td><%=rs.getString(7) %></td>
						</tr>
						<%
							}	
						%>
					</table>
				</div>
			</article>	
		</section>
		<%@ include file= "footer.jsp" %>
	</div>
</body>
</html>