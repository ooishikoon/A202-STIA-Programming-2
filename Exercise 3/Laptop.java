package Exercise3;

import java.util.Scanner;
public class Laptop {
	String brand;
	String colour;
	int quantity;
	int price;
	int totalPrice;
	double weight;
	
	Scanner s = new Scanner(System.in);
	
	Laptop(){
		System.out.print("Please enter the brand : ");
		this.brand = s.nextLine();
		
		System.out.print("Please enter the colour : ");
		this.colour = s.nextLine();
		
		System.out.print("Please enter the quantity : ");
		this.quantity = s.nextInt();
		
		System.out.print("Please enter the price : RM ");
		this.price = s.nextInt();
		this.totalPrice = this.price * this.quantity;

		System.out.print("Please enter the weight : ");
		this.weight = s.nextDouble();
		
	}
	
	Laptop(String b, String c, int q, int p, double w){
		this.brand = b;
		this.colour = c;
		this.quantity = q;
		this.price = p;
		this.weight = w;
	}
	
}