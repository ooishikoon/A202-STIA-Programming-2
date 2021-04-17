package Exercise3;

public class Main {
	public static void main(String[] args) {
		Laptop HP = new Laptop();
		
		System.out.println();
		
		System.out.println("My Laptop");
		System.out.println("Brand : " + HP.brand);
		System.out.println("Colour : " + HP.colour);
		System.out.println("Quantity : " + HP.quantity);
		System.out.println("Price : RM "+ HP.totalPrice);
		System.out.println("Weight : " + HP.weight + " kg");
				
		System.out.println();
		
		Laptop Apple = new Laptop("Mac Book", "White", 1, 3500, 0.9);
		System.out.println("Apple");
		System.out.println("Brand : " + Apple.brand);
		System.out.println("Colour : " + Apple.colour);
		System.out.println("Quantity : " + Apple.quantity);
		System.out.println("Price : RM "+ Apple.price);
		System.out.println("Weight : " + Apple.weight + " kg");
		
		
	}
}
