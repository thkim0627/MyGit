<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kmall / 로그인</title>
<!-- 0-1.favicon -->
<link rel="shortcut icon" type="image/x-icon" href="resources/favicon/favicon.ico"/>
<!-- 0-2.css -->
<link rel="stylesheet" type="text/css" href="resources/css/home.css">
<link rel="stylesheet" type="text/css" href="resources/css/login.css">
<!-- 0-3.jqeury -->
<script src="resources/myLib/jquery-3.2.1.min.js"></script>
</head>
<body>
	<header></header>

	<!-- 1.로그인페이지 네비게이션바 영역 -->
	<nav> 
		<div id="navbarBox"> 
	        <!-- 1-1.네비게이션 쇼핑메뉴영역 -->
	        <div id="shopMenuBox">
		        <ul id="shopMenu">
					<c:if test="${empty LoginID || not empty LoginID}">
						<li>
							<a href="#">SHOP</a>
							<ul class="shopMenuDepth">
								<li><a href="#">ALL</a></li>
								<li><a href="#">OUTER</a></li>
								<li><a href="#">TOP</a></li>
								<li><a href="#">BOTTOM</a></li>
								<li><a href="#">ONEPIECE</a></li>
								<li><a href="#">SKIRT</a></li>
								<li><a href="#">SHOES</a></li>
								<li><a href="#">BAG</a></li>
								<li><a href="#">HEADWEAR</a></li>
								<li><a href="#">UNDERWEAR</a></li>
								<li><a href="#">ATC</a></li>
								<li><a href="#">ETC</a></li>	
							</ul>
						</li>			
						<li><a href="#">SALE</a></li>
						<li><a href="#">LOOKBOOK</a></li>
						<li><a href="#">CAMPAIGN</a></li>
						<li><a href="#">CONTACT</a></li>
					</c:if>
				</ul>
			</div>
			<!-- 1-2.네비게이션 로고영역 -->
	        <div id="navbarLogo">
	            <h1><a href="home">Kmall</a></h1>
	        </div>
			<!-- 1-3.네비게이션 회원메뉴 영역 -->
	        <div id="memberMenuBox">
		        <ul id="memberMenu">
		        	<li>
						<!-- 로그인 전 표시 메뉴 -->
						<c:if test="${empty LoginID}">
							<li><a href="loginf">LOGIN</a></li>
							<li><a href="joinf">JOIN</a></li>
							<li><a href="blist">BOARD</a></li>
							<li><a href="#">SEARCH</a></li>
						</c:if>
						<!-- 로그인 후 표시 메뉴-->
						<c:if test="${not empty LoginID}">
							<li><a href="logout">LOGOUT</a></li>
							<li><a href="mdetail">MYPAGE</a></li>
							<li><a href="blist">BOARD</a></li>
							<li><a href="#">SEARCH</a></li>
							<li><a href="mdetail">${LoginName}님</a></li>
						</c:if>
					</li>
				</ul>
			</div>
	    </div>
    </nav><br><br><br><br><br><br><br><br><br>
	
	<!-- 2.로그인페이지 로그인 영역 -->
	<main>
		<form action="login" method="post">
			<table id="loginTable">
				<div id="loginTitle">
					<span>LOGIN</span>
				</div>
				<tr> <!-- 로그인 아이디 -->
				 	<td><input type="text" name="id" id="id" placeholder="ID"></td><br>
				</tr>
				<tr> <!-- 로그인 비밀번호 -->
					<td><input type="password" name="password" id="password" placeholder="PASSWORD"></td><br>
				</tr>
				<tr>	
					<td>
						<input type="submit" id="submit" value="LOGIN" onclick="return inCheck()"><br>
						<input type="button" id="backBtn" value="CANCEL" onclick="location.href='home'">
					</td>
				</tr>
				<tr>
					<td><a href="#" id="findIDPWD">＊FIND ID AND PASSWORD＊</a></td>
				</tr>	
				<!-- 하단영역 네이버&카카오 로그인 api 구현희망 -->
			</table><br><br><br><br><br><br><br><br><br><br><br>
		</form>
	</main><br><br><br><br><br><br><br><br><br>
	
	<!-- 3.로그인페이지 푸터 콘텐츠 영역 -->
	<footer>
		<div id="homeFooterHR"></div>
		<div id="homeFooterCont">
			<!-- 고객센터 정보영역 -->
			<div class="homeFooterBox" style="margin-left: 0.2rem;">
				<div class="footerTitle" style="margin-bottom: 1.1rem;"><h2><span>CS CENTER</span></h2></div>
				<ul class="homeFooterUL">
					<li class="footerContents" style="font-size: 1.7rem; font-weight: bold; margin-bottom: 1.2rem;">010-5840-5084</li>
					<li class="footerContents">thkim_o@daum.net</li>
					<li class="footerContents">AM 09:00 ~ PM 17:00</li>
				</ul>
			</div>
			<!-- 은행 정보영역 -->
			<div class="homeFooterBox" style="margin-left: 1rem;">
				<div class="footerTitle" style="margin-top: 3rem;"><h2><span>BANK INFO</span></h2></div>
				<ul class="homeFooterUL">
					<li class="footerContents">KB 국민 : 000000-00-000000</li>
					<li class="footerContents">KEB 하나 : 000-000000-00000</li>
					<li class="footerContents">IBK 기업 : 000-000000-00-000</li>
					<li class="footerContents">예금주 : (주)케이몰</li>
				</ul>
			</div>
			<!-- 정책 정보영역 -->
			<div class="homeFooterBox" style="margin-left: -0.5rem;">
				<div class="footerTitle" style="margin-bottom: 1.3rem;"><h2><span>POLICY</span></h2></div>
				<ul class="homeFooterUL">
					<li class="footerContents"><a class="footerPolicyA" href="#">FAQ</a></li>
					<li class="footerContents"><a class="footerPolicyA" href="#">AGREEMENT</a></li>
					<li class="footerContents"><a class="footerPolicyA" href="#">GUIDE</a></li>
					<li class="footerContents"><a class="footerPolicyA" href="#">PRIVACY</a></li>
				</ul>
			</div>
			<!-- 회사 정보영역 -->
			<div class="homeFooterBox">
				<div class="footerTitle"><h2><span>COMPANY</span></h2></div>
				<ul class="homeFooterUL">
					<li class="footerContents">법인명(상호) : (주)케이몰(Kmall Co., Ltd.)</li>
					<li class="footerContents">대표자(성명) : 김태형 | 사업자 등록번호 안내 : [000-00-00000]</li>
					<li class="footerContents">통신판매업 신고 제 2022-서울길동-00203호 | 전화 : 010-5840-5084 | 팩스 : 02-000-0000</li>
					<li class="footerContents">주소 : 00000 서울특별시 강동구 천호대로185길 67-5 (길동) 한빛주택 203호</li>
				</ul>
			</div>
		</div>
		<p class="footerContents" style="margin: 3rem 0 4rem 3.4rem; line-height: 1.5rem;">
			Contact thkim@kmall.com for more information.<br>
			Copyright © 케이몰. All rights reserved.
		</p>
	</footer>
</body>
</html>