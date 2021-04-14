package LaptopScanner;
import java.util.Scanner;

public class Laptop {
	Scanner s = new Scanner(System.in);
	
	String brand, colour;
	int quantity, price;
	double weight;
	
	//create setter method
	void setBrand() {
		System.out.println("Please enter the brand : ");
		this.brand = s.nextLine();
	}
	
	void setColour() {
		System.out.println("Please enter the colour : ");
		this.colour = s.nextLine();
	}
	
	void setQuantity() {
		System.out.println("Please enter the quantity : ");
		this.quantity = s.nextInt();
	}
	
	void setPrice() {
		System.out.println("Please enter the price : RM ");
		this.price = s.nextInt();
	}
	
	void setWeight() {
		System.out.println("Please enter the weight : ");
		this.weight = s.nextDouble();
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
