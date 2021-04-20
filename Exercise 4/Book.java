package Exercise4;

import java.util.Scanner;

public class Book {
	
	Scanner s = new Scanner(System.in);

	private String name;
	private int quantity, price;
	
	Book(int quantity, int price){
		
		System.out.print("Please enter name of the book : ");
		this.name = s.nextLine();
	
		System.out.print("Please enter quantity of the book : ");
		this.quantity = s.nextInt();
	
		System.out.print("Please enter the price : RM ");
		this.price = s.nextInt();
	}
	
	//getter method
	
	public String getName() {
		return this.name;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public int getPrice() {
		return this.price * this.quantity;
	}
	
}
