package fruits;

//sub class of Fruit
public class Blueberry extends Fruit{
	
	private int tallOri, tallCurrent, mingrowth, maxgrowth;

	public Blueberry(String name, int tOri, int tCur, int minG, int maxG) {		//constructor for sub class
		super(name);	//inherit data,method from super class
		tallOri = tOri;
		tallCurrent = tCur;
		mingrowth = minG;
		maxgrowth = maxG;
	}
	
	public int calGrowth(int tOri, int tCur) {		//overloading method with 2 parameter
		return tallCurrent - tallOri;
	}
	
	public int calMinAge(int minG) {		//overloading method with 1 parameter
		return (calGrowth(tallOri, tallCurrent) * 12) / mingrowth;
	}
	
	public int calMaxAge() {	//overloading method without parameter
		return (calGrowth(tallOri, tallCurrent) * 12) / maxgrowth;
	}
	
	public String printBenefits() {		//overriding method
		return "Blueberries can help heart health, bone strength, skin health, blood pressure, diabetes management, cancer prevention, and mental health.";
	}

	public String toString() {	//overriding method
		 return super.toString() +
				"\nTall of Blueberry tree growth in a month (in cm) : " + calGrowth(30, 35) + " cm" +
				"\nEstimated age of Blueberry tree is in between : " + calMinAge(9) + " to " + calMaxAge() + " years." +
				"\n" + printBenefits();
	}
}	//End Blueberry extend Fruit class
