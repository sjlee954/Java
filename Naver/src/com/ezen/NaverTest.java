package com.ezen;


import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class NaverTest {

   public static void main(String[] args) throws IOException  {
      // TODO Auto-generated method stub

//      int pages=20;
      
//      for(int i=1; i<pages; i++) {
      
         String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page="+1;
         
         Document doc = Jsoup.connect(url).get();
         //System.out.println(doc);
         Elements  elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
         Element  element= elements.get(0);
         //System.out.println(element);
         
         Elements photoElements = element.getElementsByAttributeValue("class", "photo");
         //System.out.println(photoElements);
         
         int count=0;
         LinkedList<Integer> LinkedList = new LinkedList<Integer>();
               
         for(int j=0; j<photoElements.size(); j++) {
            count++;
            Element articleElement = photoElements.get(j);
            //System.out.println(articleElement);
            Elements aElements = articleElement.select("a");
            Element aElement = aElements.get(0);
            //System.out.println(aElements);
            
            String newsUrl = aElement.attr("href");  //기사 링크
            //System.out.println(newsUrl);
            
            Element  imgElement = aElement.select("img").get(0);
            String imgUrl = imgElement.attr("src");
            //System.out.println(imgUrl);
            String title  = imgElement.attr("alt");
            //System.out.println(title);
            
            Document detailDoc = Jsoup.connect(newsUrl).get();
            Element  contentElement  = detailDoc.getElementById("dic_area");
            String  content = contentElement.text();
            
            LinkedList.add(count);
            
//            System.out.println(title);
//            System.out.println(content);
//            System.out.println();
         }
         System.out.println(LinkedList);

//         Database db = new Database();
         for (int i=0;i<LinkedList.size();i++)
        	 for( int num : LinkedList)
        	 System.out.println(num); //여기서부터 막힘.
         System.out.println();
//       	 db.mydbInsert(num);
         

         

   
   }

}

class Database {

	   private Connection con;                //mqsql 연결
	   private PreparedStatement pstmt;       //sql 문장 전송
	   
	   private final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	   
	   //드라이버 등록 : 한번만 등록하면된다.
	   public Database() {
	      
	      try {
	         
	         Class.forName("com.mysql.cj.jdbc.Driver");
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   }
	   
	   //연결
	   public void getConnection() {
	      try {
	         con = DriverManager.getConnection(URL, "root", "1234"); //경로, 아이디, 비번
//	         System.out.println("접속은 잘되니?");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
	   
	   //연결해제
	   public void disConnection() {
	      
	      try {
	         
	         if(pstmt != null ) pstmt.close();
	         if(con != null) con.close();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   }
	   
	   public void mydbListData() {
	      try {
	         
	         //1. Mysql 연결
	         getConnection();
	         
	         //2. SQL문장 작성
	         String sql = "select * from member";
	         
	         //3. MySql로 SQL문장 전송
	         pstmt = con.prepareStatement(sql);
	         
	         //4. 실행결과를 받아 온다.
	         ResultSet rs = pstmt.executeQuery();
	         
	         //5. 결과를 출력
	         
	         /*
	          * no integer auto_increment,  
	          *   name varchar(34) not null, 
	          *  sex varchar(10) not null,
	          *  content text,
	          * */
	         while(rs.next()) {
	            System.out.println(rs.getInt(1) 
	                + ", " + rs.getString(2)
	                + ", " + rs.getString(3) + " ");
	         }
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         disConnection();
	      }
	   }
	   
	   //입력
	   public void mydbInsert(int no, String title, String content ) {
			
			try {
				//1.연결
				getConnection();
				//2. sql문장 작성
				String sql = "insert into member(no,title,content ) "  // )한칸 뛰고 "붙이기
							+ "values (?,?,?)";
				//3.MySql로 SQL문장 전송
				pstmt = con.prepareStatement(sql);
				
				//4.????에 값을 채운다
				pstmt.setInt(1, no);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				
				//5.실행
				pstmt.executeUpdate(); //db값 변동시에는 executeUpdate
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnection();
			}
		}
	   public void mydbInsert(int no) {
			
			try {
				//1.연결
				getConnection();
				//2. sql문장 작성
				String sql = "insert into member(no) "  // )한칸 뛰고 "붙이기
							+ "values (?)";
				//3.MySql로 SQL문장 전송
				pstmt = con.prepareStatement(sql);
				
				//4.????에 값을 채운다
				pstmt.setInt(1, no);
						
				//5.실행
				pstmt.executeUpdate(); //db값 변동시에는 executeUpdate
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnection();
			}
		}
	   //삭제
	   public void mydbDelete(int no) {
	      try {
	         
	         getConnection();
	         String sql = "delete from member where no = ? ";
	         
	         pstmt = con.prepareStatement(sql);
	         pstmt.setInt(1, no);
	         
	         pstmt.executeUpdate();
	         
	      }catch(Exception e){
	         e.printStackTrace();
	      }finally {
	         disConnection();
	      } 
	   }

}
	   
