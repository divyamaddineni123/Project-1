package com.niit.Service;

import java.util.List;
import com.niit.model.Product;

public interface ProductService {
Product saveProduct (Product Product);
List<Product> getAllProducts ();
Product getProductById(int id);
void deleteProduct(int id);
void updateProduct(Product product);
}
