package com.ezen.mybatis;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisMain {

	public static void main(String[] args){
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			System.out.println("session :"+session);
			System.out.println("sqlSessionFactory : "+ sqlSessionFactory);
			BoardMethod mapper = session.getMapper(BoardMethod.class);
			BoardVO vo = mapper.selectOne(1);
			System.out.println(vo.toString());
			System.out.println("---------------------");
		
//			mapper.deleteBoard(5);
			
			BoardVO vo3 = new BoardVO();
//			vo3.setId(6);
//			vo3.setName("홍길동6");
//			vo3.setPhone("010-6666-6666");
//			vo3.setAddress("서울시 강남구");
//			mapper.insertBoard(vo3);
//			session.commit();
			
			vo.setId(4);
			vo.setName("손흥민");
			vo.setPhone("010-0000-0000");
			vo.setAddress("부산시");
			mapper.updateBoard(vo);
			session.commit();
			
			
			List<BoardVO> list = mapper.selectAllMember();
			for(BoardVO vo2 : list)
				System.out.println(vo2.toString());
			System.out.println("---------------------");
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
