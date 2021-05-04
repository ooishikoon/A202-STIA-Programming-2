package Exercise4_4;
import java.util.Scanner;
import java.text.DecimalFormat;

//sub class of Fruit
public class Avocado extends Fruit{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private double grams;
	private double Carbs;
	double totalCarbs;

	public Avocado(String name, double g, double c) {		//constructor for sub class
		super(name);	//inherit data,method from super class
		grams = g;
		Carbs = c;
		
		System.out.print("Please enter the grams of avocado : ");
		grams = input.nextDouble();
		
		if(grams < 200) {
			Carbs();
			System.out.println(name);
			System.out.println("The avocado is LESS THAN 200g. \nTotal Carbohydrates : " + df2.format(Carbs()));
		} 
		else if(grams > 200 && grams < 400) {
			g = 346;
			Carbs(g);
			System.out.println(name);
			System.out.println("The avocado is LESS THAN 200g and MORE THAN 400g. \nTotal Carbohydrates : " + df2.format(Carbs(g)));
		} 
		else if(grams > 400){
			int q = 3;
			double gg = 459;
			Carbs(gg, q);
			System.out.println(name);
			System.out.println("The avocado is MORE THAN 400g. \nTotal Carbohydrates : " + df2.format(Carbs(gg, q)));
		} 
		else {
			System.out.println("Invalid input. Please enter a valid Carbsmber.");
		}
	}
	
	public double Carbs() {
		return totalCarbs = Carbs * 100;
	}
	
	public double Carbs(double g) {
		return totalCarbs = Carbs * g;
	}
	
	public double Carbs(double gg, int q) {
		return totalCarbs = Carbs * gg * q;
	}
	
	public String toString() {
		return "\n==========Carbohydrates==========" +
				"\nFruit name\t\t: " + getName() +
				"\nTotal Carbohydrates\t: " + df2.format(totalCarbs) +
				"\n============THANK YOU============";
	}
	
}	//End Avocado extend Fruit class
