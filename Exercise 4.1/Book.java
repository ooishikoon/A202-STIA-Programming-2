package Exercise4_1;

import java.util.Scanner;

public class Book {
	Scanner input = new Scanner(System.in);
	
	private String name, genre;
	private int decision;
	
	Book(){
		System.out.println("Welcome to ABC Book Shop.\n");
		
		System.out.print("Please enter genre of the book : ");
		this.genre = input.nextLine();	
			
		System.out.print("Please enter name of the book : ");
		this.name = input.nextLine();
	}
	
	int Decision() {
		System.out.print("What are you going to do? (1 for rent, 2 for buy)");
		this.decision = input.nextInt();
		
		while (decision != 1 && decision != 2){
			System.out.println("Error input. Please enter the correct input (1 for rent, 2 for buy).");
		}
		
		if (this.decision == 1) {
			System.out.println("You are going to rent this book!");
		}
			
		else if(this.decision == 2) {
			System.out.println("You are going to buy this book!");
		}
		
		return decision;
	}

	//getter method
	
	String getGenre() {
		return this.genre;
	}
	
	String getName() {
		return this.name;
	}
	
}
