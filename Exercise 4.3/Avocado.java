package fruits;

import java.text.DecimalFormat;

//sub class of Fruit
public class Avocado extends Fruit {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	private double carbs;
	private int grams;

	public Avocado(String name, double c, int g) {		//constructor for sub class
		super(name);	//inherit data,method from super class
		carbs = c;
		grams = g;
	}
	
	public double calTotalNutrients() {		//overloading method without parameter
		return grams * 0.539;
	}
	
	public double calTotalCalories(int g) {		//overloading method with 1 parameter
		return grams * 0.887;
	}
	
	public double calTotalCarbs(double c, int g) {		//overloading method with 2 parameter
		return grams * carbs ;
	}
	
	public String printBenefits() {		//overriding method
		return "Avocados are good source of potassium and are low in sodium, which helps keep blood pressure stable.";
	}
	
	public String toString() {	//overriding method
		 return super.toString() +
				"\nTotal Nutrients : " + df2.format(calTotalNutrients()) + 
				"\nTotal Calories : " + df2.format(calTotalCalories(200)) +
				"\nTotal Carbohydrates : " + df2.format(calTotalCarbs(0.0657, 200)) +
				"\n" + printBenefits();
	}
}	//End Avocado extends Fruit class
