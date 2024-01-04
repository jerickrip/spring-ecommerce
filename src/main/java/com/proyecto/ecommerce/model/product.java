package com.proyecto.ecommerce.model;

public class product {
	private Integer id;
	private String name;
	private String description;
	private String image;
	private double price;
	private int quantity;
	
	public product() {
		// TODO Auto-generated constructor stub
	}

	public product(Integer id, String name, String description, String image, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getimage() {
		return image;
	}

	public void setimage(String image) {
		this.image = image;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
}
