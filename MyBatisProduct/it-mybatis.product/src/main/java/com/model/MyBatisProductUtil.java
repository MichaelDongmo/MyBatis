package com.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisProductUtil {
	private static SqlSessionFactory sqlfactory;
	static {
		String source = "MyBatisProduct-Config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(source);
			sqlfactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlfactory;
	}

}
