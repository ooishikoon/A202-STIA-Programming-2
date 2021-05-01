package fruits;

//sub class for Apple
public class RedApple extends Apple {
	
	private String colour;
	private double price;
	private double payment;
	
	public RedApple(String name, String t, int q, double w, String c, double p, double pt) {	//constructor for sub class
		super(name, t, q, w);	//inherit data,method from super class
		colour = c;
		price = p;
		payment = pt;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getPayment() {
		return payment;
	}
	
	public String printPrice() {	//overloading without parameter
		return "Price of a " + getName() + " is RM " + price;
	}
	
	public double calTotalPrice(double p, int q) {		//overloading with 2 parameter
		  return price * quantity;
	}
	
	public double balance(double pt) {		//overloading with 1 parameter
		return payment - calTotalPrice(price, quantity);
	}
	
	
	public String toString() { //overriding method
		 return super.toString() +
				"\nColour : " + getColour() +
				"\n" + printPrice() +
				"\nTotal price : RM " + calTotalPrice(3.50, 7) +
				"\nPayment : RM " + getPayment() +
				"\nBalance : RM " + balance(50);
	}

}	//end RedApple extends Apple class
