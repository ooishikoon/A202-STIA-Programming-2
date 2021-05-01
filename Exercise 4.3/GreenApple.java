package fruits;
import java.text.DecimalFormat;

//sub class for Apple
public class GreenApple extends Apple{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 

	private String colour;
	private double price;
	private double vitaminC;
	
	public GreenApple(String name, String t, int q, double w, String c, double p, double vitC) {	//constructor for sub class
		super(name, t, q, w);	//inherit data,method from super class
		colour = c;
		price = p;
		vitaminC = vitC;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double calTotalPrice(double p, int q) {		//overloading method with 2 parameter
		  return price * super.quantity;
	}
	
	public double calPricePerWeight() {		//overloading method without parameter
		return calTotalPrice(price, quantity) / super.calTotalWeight(quantity, weight);
	}
	
	public double calVitCPerWeight(double vitC) {		//overloading method with 1 parameter
		return (vitaminC / 100) * calTotalPrice(price, quantity);
	}
	
	public String toString() { //overriding method
		 return super.toString() +
				"\nColour : " + getColour() +
		 		"\nTotal Price : RM " + df2.format(calTotalPrice(4.99,10)) +
		 		"\nPrice of a " + getName() + " per weight is RM " + df2.format(calPricePerWeight()) + "/kg" +
		 		"\nVitamin C contain in a " + getName() + " is " + df2.format(calVitCPerWeight(15)) + " mcg";

	}

}	//end GreenApple extends Apple class
