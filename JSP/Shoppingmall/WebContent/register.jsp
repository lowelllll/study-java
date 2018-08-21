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
<%
	ShoppingMall shop = new ShoppingMall();
	int custno = shop.getCustno();
%>
</head>
<body>
	<%@ include file="header.jsp" %>
		<section>
			<article>
				<h2>쇼핑몰 회원 등록</h2>
				<div>
					<form action="action.jsp" name="form">
						<table>
							<tr>
								<td>회원번호</td>
								<td><input type="text" value="<%=custno%>" readonly name="custno"/></td>
							</tr>
							<tr>
								<td>회원 성명</td>
								<td><input type="text" name="name" maxlength="5"/></td>
							</tr>
							<tr>
								<td>회원 전화</td>
								<td><input type="text" name="tel" maxlength="13"/></td>
							</tr>
							<tr>
								<td>회원 주소</td>
								<td><input type="text" name="address" maxlength="30"/></td>
							</tr>
							<tr>
								<td>가입일자</td>
								<td><input type="date" name="joindate" /></td>
							</tr>
							<tr>
								<td>고객등급</td>
								<td><input type="text" name="grade" maxlength="1"/></td>
							</tr>
							<tr>
								<td>도서코드</td>
								<td><input type="text" name="code" maxlength="2"/></td>
								<input type="hidden" name="action" value="create">
							</tr>
							<tr>
								<td></td>
								<td><button type="button" class="btn">등록</button><a href="list.jsp"><button type="button">조회</button> </a></td>
							</tr>
						</table>
					</form>
				</div>
			</article>
		</section>		
	<%@ include file="footer.jsp" %>
</body>
<script>
var btn = document.getElementsByClassName("btn")[0];
var form = document.forms['form'];
var field = ['회원 성명','회원 전화','회원 주소','가입 일자','고객 등급','도시코드'];
btn.onclick = sm;

function isNull () {
	for (var i = 1; i<7; i++) {
		if (form[i].value == "" ||  !form[i].value) {
			alert(field[(i-1)]+"이 입력되지 않았습니다.");
			form[i].focus();
			return false;
		}
	}
	
	return true;
}

function sm () {

	if(isNull()){ // 값이 모두 채워져있을 경우
		form.submit();
	}
	
}
</script>
</html>
