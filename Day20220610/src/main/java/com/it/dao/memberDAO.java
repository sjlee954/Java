package com.it.dao;
import java.util.*;
import java.sql.*;
import javax.sql.*;

public class memberDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private final String ID= "system";
	private final String PWD= "1234";
	
	//드라이버 연결
	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(URL,ID,PWD);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//디비 연결 해제
	public void disConnection() {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void memberInsert(memberVO vo) {
		try {
			getConnection();
			String sql = "insert into member_tbl_02 (CUSTNO, CUSTNAME, PHONE, ADDRESS, JOINDATE, GRADE, CITY) values(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getCustno());
			pstmt.setString(2, vo.getCustname());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getAddress());
			pstmt.setString(5, vo.getJoindate());
			pstmt.setString(6, vo.getGrade());
			pstmt.setString(7, vo.getCity());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	public int seqCustno(memberVO vo) {
		String sql = "select max(custno) from member_tbl_02";
		int custno = 10001;
		try {
			getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) custno = rs.getInt(1)+1;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return custno;
	}
	
	public void memberUpdate(memberVO vo) {
		try {
			getConnection();
			String sql = "update member_tbl_02 set custname=?, phone=?, address=?, joindate=?, grade=?, city=? where custno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustname());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getJoindate());
			pstmt.setString(5, vo.getGrade());
			pstmt.setString(6, vo.getCity());
			pstmt.setInt(7, vo.getCustno());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
