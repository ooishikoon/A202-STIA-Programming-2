package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to ABC Fruit Shop.");
		System.out.println();
		
		Apple obj1 = new Apple("Apple", 3.99);
		System.out.println(obj1);
		System.out.println();
		
		RedApple obj2 = new RedApple("Red Apple","Golden Delicious", 3.50, "Bright red", "Sweet");
		System.out.println(obj2);
		System.out.println();
		
		GreenApple obj3 = new GreenApple("Green Apple", "Granny Smith", 4.99, "Bright green", "Sour");
		System.out.println(obj3);
		System.out.println();
		
		Avocado obj4 = new Avocado("Avocado", 200, 0.0657);
		System.out.println(obj4);
		System.out.println();
		
		Blueberry obj5 = new Blueberry("Blueberry", 250, 2.35);
		System.out.println(obj5);
		System.out.println();
	}

}
