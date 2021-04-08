package Table;
import java.util.Scanner;

public class Table {
	Scanner input = new Scanner(System.in);
	String name;
	String colour;
	String type;
	int tableLeg;
	
	void printTable() {
		System.out.print("Please enter the table name : ");
		String name = input.nextLine();
		System.out.print("Please enter the colour of table : ");
		String colour = input.nextLine();
		System.out.print("Please enter the type of wood : ");
		String type = input.nextLine();
		System.out.print("Please enter the number of legs of the table : ");
		int legTable = input.nextInt();
		
		System.out.println("Name : " + name);
		System.out.println("Colour : " + colour);
		System.out.println("Type : " + type);
		System.out.println("Legs of table : " + legTable);
	}
	
	void calPrice() {
		System.out.println("\nPRICE");
		System.out.print("Please enter the price : RM ");
		double price = input.nextDouble();
		
		System.out.print("Please enter 0 for self-pickup, 1 for East Malaysia, 2 for West Malaysia : ");
		int state = input.nextInt();
		
		if(state == 0) {
			System.out.printf("Total Price : RM %.2f" ,price);
		}
		if(state == 1) {
			System.out.println("Delivery Fee : RM 10");
			price += 10;
			System.out.printf("Total Price : RM %.2f" ,price);
		}
		if(state == 2) {
			System.out.println("Delivery Fee : RM 15");
			price += 15;
			System.out.printf("Total Price : RM %.2f" ,price);
		}
	}
		
	void calVolume() {
		System.out.println("\n\nVOLUME");
		System.out.print("Please enter height of table in m : "); 
		double height = input.nextDouble();
		System.out.print("Please enter length of table in m : ");
		double length = input.nextDouble();
		System.out.print("Please enter width of table in m : ");
		double width = input.nextDouble();
		
		double volume = height * length * width;
		
		System.out.printf("Volume : %.2f cubic metre." ,volume);
	}
		
	void calQuantity() {
		System.out.println("\n\nQUANTITY");
		System.out.print("Please enter table in a row : ");
		int row = input.nextInt();
		System.out.print("Please enter the number of column : ");
		int column = input.nextInt();
		
		int quantity = row * column;
		
		System.out.println("Total quantity in a room : " + quantity);
	}

}
