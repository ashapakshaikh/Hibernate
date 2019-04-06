package com.fujitsu.bins;

import java.io.Serializable;
/*
 * author:mayur shinde
 * creation date:19/03/2019()
 * modification date:29/03/2019(dd/mm/yyyy)
 * version:3.0
 * description:it represents database entity
 * 			it is java main class 
 * 	it is persistent class of hibernate
 * 	it is also pojo class.
 * 	copyright: fujitsu.pvt.india
 */
// java bean  class- entry class
public class Product implements Serializable,Comparable {
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	

	public Product() {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


}
