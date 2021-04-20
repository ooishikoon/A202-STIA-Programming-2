package Exercise4;

public class Main {

	public static void main(String[] args) {
		
		Book Book1 = new Book(2,20);
		
		System.out.println();
		
		System.out.println("My Book");
		System.out.println("Book Name : " + Book1.getName());
		System.out.println("Quantity : " + Book1.getQuantity());
		System.out.println("Total Price : RM "+Book1.getPrice());
					
		System.out.println();
		
		BookShop Book2 = new BookShop(5,12,25);
		System.out.println("Book 2");
		System.out.println("Book Name : " + Book2.getName());
		System.out.println("Quantity : " + Book2.getQuantity());
		System.out.println("Total Price : RM " + Book2.getPrice());
		System.out.println("Discount Price : RM " + Book2.discountPrice());
		
	}

}
