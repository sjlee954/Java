<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>회원가입 페이지</title>
    <link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
    <link rel="stylesheet" href="/resources/assets/css/basic.css">
    <link rel="stylesheet" href="/resources/assets/css/main.css">

</head>

<body>


    <section class="insert-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6 col-lg-5">
                    <div class="insert-wrap">
                        <img src="/resources/assets/images/cucumber.png">
                        <form action="/user/join" method="post" name="form">
                            <h1>오이마켓 회원가입</h1>
                                <div class="form-group sujung1">
                                    <input type="text" class="form-control" placeholder="아이디" required name="us_id">
                                    <button type="button" class="form-control sujung2">중복 확인</button>
                                </div>
                                
                                <div class="form-group sujung3">
                                    <input type="password" class="form-control" placeholder="비밀번호" required
                                        name="us_pass">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="비밀번호확인" required
                                        name="us_passChk">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="이름" required name="us_name">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="별명" required
                                        name="us_nickname">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="생년 월일 ex)YYYYMMDD" required
                                        name="us_birth">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="이메일" required name="us_email">
                                </div>
                                <div class="form-group">
                                    <select name="us_gender" class="form-control">
                                        <option value="male">남성</option>
                                        <option value="female">여성</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="주소" required id="sggNm"
                                        name="us_address1" readonly>
                                    <input type="text" class="form-control" placeholder="동네" required id="emdNm"
                                        name="us_address2" readonly>
                                    <input type="button" onClick="goPopup();" value="동네찾기" />
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="전화번호 ex)010-0000-0000" required
                                        name="us_phone">
                                </div>
                                <div class="form-group submit">
                                    <button type="submit" class="form-control btn btn-primary"
                                        onclick="return CreateAccountCheck()">가입하기</button>
                                </div>
                                <div class="form-group forgot-password">
                                    <a href="${contextPath}/login.do">로그인하기</a>
                                    <a href="/">홈 화면으로</a>
                                </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="/resources/assets/js/jquery-2.1.0.min.js"></script>

    <!-- Bootstrap -->
    <script src="/resources/assets/js/bootstrap.min.js"></script>

    <!-- Plugins -->
    <script src="/resources/assets/js/owl-carousel.js"></script>
    <script src="/resources/assets/js/slick.js"></script>


    <!-- custom -->
    <script src="/resources/assets/js/custom.js"></script>

    


</body>

</html>