package model;

public class Product {
	
	private String description;
	private double price;
	
	
	public Product(String desc, double price) {
		this.description=desc;
		this.price=price;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " Desc: " + getDescription();
	}
	
	
	

}