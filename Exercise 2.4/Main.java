package Laptop;

public class Main {

	public static void main(String[] args) {
		Laptop a = new Laptop();
		
		a.setBrand("Apple Mac Book");
		a.setColour("White");
		a.setQuantity(2);
		a.setWeight(1.2);
		a.setPrice(7500);
		
		System.out.println("Brand : " + a.getBrand());
		System.out.println("Colour : " + a.getColour());
		System.out.println("Quantity : " + a.getQuantity());
		System.out.println("Weight : " + a.getWeight() + " kg");
		System.out.println("Price : RM " + a.getPrice());
	}

}
