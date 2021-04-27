package exercise4_2;

import java.text.DecimalFormat;
	//super class of all fruits
	public class Fruits {
		private static DecimalFormat df2 = new DecimalFormat("#.##"); 
		String name;
			
		public Fruits(String name) {
			this.name = name;
			System.out.println(this.name);
			System.out.println(name + " constructor is invoked.");
		}
				
		public String getName() {
			return name;
		 }
				
		public String toString() {
			return "\nEat more "+ name + " will get a strong constitution.";
		 }		
	}
	
	class Apple extends Fruits {
		//control who is going to access this data
		private String taste;
		protected int quantity;
		protected double weight;
		
		public Apple(String name, String t, int q, double w) {
			super(name);
			this.taste = t;
			this.quantity = q;
			this.weight = w;
		}
		
		public String taste() {
			return this.taste;
		}	
		
		public int quantity() {
			return this.quantity;
		}
		
		public double weight() {
			return this.weight;
		}
		
		public double calTotalWeight() {
			return this.quantity * this.weight;
		}
		
		public String toString() {
			return ("Taste : " + taste() +
					"\nTotal Weight : RM " + calTotalWeight());
		 }
	}
	
	//sub class for Apple
	class RedApple extends Apple {
		
		private String colour;
		private double price;
		private double payment;
		
		public RedApple(String name, String t, int q, double w, String c, double p, double pt) {
			super(name, t, q, w);
			this.colour = c;
			this.price = p;
			this.payment = pt;
		}
		
		public String colour() {
			return this.colour;
		}
		
		public double calTotalPrice() {
			  return this.price * super.quantity;
		}
		
		public double getPayment() {
			return this.payment;
		}
		
		public double balance() {
			return this.payment - this.calTotalPrice();
		}
	
		public String toString() { //print info
			return "Colour : " + colour() +
					"\nTaste : " + super.taste() +
					"\nTotal price : RM " + calTotalPrice()+
					"\nPayment : RM " + getPayment() +
					"\nBalance : RM " + balance();
		}
	}
		
	//sub class for Apple
	class GreenApple extends Apple{
		
		private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
		private String colour; 
		private double price;
		private double vitaminC;
		
		public GreenApple(String name, String t, int q, double w, String c, double p, double vitC) {
			super(name, t, q, w);
			this.colour = c;
			this.price = p;
			this.vitaminC = vitC;
		}
		
		public String colour() {
			return this.colour;
		}
		
		public double calTotalPrice() {
			  return this.price * super.quantity;
		}
		
		public double calPricePerWeight() {
			return super.calTotalWeight() / calTotalPrice();
		}
		
		public double calVitCPerWeight() {
			return (this.vitaminC / 100) * calTotalPrice();
		}
		
		public String toString() { //print info
			return "Colour : " + colour() +
					"\n" + "Taste : " + taste() +
					"\nTotal Weight : " + super.calTotalWeight() +
					"\nPrice of apple per weight(kg) : " + df2.format(calPricePerWeight()) +
					"\nVitamin C of apple per weight : " + df2.format(calVitCPerWeight());
		}
	}
	
	//sub class for Fruits
	class Avocado extends Fruits {
		
		private static DecimalFormat df2 = new DecimalFormat("#.##"); 
		
		private double carbs;
		private int grams;
		private boolean tfVit;
	
		public Avocado(String name, double c, int g, boolean tfV) {
			super(name);
			this.carbs = c;
			this.grams = g;
			this.tfVit = tfV;
		}
		
		public double calTotalCarbs() {
			return this.carbs * this.grams;
		}
		
		public boolean tfVit() {
			return this.tfVit;
		}
		
		public String toString() {
			return "Total Carbohydrates : " + df2.format(calTotalCarbs()) +
					"\nIs avocado contains Vitamin K? " + tfVit();
		}
	}
	
	//sub class for Fruits
	class Blueberry extends Fruits {
		
		private int tall, mingrowth, maxgrowth;
	
		public Blueberry(String name, int t, int minG, int maxG) {
			super(name);
			this.tall = t;
			this.mingrowth = minG;
			this.maxgrowth = maxG;
		}
		
		public int calMinAge() {
			return (tall*12) / mingrowth;
		}
		
		public int calMaxAge() {
			return (tall*12) / maxgrowth;
		}
	
		public String toString() {
			return "Tall of Blueberry tree growth in a month (in cm) : " + tall +
					"\nEstimated age of Blueberry tree is in between : " + calMinAge() + " to " + calMaxAge() + " years.";
		}
	}

	//main 
	public static void main(String[] args) {
		System.out.println("Welcome to ABC Fruit Shop.");
		System.out.println();
		
		Fruits obj1 = new Fruits("Fruit");
		System.out.println(obj1);
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
		
		Avocado obj5 = new Avocado("Avocado", 0.0657, 200, true);
		System.out.println(obj5);
		System.out.println();
		
		Blueberry obj6 = new Blueberry("Blueberry", 5, 37, 9);
		System.out.println(obj6);
		System.out.println();

	}
