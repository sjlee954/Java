package com.it.enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class enrollDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String ID = "system";
	final String PWD = "1234";
	
	//드라이브 등록
	public enrollDAO() {
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
	
	//연결해제
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//과정목록 조회
	public List<classVO> classList() {
		List<classVO> list = new ArrayList<>();
		
		try {
			getConnection();
			String sql = "select * from tbl_class_202201 order by class_seq";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				classVO vo = new classVO();
				vo.setClass_seq(rs.getInt("class_seq"));
				vo.setRegist_month(rs.getString("regist_month"));
				vo.setC_no(rs.getString("c_no"));
				vo.setClass_area(rs.getString("class_area"));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}

	//학생목록 조회
	public List<memberVO> memberList() {
		List<memberVO> list = new ArrayList<>();
		
		try {
			getConnection();
			String sql = "select * from tbl_member_202201 order by member_seq";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				memberVO vo = new memberVO();
				vo.setMember_seq(rs.getInt("member_seq"));
				vo.setC_name(rs.getString("c_name"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setC_no(rs.getString("c_no"));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}

	//선생목록 조회
	public List<teacherVO> teacherList() {
		List<teacherVO> list = new ArrayList<>();
		
		try {
			getConnection();
			String sql = "select * from tbl_teacher_202201 order by teacher_seq";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				teacherVO vo = new teacherVO();
				vo.setTeacher_seq(rs.getInt("teacher_seq"));
				vo.setTeacher_code(rs.getString("teacher_code"));
				vo.setClass_name(rs.getString("class_name"));
				vo.setTeacher_name(rs.getString("teacher_name"));
				vo.setClass_price(rs.getInt("class_price"));
				vo.setTeacher_regist_date(rs.getString("teacher_regist_date"));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	//과정 등록
	public int class_register(classVO vo) {
		int rs = 0;
		
		try {
			getConnection();
			String sql = "insert into tbl_class_202201(class_seq,regist_month,c_no,class_area,tution,teacher_code) values(class_seq.nextval,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getRegist_month());
			ps.setString(2, vo.getC_no());
			ps.setString(3, vo.getClass_area());
			ps.setInt(4, vo.getTution());
			ps.setString(5, vo.getTeacher_code());
			
			rs = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return rs;
	}


	//과정 상세보기
	   public classVO class_detail(int class_seq){
	      classVO vo = new classVO();
	      teacherVO tvo = new teacherVO();
	      
	      String sql = "select C.regist_month,C.c_no,C.class_area,C.tution,C.teacher_code, "
	            + "        T.teacher_name,T.class_name "
	            + "from tbl_class_202201 C, tbl_teacher_202201 T "
	            + "where C.teacher_code = T.teacher_code "
	            + "and class_seq = ? "
	            + "group by C.regist_month,C.c_no,C.class_area,C.tution,C.teacher_code, "
	            + "        T.teacher_name,T.class_name ";
	      
	      
	      try {
	         
	         getConnection();
	         ps = conn.prepareStatement(sql);
	         ps.setInt(1, class_seq);
	         ResultSet rs = ps.executeQuery();
	         
	         if(rs.next()) {
	            vo.setRegist_month(rs.getString("regist_month"));
	            vo.setC_no(rs.getString("c_no"));
	            vo.setClass_area(rs.getString("class_area"));
	            vo.setTution(rs.getInt("tution"));
	            vo.setTeacher_code(rs.getString("teacher_code"));
	            vo.setTeacher_name(rs.getString("teacher_name"));
	            vo.setClass_name(rs.getString("class_name"));
	         }
	         
	         rs.close();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         disConnection();
	      }
	      
	      return vo;
	      
	   }

	//과정 수정하기
	public int class_update(classVO vo) {
		int result = 0;
		try {
			getConnection();
			String sql = "update tbl_class_202201 set regist_month=?, "
		            + "c_no=?, class_area=?, tution=?, teacher_code=? "
		            + "where class_seq = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getRegist_month());
			ps.setString(2, vo.getC_no());
			ps.setString(3, vo.getClass_area());
			ps.setInt(4, vo.getTution());
			ps.setString(5, vo.getTeacher_code());
			ps.setInt(6, vo.getClass_seq());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}

	//과정 삭제하기
	public int class_delete(int class_seq) {
		int result = 0;
		try {
			getConnection();
			String sql = "delete tbl_class_202201 where class_seq = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, class_seq);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	
	//member_seq가져오기
	public int member_seq(){
		int seq = 0;
		try {
			getConnection();
			String sql = "select max(member_seq)+1 from tbl_member_202201";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				seq = rs.getInt(1);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
			return seq;
		
	}

	//멤버등록하기
	public int member_register(memberVO vo) {
		int rs = 0;
		
		try {
			getConnection();
			String sql = "insert into tbl_member_202201(member_seq,c_no,c_name,phone,address,regist_date,c_type) values(member_seq.nextval,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getC_no());
			ps.setString(2, vo.getC_name());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getRegist_date());
			ps.setString(6, vo.getC_type());
			
			rs = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return rs;
	}

	//멤버 상세보기
	public memberVO member_detail(int member_seq){
		memberVO vo = new memberVO();
	      
		String sql = "select M.member_seq,M.c_no,M.c_name,M.phone,M.address,M.regist_date,M.c_type, T.class_name,T.teacher_name "
				+ "from tbl_class_202201 C, tbl_teacher_202201 T, tbl_member_202201 M "
				+ "where M.c_no = C.c_no and C.teacher_code = T.teacher_code and member_seq = ?";
	      
	      
	      try {
	         
	         getConnection();
	         ps = conn.prepareStatement(sql);
	         ps.setInt(1, member_seq);
	         ResultSet rs = ps.executeQuery();
	         
	         if(rs.next()) {
                vo.setMember_seq(rs.getInt(1));
	            vo.setC_no(rs.getString(2));
	            vo.setC_name(rs.getString(3));
	            vo.setPhone(rs.getString(4));
	            vo.setAddress(rs.getString(5));
	            vo.setRegist_date(rs.getString(6));
	            vo.setC_type(rs.getString(7));
	            vo.setClass_name(rs.getString(8));
	            vo.setTeacher_name(rs.getString(9));
	         }
	         
	         rs.close();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         disConnection();
	      }
	      
	      return vo;
	      
	   }
	
	//멤버 수정하기
	public int member_update(memberVO vo) {
		int result = 0;
		try {
			getConnection();
			String sql = "update tbl_member_202201 set c_name=?, phone=?, address=?, c_no=?,regist_date=?,c_type=? where member_seq=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getC_name());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getC_no());
			ps.setString(5, vo.getRegist_date());
			ps.setString(6, vo.getC_type());
			ps.setInt(7, vo.getMember_seq());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//멤버 삭제하기
	public int member_delete(int member_seq) {
		int result = 0;
		try {
			getConnection();
			String sql = "delete tbl_member_202201 where member_seq = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, member_seq);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}

	//선생님 등록하기
	public int teacher_register(teacherVO vo) {
		int result = 0;
		String sql = "insert into tbl_teacher_202201(teacher_seq,teacher_code,class_name,teacher_name,class_price,teacher_regist_date)"
				+" values(teacher_seq.nextval,?,?,?,?,?)";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTeacher_code());
			ps.setString(2, vo.getClass_name());
			ps.setString(3, vo.getTeacher_name());
			ps.setInt(4, vo.getClass_price());
			ps.setString(5, vo.getTeacher_regist_date());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//선생님 강의 상세보기
	public List<teacherVO> teacher_detail(int teacher_seq) {
		List<teacherVO> list = new ArrayList<teacherVO>();
		teacherVO vo = new teacherVO();
		String sql = "select T.teacher_name, T.class_name, T.class_price, C.class_area "
				+ "from tbl_class_202201 C, tbl_teacher_202201 T "
				+ "where C.teacher_code = T.teacher_code and T.teacher_seq=?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, teacher_seq);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setClass_name(rs.getString("class_name"));
				vo.setClass_area(rs.getString("class_area"));
				vo.setTeacher_name(rs.getString("teacher_name"));
				vo.setClass_price(rs.getInt("class_price"));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return list;
	}
	
	//교사 한명 불러오기
	public teacherVO teacher_detail_one(int teacher_seq) {
		teacherVO vo = new teacherVO();
		String sql = "select * from tbl_teacher_202201 where teacher_seq = ?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, teacher_seq);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setTeacher_seq(rs.getInt("teacher_seq"));
				vo.setTeacher_code(rs.getString("teacher_code"));
				vo.setClass_name(rs.getString("class_name"));
				vo.setTeacher_name(rs.getString("teacher_name"));
				vo.setClass_price(rs.getInt("class_price"));
				vo.setTeacher_regist_date(rs.getString("teacher_regist_date"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return vo;
	}
	//교사 수정하기
	public int teacher_update(teacherVO vo) {
		int result = 0;
		String sql ="update tbl_teacher_202201 set class_name=?,teacher_name=?,class_price=?,teacher_regist_date=? where teacher_seq=?";
		
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getClass_name());
			ps.setString(2, vo.getTeacher_name());
			ps.setInt(3, vo.getClass_price());
			ps.setString(4, vo.getTeacher_regist_date());
			ps.setInt(5, vo.getTeacher_seq());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return result;
	}
	
	//교사 삭제하기
	public int teacher_delete(int teacher_seq) {
		int result = 0;
		String sql = "delete tbl_teacher_202201 where teacher_seq=?";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, teacher_seq);
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return result;
	}
	
	
	
	
	
	
	
}
