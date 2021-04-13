package Laptop;

public class Laptop {
	String brand, colour;
	int quantity, price;
	double weight;

	//create setter method
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//create getter method
	public String getBrand() {
		return this.brand;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
