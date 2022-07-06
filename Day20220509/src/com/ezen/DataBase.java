package com.ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;



public class DataBase {

	private Connection con; //mysql연결, 접속을 위한 변수
	private PreparedStatement psmt; //sql문장 전송
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	
	//드라이버 등록! 한번만 등록하면 된다.
	public DataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //구체적인 클래스의 타입을 알지 못해도 클래스의 변수 및 메소드 등에 접근하게 해주는 API입니다.(동적 바인딩)
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	//연결
	public void getConnection() {
		try  {
			con = DriverManager.getConnection(URL,"root","1234"); //경로,ID,비밀번호
			//DriverManager.getConnection(접속할주소,"계정","비밀번호")
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결해제
	public void disConnection() {
		try {
			if(psmt != null) psmt.close();
			if(con != null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//안에 있는 정보 가져오기
	public void mydbListData() {
		try {
			//1.mysql연결
			getConnection(); //db연결잘 됐는지 println으로 확인해보기.
			
			//2.SQL문장 작성
			String sql = "select * from member"; //mysql에서 항상 확인
			
			//3.MySql로 SQL문장 전송
			psmt = con.prepareStatement(sql);
			
			//4.실행결과를 받아 온다.
			ResultSet rs = psmt.executeQuery();
			
			//5.결과를 출력
			/*
			  	no integer auto_increment,
    			name varchar(34) not null,
    			sex varchar(10) not null,
    			content text,
			 */
			rs.next(); //항상 써줘야함
			while(true) {
				System.out.println(rs.getInt(1)
							+", " + rs.getString(2)
							+", " + rs.getString(3)
							+", " + rs.getString(4) + " " );
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	//추가(Insert)
		public void mydbInsert(int no, String name, String sex, String content ) {
			
			try {
				//1.연결
				getConnection();
				//2. sql문장 작성
				String sql = "insert into member(no,name,sex,content ) "  // )한칸 뛰고 "붙이기
							+ "values (?,?,?,?)";
				//3.MySql로 SQL문장 전송
				psmt = con.prepareStatement(sql);
				
				//4.????에 값을 채운다
				psmt.setInt(1, no);
				psmt.setString(2, name);
				psmt.setString(3, sex);
				psmt.setString(4, content);
				
				//5.실행
				psmt.executeUpdate(); //db값 변동시에는 executeUpdate
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnection();
			}
		}
			
	//수정
		
	public void mydbUpdate(int no, String name1, String sex1, String content1 ) {
		try {
			 	getConnection();
			 	String sql = "update member set name=?, sex=?, content=? where no =? ";
			 	psmt = con.prepareStatement(sql);
			 	psmt.setString(1, name1);
			 	psmt.setString(2, sex1);
			 	psmt.setString(3, name1);
			 	psmt.setInt(4, no);
			 	
			 	psmt.executeUpdate();
			 	
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
		 	String sql = "delete from member where no =? ";
		 	
		 	psmt = con.prepareStatement(sql);
		 	psmt.setInt(1, no);

		 	psmt.executeUpdate();
		 	
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disConnection();
		}
	}
	
	//입력한 번호의 정보 불러오기 //검색
	public void mydbSelect(int no) {
		try {
		 	getConnection();
		 	String sql = "select * from member where no=? "; //sql에 문장 전송
		 	
		 	psmt = con.prepareStatement(sql);
		 	psmt.setInt(1, no); //입력한 첫번재꺼 no에 넣기

		 	
		 	
		 	ResultSet rs = psmt.executeQuery();  
		 	rs.next(); //커서를 맨앞으로
		 	
//		 	while(rs.next()) { //반복문 쓸 경우 동명이인 여러명 검색해올 수 있음. 대신 입력을 String name으로 받아야함.
				System.out.println(rs.getInt(1)
							+", " + rs.getString(2)
							+", " + rs.getString(3)
							+", " + rs.getString(4) + " " );
//			}
		 	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
			}
		}
	
/*
 	 	ResultSet rs = psmt.executeQuery();  
		 	
		 	while(rs.next()) {
				System.out.println(rs.getInt(1)
							+", " + rs.getString(2)
							+", " + rs.getString(3)
							+", " + rs.getString(4) + " " );
			}*/
	
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.getConnection();
		db.mydbListData();
		System.out.println("-------------------------");
		//db.mydbInsert(7, "ㅇㅇㅇ", "중성", "몰라");
		//System.out.println("-------------------------");
		db.mydbUpdate(7, "아이언맨", "남성", "슈트");
		db.mydbListData();
		System.out.println("-------------------------");
		db.mydbDelete(15);
		System.out.println("-------------------------");
		db.mydbListData();
		System.out.println("-------------------------");
		db.mydbSelect(6);
	}

}
