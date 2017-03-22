 package com.niit.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
 import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.model.Product;
import com.niit.Service.CategoryService;
import com.niit.Service.ProductService;

@Controller
public class ProductController {
@Autowired	
private ProductService ProductService;
@Autowired
private CategoryService categoryService;
Logger logger=Logger.getLogger(ProductController.class);
public ProductController () {
System.out.println("CREATING INSTANCE FOR PRODUCTCONTROLLER");
}

@RequestMapping("/admin/Product/Productform")
public String getProductForm(Model model) {
	//Product Product= new Product ();
	model.addAttribute("Product",new Product());
	model.addAttribute("categories",categoryService.getCategories() );
			return "Productform";
}		


@RequestMapping("/admin/Product/addProduct")
public String saveProduct (
		@Valid @ModelAttribute(value="Product") Product product,BindingResult result,Model model ) {
	model.addAttribute("categories",categoryService.getCategories());
	logger.debug("===========================================================================");
	
	if (result.hasErrors())
		
		return "Productform";
 ProductService.saveProduct(product); 
logger.debug("After persisting the product details");
MultipartFile prodImage=product.getImage();
	if(!prodImage.isEmpty()){
		Path paths=
Paths.get("C:/Users/welcome/workspace/Demolaptop/src/main/webapp/WEB-INF/resources/images/"+ product.getId()+".png");
	try {
		prodImage.transferTo(new File(paths.toString()));
	} catch (IllegalStateException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	logger.debug("===========================================================================");
	
	return "redirect:/all/Product/getAllProducts";
}

@RequestMapping("/all/Product/getAllProducts")
public String getAllProducts(Model model){
	List<Product> products=ProductService.getAllProducts();
	//Assigning list of products to model attribute products
	model.addAttribute("ProductList",products);
	return "Productlist";
}
@RequestMapping ("/all/Product/viewproduct/{id}")
public String viewProduct (@PathVariable int id,Model model) {
	Product product=ProductService.getProductById(id);
	model.addAttribute("Product",product);
	return "viewproduct";

}  


@RequestMapping("/admin/Product/deleteProduct/{id}")
public String deleteProduct(@PathVariable int id){
	ProductService.deleteProduct(id);
	return "redirect:/all/Product/getAllProducts";
}


/**
 *    to display the form to edit product details
 */
@RequestMapping("/admin/Product/editform/{id}")
public String editProductForm(@PathVariable int id,Model model){
	System.out.println("value of id is" +id);
	Product product=ProductService.getProductById(id);
	System.out.println(product.getName());
	model.addAttribute("Product",product);
	model.addAttribute("categories",categoryService.getCategories ());
	return "editProductform";
}
@RequestMapping("/admin/Product/editProduct")
public String editProductDetails(@Valid @ModelAttribute("Product") Product product,
		BindingResult result){
	if(result.hasErrors())
		return "Productform";
	ProductService.updateProduct(product);
	return "redirect:/all/Product/getAllProducts";
}

@RequestMapping("/all/Product/ProductByCategory")
public String getProductsByCategory(@RequestParam(name="searchCondition") String searchCondition,Model model){
	List<Product> products=ProductService.getAllProducts();
	//Assigning list of products to model attribute 
	model.addAttribute("ProductList",products);
	model.addAttribute("searchCondition",searchCondition);
	return "Productlist";
}
/*@RequestMapping("/header")
public String header (Model model) {
	model.addAttribute("Categories",categoryService.getCategories ());
	return "header";
}*/
}
