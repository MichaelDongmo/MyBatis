package com.model;

public class RunProductMyBatis {

	public static void main(String[] args) {
		Product product = new Product();
		ProductDAO dao = new ProductDAO();
		
		// Insert Product
		product.setProduct_id(12);
		product.setProduct_name("Raspberry");
		product.setProduct_price(1.99);
		product.setProduct_qty(567);
		product.setProduct_cathegory("Vegetable");
		
		//dao.insertProduct(product);
		
		// Update Product
		
		Product product2 = new Product();
		product2.setProduct_id(1);
		product2.setProduct_name("Cabbage");
		product2.setProduct_price(1.99);
		product2.setProduct_qty(345);
		product2.setProduct_cathegory("Vegetable");
		
		//dao.updateProduct(product2);
		
		//get Product 
		
		Product product3 = dao.getProduct(5);
		System.out.println("Product_id: " + product3.getProduct_id() + " Product_name: " + product3.getProduct_name() + 
				" Product_price " + product3.getProduct_price() + " Product_quantity " + product3.getProduct_qty() + 
				" product_category " + product3.getProduct_cathegory() );
		
		//Delete Product
		dao.deleteProduct(6);
		
	}

}
