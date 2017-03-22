package com.niit.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.model.Product;
import com.niit.Dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductDao productDao;

public ProductServiceImpl(){
	System.out.println("CREATING INSTANCE FOR PRODUCTSERVICEIMPL");
}

	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

}