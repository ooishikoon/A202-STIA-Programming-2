package Exercise4_4;

import java.text.DecimalFormat;
import java.util.Scanner;

//sub class for Apple
public class GreenApple extends Apple {
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private String colour;
	private String taste;
	private String type;
	double balance;
	
	public GreenApple(String name, String ty, double p, String c, String t) {
		super(name, p);
		colour = c;
		taste = t;
		type = ty;
		
	}
		
		public String getColour() {
			return colour;
		}
		
		public String getTaste() {
			return taste;
		}
		
		public String getType() {
			return type;
		}
		
		public double calBalance() {
			System.out.print("Please enter your payment : RM ");
			double pt = input.nextDouble();
			
			return balance = pt - totalprice;
		}
		
		public String orderDetails() {
			return "\n=========Order details==========" +
					"\n" + getName() +
					"\nType\t\t: " + getType() +
					"\nColour\t\t: " + colour +
					"\nTaste\t\t: " + taste +
					"\nQuantity\t: " + quantity;
		}
		
		public String paymentDetails() {
			return "\n==========Payment==========" + 
					"\nTotal price\t: RM " + totalprice +
					"\nBalance\t\t: RM " + df2.format(calBalance());
		}

		public String toString() {
			return orderDetails() + "\n" + paymentDetails() +
					"\n==========THANK YOU==========";
		}
}	//end GreenApple extends Apple class
