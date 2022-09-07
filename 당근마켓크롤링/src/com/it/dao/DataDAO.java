package com.it.dao;
// DBCP (톰캣)=> 웹에서만 사용이 가능 (웹애플리케이션의 데이터베이스 기본)
// 일반 JDBC 사용 
import java.util.*;
import java.sql.*;
/*
 * private int no, price, heart;
	private String title, content, images, address;
 * 
 *  NO        NOT NULL NUMBER        
	TITLE     NOT NULL VARCHAR2(500) 
	CONTENT   NOT NULL VARCHAR2(500) 
	IMAGES    NOT NULL VARCHAR2(500) 
	ADDRESS   NOT NULL VARCHAR2(500) 
    PRICE     NOT NULL NUMBER        
    HEART     NUMBER        
	REGDATE   VARCHAR2(200) 
 */
public class DataDAO {
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
   private static DataDAO dao;
   
   // 드라이버 등록 
   public DataDAO()
   {
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
	   }catch(Exception ex){}
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"root","1234");
	   }catch(Exception ex) {}
   }
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 싱글턴 => DAO를 한번만 사용이 가능 (메모리 공간을 1개만 생성) = 재사용
   // 스프링에서는 기본 (싱글턴) => 필요시에는 여러개 객체 생성 => prototype
   public static DataDAO newInstance()
   {
	   if(dao==null)
		   dao=new DataDAO();
	   return dao;
   }
}






