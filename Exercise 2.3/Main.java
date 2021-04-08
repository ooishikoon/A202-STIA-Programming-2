package Table;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Table diningTable = new Table(); //create first object as diningTable
		Table coffeeTable = new Table(); //create second object as coffeeTable
		
		System.out.println("Dining Table");
		diningTable.printTable();
		diningTable.calPrice();
		diningTable.calVolume();
		diningTable.calQuantity();
		
		System.out.println();
		
		System.out.println("Coffee Table");
		coffeeTable.printTable();
		coffeeTable.calPrice();
		coffeeTable.calVolume();
		coffeeTable.calQuantity();

	}

}
