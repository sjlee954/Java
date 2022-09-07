package com.it.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class memberDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	
	final String URl = "jdbc:oracle:thin:@localhost:1521:xe";
	final String ID = "system";
	final String PWD = "1234";
	
	//드라이브 등록
	public memberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//sql연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URl,ID,PWD);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결해제
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//등록
	public int memberInsert(memberVO vo) {
		int rs = 0;
		try {
			getConnection();
			String sql = "insert into member_tbl_02 (custno, custname, phone, address, joindate, grade, city) "
					+"values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getCustno());
			ps.setString(2, vo.getCustname());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getJoindate());
			ps.setString(6, vo.getGrade());
			ps.setString(7, vo.getCity());
			
			rs = ps.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return rs;
	}
	
	//회원정보자동입력값
	public int seqCustno() {
		String sql = "select max(custno) from member_tbl_02";
		int custno = 100001;
		ResultSet rs = null;
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) custno = rs.getInt(1) + 1;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return custno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
