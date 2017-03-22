package com.niit.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name="product")

public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

@NotEmpty(message="Product Name is mandatory")
private String name;

@NotEmpty(message="Description is Mandatory")
private String description;

@Min(value=10)	
private double price;

@Min(value=2)
private int quantity;
	
@NotNull(message="Manufacturing date is mandatory")	
private Date mfg;

@ManyToOne
@JoinColumn(name="cid")
private Category category;
@Transient
private MultipartFile image;
//sample_product [pid,name,description,price,quantity,mfg]
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getMfg() {
	return mfg;
}
public void setMfg(Date mfg) {
	this.mfg = mfg;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}
}