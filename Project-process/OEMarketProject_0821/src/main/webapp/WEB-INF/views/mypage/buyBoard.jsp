<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ include file="../includes/header.jsp" %>
<style type="text/css">
.sell_list_thumb:hover{opacity: 0.5; cursor:pointer;}
</style>
<section class="section" id="sell_list">
   <div class="container">
      <div class="row">
         <div class="board_list_category">
            <div class="col-lg-12">
            </div>
         </div>
      </div>
   </div>
   <div class="container">
      <div class="row">
         <div class="col-lg-6">
              <div class="section-heading">
               <h2>구매 목록</h2>
            </div>
         </div>
      </div>
   </div>
    <div class="container">
      <div class="row">
      <form role="form">
      
            <table border="1">
            <c:choose>
               <c:when test="${fn:length(buy) > 0 }">
               <c:forEach items="${buy}" var="buy">
               <tr>
                  <th><c:out value="대표사진1장"/></th>
                  <th><c:out value="${buy.buy_title}"/></th>
                  <th><c:out value="${buy.buy_price}"/></th>
                  <th><c:out value="${buy.buy_seller}"/></th>
                  <th><fmt:formatDate pattern="yyyy/MM/dd" value="${buy.buy_buydate}"/></th>
               </tr>
               </c:forEach>  
               </c:when>
              <c:otherwise>
                 <div class="container" style="padding: 120px 0 120px 0;">
						<div class="row justify-content-md-center">
							<div class="col-md-auto">
								<p class="h3 text-center">찜한 상품이 존재하지 않습니다.</p>
							</div>
						</div>
					</div>
              </c:otherwise>
           </c:choose> 
            </table>
         </form>
       </div>
    </div>
</section>


<%@ include file="../includes/footer.jsp" %>