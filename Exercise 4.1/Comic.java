package Exercise4_1;

import java.util.Scanner;

public class Comic extends Book{
	
	Scanner input = new Scanner(System.in);
	
	private int decision, rentPrice, days, totalRentPrice, quantity, price, salesPrice, finalPrice;
	
	Comic(){
		super();
		System.out.print("Please enter quantity of the book : ");
		this.quantity = input.nextInt();

		System.out.print("Please enter the price : RM ");
		this.price = input.nextInt();
		System.out.println();
		
		finalPrice();
	}
	
	int getSalesPrice() {
		this.salesPrice = this.price * this.quantity;
		return this.salesPrice;
	}
	
	int finalPrice() {
		this.decision = super.Decision();
		
		if(this.decision == 1) {
			this.rentPrice = this.quantity * 2;
			
			System.out.print("How many days would you like to rent?");
			this.days = input.nextInt();
			
			if(this.days < 30) {
				this.totalRentPrice = this.rentPrice + 5;
			}
			if((this.days > 30) && (this.days < 180)) {
				this.totalRentPrice = this.rentPrice + 15;
			}
			if((this.days > 180) && (this.days < 365)) {
				this.totalRentPrice = this.rentPrice + 30;
			}
			
			this.finalPrice = this.totalRentPrice;
		}
		
		else {
			this.finalPrice = this.getSalesPrice();
		}
		
		return this.finalPrice;
	}
}
