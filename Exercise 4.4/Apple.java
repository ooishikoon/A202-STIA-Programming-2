package Exercise4_4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Apple extends Fruit {		//subclass of Fruit
		
		private static DecimalFormat df2 = new DecimalFormat("#.##"); 
		Scanner input = new Scanner(System.in);
		
		//control who is going to access this data
		protected int quantity;
		protected double price;
		protected double totalprice;
		
		public Apple(String name, double p) { //constructor for sub class
			super(name); //inherit data,method from super class
			price = p;
			
			System.out.print("Please enter the quantity of apple you want to buy : ");
			quantity = input.nextInt();
			
			if(quantity < 50) {
				totalPrice();  //overloading method with no arguments 
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart. \nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice()));
			} 
			else if(quantity >= 50 && quantity < 100) {
				double p2 = 2.99; 
				totalPrice(p2); //overloading method with 1 argument
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart. \nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice(p2)));
			} 
			else {
				double p3 = 1.99; 
				double disc = 0.15;
				totalPrice(disc, p3);
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart. \nYou've get a 15% discount!" +
								   "\nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice(disc,p3)));
			}
		}
		
		public double totalPrice() {
			return totalprice = this.price * this.quantity;
		}
			
		public double totalPrice(double p2) {
			return totalprice =p2 * this.quantity;
		}
			
		public double totalPrice(double disc, double p3) {
			return totalprice = ((p3 * this.quantity) * (1 - disc));
		}
		
}
