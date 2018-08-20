<%@page import="shoppingmall.ShoppingMall"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>쇼핑몰 회원관리</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css">
<link rel="stylesheet" href="css/edit.css" />
</head>
<body>
	<%@ include file="header.jsp" %>
		<section>
			<article>
				<h2>쇼핑몰 회원 등록</h2>
				<div>
					<form action="createUser.jsp">
						<table>
							<tr>
								<td>회원번호</td>
								<td><input type="text" value="자동생성 됩니다." readonly/></td>
							</tr>
							<tr>
								<td>회원 성명</td>
								<td><input type="text" name="name" /></td>
							</tr>
							<tr>
								<td>회원 전화</td>
								<td><input type="text" name="tel" /></td>
							</tr>
							<tr>
								<td>회원 주소</td>
								<td><input type="text" name="address" /></td>
							</tr>
							<tr>
								<td>가입일자</td>
								<td><input type="date" name="joindate"/></td>
							</tr>
							<tr>
								<td>고객등급</td>
								<td><input type="text" name="grade" /></td>
							</tr>
							<tr>
								<td>도서코드</td>
								<td><input type="text" name="code"/></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" valule="확인"/><a href=""><button>조회</button> </a></td>
							</tr>
						</table>
					</form>
				</div>
			</article>
		</section>
	<%@ include file="footer.jsp" %>
</body>
</html>