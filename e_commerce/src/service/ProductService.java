package service;

import java.util.List;

import entity.Product;

public interface ProductService {

	public int addProducts(Product product, String token);

	public List<Product> fetchAllProduct();

	public int updataStockOfProudct(String token, int productId, int productQty);
}