<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">
<link rel="stylesheet" href="/resources/assets/css/owl-carousel.css">

</head>
<body>

	<!-- Header -->
      <header class="header-area header-sticky">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav class="main-nav">
                        <!-- logo -->
                        <div class="dropdown custom-dropdown">
                          <a href="#" data-toggle="dropdown" class="d-flex dropdown-link text-left" aria-haspopup="true" aria-expanded="false" data-offset="0, 20">
                            <i class="fa fa-bars" aria-hidden="true"></i>
                          </a>
                          <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="#"> <span class="icon icon-dashboard"></span> 도서/티켓/문구</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-mail_outline"></span> 음반/악기<span class="number">3</span></a>
                            <a class="dropdown-item" href="#"><span class="icon icon-people"></span> 예술/희귀/수집품</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-cog"></span> 여성의류</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-sign-out"></span> 남성의류</a>
                            <a class="dropdown-item" href="#"> <span class="icon icon-dashboard"></span> 신발</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-mail_outline"></span> 가방<span class="number">3</span></a>
                            <a class="dropdown-item" href="#"><span class="icon icon-people"></span> 시계</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-cog"></span> 쥬얼리<span>New</span></a>
                            <a class="dropdown-item" href="#"><span class="icon icon-sign-out"></span> 가구/인테리어</a>
                            <a class="dropdown-item" href="#"> <span class="icon icon-dashboard"></span> 차량/오토바이</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-mail_outline"></span> 키덜트<span class="number">3</span></a>
                            <a class="dropdown-item" href="#"><span class="icon icon-people"></span> 생활용품</a>
                            <a class="dropdown-item" href="#"><span class="icon icon-cog"></span> 반려동물용품<span>New</span></a>
                            <a class="dropdown-item" href="#"><span class="icon icon-sign-out"></span> 기타</a>
                          </div>
                        </div>
                        <a href="#"><i class="fa fa-search"></i></a>
                        
                        <!--// logo-->
                        <!-- menu -->
                        <ul class="nav">
                            <li class="scroll-to-section"><a href="#popular">둘러보기</a></li>
                            <li class="scroll-to-section"><a href="#customer">고객센터</a></li>
                            <li><a href="#login.html">로그인</a></li>
                        </ul>
                        <!--// menu-->
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!--// header-->
    
    <!-- Plugins -->
    <script src="/resources/assets/js/owl-carousel.js"></script>
    <script src="/resources/assets/js/slick.js"></script>
    <!-- jQuery -->
    <script src="/resources/assets/js/jquery.min.js"></script>
	<!-- Popper -->
    <script src="/resources/assets/js/popper.min.js"></script>

    <!-- custom -->
    <script src="/resources/assets/js/custom.js"></script>
    <!-- Bootstrap -->
    <script src="/resources/assets/js/bootstrap0819.min.js"></script>
    
    <script>
    /* header의 카테고리 */
	$('.custom-dropdown').on('show.bs.dropdown', function() {
	   var that = $(this);
	  setTimeout(function(){
		  that.find('.dropdown-menu').addClass('active');
	  }, 100);
	  
  
	});
	$('.custom-dropdown').on('hide.bs.dropdown', function() {
	  $(this).find('.dropdown-menu').removeClass('active');
	});
	/* //header의 카테고리 */
    </script>

</body>
</html>