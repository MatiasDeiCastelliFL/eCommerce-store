package com.curso.ecommerce.model;

public class Products {
	private Integer id;
	private String description;
	private String name;
	private String image;
	private Double precio;
	private int amount;
	public Products() {
	}
	public Products(Integer id, String description, String name, String image, Double precio, int amount) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.image = image;
		this.precio = precio;
		this.amount = amount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", description=" + description + ", name=" + name + ", image=" + image
				+ ", precio=" + precio + ", amount=" + amount + "]";
	}
	
}	
