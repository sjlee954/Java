package com.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.it.dto.memberVO;

import util.DBManager;

public class memberDAO {
	private memberDAO() {}
	private static memberDAO instance = new memberDAO();
	public static memberDAO getInstance() {
		return instance;
	}
	public List<memberVO> selectAllMovie() {
		List<memberVO> list = new ArrayList<memberVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from movie order by code desc";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				memberVO vo = new memberVO();
				vo.setCode(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPrice(rs.getInt(3));
				vo.setDirector(rs.getString(4));
				vo.setActor(rs.getString(5));
				vo.setPoster(rs.getString(6));
				vo.setSynopsis(rs.getString(7));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		
		return list;
		
	}
	public int insertMovie(memberVO mVo) {
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into movie values(movie_seq.nextval,?,?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getTitle());
			pstmt.setInt(2, mVo.getPrice());
			pstmt.setString(3, mVo.getDirector());
			pstmt.setString(4, mVo.getActor());
			pstmt.setString(5, mVo.getPoster());
			pstmt.setString(6, mVo.getSynopsis());
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
		return result;
	}
	public void deleteMovie(int code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete movie where code=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,code);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
		
	}
	public memberVO selectMovieBycode(int code) {
		String sql = "select * from movie where code=?";
		memberVO mVo = new memberVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mVo.setCode(rs.getInt("code"));
				mVo.setTitle(rs.getString("title"));
				mVo.setPrice(rs.getInt("price"));
				mVo.setDirector(rs.getString("director"));
				mVo.setActor(rs.getString("actor"));
				mVo.setSynopsis(rs.getString("synopsis"));
				mVo.setPoster(rs.getString("poster"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		return mVo;
	}
	public void updateMovie(memberVO mVo) {
		String sql = "update movie set title=?, price=?, director=?, actor=?, poster=?, synopsis=? where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getTitle());
			pstmt.setInt(2, mVo.getPrice());
			pstmt.setString(3, mVo.getDirector());
			pstmt.setString(4, mVo.getActor());
			pstmt.setString(5, mVo.getPoster());
			pstmt.setString(6, mVo.getSynopsis());
			pstmt.setInt(7, mVo.getCode());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
	
	}
}
