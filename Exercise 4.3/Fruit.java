package fruits;

//super class of all fruits
public class Fruit {
	
	private String name;
		
		public Fruit(String name) {		//constructor with argument
			this.name = name;
		}
				
		public String getName() {
			return name;
		 }
		
		public String printBenefit() {
			return "Eat more "+ name + " will get a strong constitution.";
		}
				
		public String toString() { //overriding method
			return name + " constructor is invoked." + 
				   "\n\nFruit : " + getName();
		 }		
}		//End Fruit class
