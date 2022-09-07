package com.it.lecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class lecturerDAO {
	Connection conn = null;
	PreparedStatement ps = null;

	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String ID = "system";
	final String PWD = "1234";
	
	//드라이브 등록
	public lecturerDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//sql연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL,ID,PWD);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//연결해재
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//교과목 목록
	public List<lectureVO> class_List() {
		List<lectureVO> list = new ArrayList<lectureVO>();
		try {
			getConnection();
			String sql = "select c.id, c.name, c.credit, l.name, c.week, c.start_hour, c.end_end\r\n"
					+ "from course_tbl c, lecturer_tbl l \r\n"
					+ "where c.lecturer = l.idx";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				lectureVO vo = new lectureVO();
				vo.setId(rs.getString(1));
				vo.setC_name(rs.getString(2));
				vo.setCredit(rs.getInt(3));
				vo.setT_name(rs.getString(4));
				vo.setWeek(rs.getInt(5));
				vo.setStart_hour(rs.getInt(6));
				vo.setEnd_end(rs.getInt(7));
				list.add(vo);
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	//교과목 갯수 가져오기
	public int getCount(){
		int count = 0;
		try {
			getConnection();
			String sql = "select count(*) from course_tbl";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return count;
	}
	
	//교과목 추가
	public int regist(lectureVO vo) {
		int result = 0;
		try {
			getConnection();
			String sql = "insert into course_tbl(id,name,lecturer,credit,week,start_hour,end_end) values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getC_name());
			ps.setString(3, vo.getT_name());
			ps.setInt(4, vo.getCredit());
			ps.setInt(5, vo.getWeek());
			ps.setInt(6, vo.getStart_hour());
			ps.setInt(7, vo.getEnd_end());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//강사 목록
	public List<lectureVO> teacher_List() {
		List<lectureVO> list = new ArrayList<lectureVO>();
		try {
			getConnection();
			String sql = "select idx, name, major, field "
					+ "from lecturer_tbl";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				lectureVO vo = new lectureVO();
				vo.setIdx(rs.getInt(1));
				vo.setT_name(rs.getString(2));
				vo.setMajor(rs.getString(3));
				vo.setField(rs.getString(4));
				list.add(vo);
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	//교과목 삭제
	public int delete(int id) {
		int result = 0;
		try {
			getConnection();
			String sql = "delete course_tbl where id = ?"; 
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	
	//교과목 수정
	public int modify(lectureVO vo) {
		int result = 0;
		try {
			getConnection();
			String sql = "update course_tbl set name=?, lecturer=?, credit=?, week=?, start_hour=?, end_end=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getC_name());
			ps.setString(2, vo.getLecturer());
			ps.setInt(3, vo.getCredit());
			ps.setInt(4, vo.getWeek());
			ps.setInt(5, vo.getStart_hour());
			ps.setInt(6, vo.getEnd_end());
			ps.setString(7, vo.getId());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
		
		
	}
	
	//	//교과목 하나 가져오기
	public lectureVO oneClass(String id){
		lectureVO vo = new lectureVO();
		try {
			getConnection();
			String sql = "select * from course_tbl where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setC_name(rs.getString("name"));
				vo.setLecturer(rs.getString("lecturer"));
				vo.setCredit(rs.getInt("credit"));
				vo.setWeek(rs.getInt("week"));
				vo.setStart_hour(rs.getInt("start_hour"));
				vo.setEnd_end(rs.getInt("end_end"));
				}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return vo;
	}
	
	
	//강사 삭제
	public int teacher_delete(int idx) {
		int result = 0;
		try {
			getConnection();
			String sql = "delete lecturer_tbl where idx = ?"; 
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//강사 추가 
	public int teacher_regist(lectureVO vo) {
		int result = 0;
		try {
			getConnection();
			String sql = "insert into lecturer_tbl(idx,name,major,field) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getIdx());
			ps.setString(2, vo.getT_name());
			ps.setString(3, vo.getMajor());
			ps.setString(4, vo.getField());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//강사수업여러개
	public List<lectureVO> teacher_Class(int idx) {
		List<lectureVO> list = new ArrayList<lectureVO>();
		try {
			getConnection();
			String sql = "select c.id, c.name, c.credit, l.name, c.week, c.start_hour, c.end_end\r\n"
					+ "from course_tbl c, lecturer_tbl l \r\n"
					+ "where c.lecturer = l.idx and l.idx=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				lectureVO vo = new lectureVO();
				vo.setId(rs.getString(1));
				vo.setC_name(rs.getString(2));
				vo.setCredit(rs.getInt(3));
				vo.setT_name(rs.getString(4));
				vo.setWeek(rs.getInt(5));
				vo.setStart_hour(rs.getInt(6));
				vo.setEnd_end(rs.getInt(7));
				list.add(vo);
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}