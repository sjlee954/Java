package com.ezen.prj;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainClass {

	public static void main(String[] args) {
		String resource = "com/ezen/prj/mybatis-configue.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);

			//DB연결 session자체가 DB연결을 유지하고 있음.
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
			
			mapperInterface mapper = session.getMapper(mapperInterface.class);
			BoardVO vo = mapper.selectOne(2);
			System.out.println(vo.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
