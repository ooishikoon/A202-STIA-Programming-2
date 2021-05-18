package Exercise4_5;
import java.util.Scanner;
import java.text.DecimalFormat;

//sub class of Fruit
public class Avocado extends Fruit{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private double grams;
	private double Carbs;
	private double totalCarbs;
	private double price, disc;

	public Avocado(String name, double g, double c, double p) {		//constructor for sub class
		super(name);	//inherit data,method from super class
		grams = g;
		Carbs = c;
		price = p;
		
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
		
			Discount avd = new BlueberryDiscount(); 
			System.out.println("Discount: " + avd.rateOfDiscount()); 
			disc = avd.rateOfDiscount();
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
	
	public double totalPrice() {
		return (price * grams) * (1 - disc);
	}
	
	
	public String toString() {
		return "\n==========Carbohydrates==========" +
				"\nFruit name\t\t: " + getName() +
				"\nTotal Carbohydrates\t: " + df2.format(totalCarbs) +
				"\nTotal Price\t\t: RM " + df2.format(totalPrice()) +
				"\n============THANK YOU============";
	}
	
}	//End Avocado extend Fruit class
