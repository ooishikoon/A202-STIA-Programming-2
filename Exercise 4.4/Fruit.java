package Exercise4_4;

public class Fruit {	//super class
	
	protected String name;
		
		public Fruit(String name) {		//constructor with argument
			this.name = name;
			System.out.println(name + " constructor is invoked\n");
		}
		
		public String getName() {
			return name;
		}
}
