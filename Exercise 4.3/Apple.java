package fruits;

//subclass of Fruit
public class Apple extends Fruit {
	
	//control who is going to access this data
	private String taste;
	protected int quantity;
	protected double weight;
	
	public Apple(String name, String t, int q, double w) { //constructor for sub class
		super(name); //inherit data,method from super class
		taste = t;
		quantity = q;
		weight = w;
	}
	
	public String getTaste() { 
		return taste;
	}	
	
	public int getQuantity() { 
		return quantity;
	}
	
	public double getWeight() { 
		return weight;
	}
	
	public int totalQuantity() {	//overloading method without parameter
		return 5 * quantity;
	}
	
	public String totalQuantity(int q) {		//overloading method with 1 parameter
		if(q > 0)
			return "There are " + q + " " + getName() + " in a basket.";
		else
			return "Invalid quantity.";
	}
	
	public double calTotalWeight(double q, double w) { //overloading method with 2 parameters
		return quantity * weight;
	}
	
	public String toString() { //overriding method
		 return super.toString() +
				"\nTaste : " + getTaste() +
				"\nQuantity : " + getQuantity() +
				"\nWeight : " + getWeight() + " kg" +
				"\nThere are total " + totalQuantity() + " " + getName() + " in 5 packets." +
		 		"\n" + totalQuantity(10) +
				"\nTotal weight of a packet of " + getName() + " is " + calTotalWeight(5, 0.75) + " kg";
	 }

} //end for Apple extends Fruit class