package Exercise4_1;

public class Main {

	public static void main(String[] args) {
		
		Novel a = new Novel();
		
		System.out.println();
		
		System.out.println("Book Info");
		System.out.println("Book Name : " + a.getName());
		System.out.println("Book Genre : " + a.getGenre());
		System.out.println("Total Price : RM "+ a.finalPrice());
					
		System.out.println();
		
		Comic b = new Comic();
		
		System.out.println();
		
		System.out.println("Book Info");
		System.out.println("Book Name : " + b.getName());
		System.out.println("Book Genre : " + b.getGenre());
		System.out.println("Total Price : RM "+ b.finalPrice());

	}

}
