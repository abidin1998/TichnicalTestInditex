package com.myapp.app.bean;

/**
 * The Products
 *
 */
public class Products {

	private String id;
	private String name;
	private Integer price;
	private boolean availability;
	
	
	
	
	public Products(String id, String name, Integer price, boolean availability) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
	}
	
	
	
	public Products() {
		super();
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
}
