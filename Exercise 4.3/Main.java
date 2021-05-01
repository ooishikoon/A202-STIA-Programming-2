package fruits;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to ABC Fruit Shop.");
		System.out.println();
		
		Fruit obj1 = new Fruit("Fruit");
		System.out.println(obj1);
		System.out.println(obj1.printBenefit());
		System.out.println();
		
		Apple obj2 = new Apple("Apple", "Sweet", 5, 0.75);
		System.out.println(obj2);
		System.out.println();
		
		RedApple obj3 = new RedApple("Red Apple", "Sweet", 7, 0.50, "Bright Red", 3.50, 50);
		System.out.println(obj3);
		System.out.println();
		
		GreenApple obj4 = new GreenApple("Green Apple", "Sour", 10, 0.73, "Bright Green", 4.99, 15);
		System.out.println(obj4);
		System.out.println();
		
		Avocado obj5 = new Avocado("Avocado", 0.0657, 200);
		System.out.println(obj5);
		System.out.println();
		
		Blueberry obj6 = new Blueberry("Blueberry", 30, 35, 37, 9);
		System.out.println(obj6);
		System.out.println();
		
	}
}
