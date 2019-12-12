package com.model;

import org.apache.ibatis.session.SqlSession;

public class ProductDAO {
	public void insertProduct(Product product) {
		SqlSession session =MyBatisProductUtil.getSqlSessionFactory().openSession();
		session.insert("com.model.ProductMapper.insertProduct",product);
		System.out.println("Insert success...");
		session.commit();
		session.close();
	}
	
	
	public void updateProduct(Product product) {
		SqlSession session = MyBatisProductUtil.getSqlSessionFactory().openSession();
		session.update("com.model.ProductMapper.updateProduct", product);
		System.out.println("Update success...");
		session.commit();
		session.close();
	}
	
	public void deleteProduct(int id) {
		SqlSession session = MyBatisProductUtil.getSqlSessionFactory().openSession();
		session.delete("com.model.ProductMapper.deleteProduct", id);
		System.out.println("Delete success...");
		session.commit();
		session.close();
	}
	
	public Product getProduct(int id) {
		SqlSession session = MyBatisProductUtil.getSqlSessionFactory().openSession();
		Product product = session.selectOne("com.model.ProductMapper.selectProduct",id);
		session.close();
		return product;
	}
}
