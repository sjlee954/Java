<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title>Insert title here</title>
   </head>
   <style>

      *{margin:0; padding:0;}
      ul,li{list-style:none;}
      a{text-decoration:none; color: #fff;}
      
      header{height:150px; background:coral; text-align:center; font-size:40px; color: #fff; line-height:150px;}
      
      nav{height:60px; background:pink; line-height:60px;}
      nav ul li{float: left; margin: 0 50px 0 10px;}
      
      section{height: 750px; background:darksalmon;}
      section h1{text-align:center; line-height:160px;}
      section table{margin:0 auto; text-align:center; width : 800px; height:300px;}
      section table td{padding:10px 80px;}
      section table .td1{padding:10px 80px; text-align:center; font-weight:bold;}
      section table .td2{padding:10px 120px 10px 10px; text-align:left;}
      
      section input[type="submit"]{padding:5px 10px;}
      section input[type="button"]{padding:5px 10px;}
      
      footer{height:60px; background:coral; line-height:60px; color: #fff; text-align:center;}
      

   </style>
   
<body>


   <header>쇼핑몰 회원관리 ver1.0</header>
   
    <form name = "" action="호출할 jsp명.jsp" method="get/post"/>
   
   <nav>
      <ul>
         <li><a href="submit.jsp">회원등록</a></li>
         <li><a href="search.jsp">회원목록 조회/수정</a></li>
         <li><a href="VIP.jsp">회원매출조회</a></li>
         <li><a href="home.jsp">홈으로</a></li>
      </ul>
   </nav>
   
   <section>
      <h1>쇼핑몰 회원 등록</h1>
      
      <form name="" action="" method="post">
         <table border="1">
            <tr>
               <td class="td1">회원번호(자동발생)</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td class="td1">회원성명</td>
               <td class="td2"><input type="text" name="nm" placeholder="이것만 꼭 입력해주세요." required></td>
            </tr>
            <tr>
               <td class="td1">회원전화</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td class="td1">회원주소</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td class="td1">가입일자</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td class="td1">고객등급[A:VIP, B:일반, C:직원]</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td class="td1">도시코드</td>
               <td class="td2"><input type="text" onclick = "alert('name만 입력해주세요.')"></td>
            </tr>
            <tr>
               <td colspan="2"><input type="submit" value="등록">&nbsp;&nbsp;&nbsp;<input type="button" value="조회"></td>
            </tr>
         </table>
      </form>
   </section>
   
   <footer>HRDKOREA Copyrightⓒ2016 All rights reserved. Human Resources Development Service of Korea</footer>



</body>
</html>