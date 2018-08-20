<%@page import="java.sql.ResultSet"%>
<%@page import="shoppingmall.ShoppingMall"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원목록 조회</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/list.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">

<%
	ShoppingMall shop = new ShoppingMall();
	ResultSet rs = shop.selectUser();
%>
</head>
<body>
<%@ include file="header.jsp" %>
		<section>
			<article>
				<h2>쇼핑몰 회원관리 프로그램</h2>
				<div>
					<table>
						<tr>
							<td>회원 번호</td>
							<td>회원 성명</td>
							<td>회원 번호</td>
							<td>가입  날짜</td>
							<td>회원 주소</td>
							<td>회원  등급</td>
							<td>도서 코드</td>
						</tr>
						<%
							while(rs.next()){
						%>
							<tr>
								<td><%=rs.getString(1) %></td>
								<td><%=rs.getString(2) %></td>
								<td><%=rs.getString(3) %></td>
								<td><%=rs.getString(4) %></td>
								<td><%=rs.getString(5) %></td>
								<td><%=rs.getString(6) %></td>
								<td><%=rs.getString(7) %></td>
							</tr>
						<%
							}
						%>
					</table>
				</div>
			</article>
		</section>
	<%@ include file="footer.jsp" %>



</body>
</html>