<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쇼핑몰 회원관리 ver 1.0</title>
<link rel="stylesheet" href="common.css">
</head>
<body>
	<div id="wrap">
		<%@ include file= "header.jsp" %>
		<section>
			<article>
				<h2>쇼핑몰 회원관리 프로그램</h2>
				<div>
					<form action="" name="form">
						<table>
							<tr>
								<td>회원번호</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>회원성명</td>
								<td><input type="text" name="name"></td>
							</tr>
							<tr>
								<td>회원전화</td>
								<td><input type="text" name="tel"></td>
							</tr>
							<tr>
								<td>회원주소</td>
								<td><input type="text" name="address"></td>
							</tr>
							<tr>
								<td>가입일자</td>
								<td><input type="date" name="date"></td>
							</tr>
							<tr>
								<td>고객등급 [A:VIP,B:일반,C:직원]</td>
								<td><input type="text" name="grade"></td>
							</tr>
							<tr>
								<td>도시코드</td>
								<td><input type="text" name="code"></td>
							</tr>
							<tr>
								<td colspan="2">
									<button type="button" class="btn">등록</button>
									<a href=""><button>조회</button></a>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</article>	
		</section>
		<%@ include file= "footer.jsp" %>
	</div>
</body>
<script>
var btn = document.getElementsByClassName("btn")[0];
var form = document.forms['form'];
var field = ["회원 성명","회원 전화", "회원 주소", "가입 일자","고객 등급","도시코드"];

btn.onclick = on;

function on () {
	if(isNull()){
		form.submit();
	}
}

function isNull () {
	for(var i = 1; i<7; i++) {
		if(form[i].value == "" || !form[i].value) {
			alert(field[(i-1)]+" 필드가 입력되지 않았습니다.");
			form[i].focus();
			return false;
		}
	}
	return true
}

</script>
</html>