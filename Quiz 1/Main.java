package LaptopScanner;

import Laptop.Laptop;

	public class Main {
		public static void main(String[] args) {
			
			Laptop a = new Laptop();
			a.setBrand();
			a.setColour();
			a.setQuantity();
			a.setWeight();
			a.setPrice();

			System.out.println("Brand : " + a.getBrand());
			System.out.println("Colour : " + a.getColour());
			System.out.println("Quantity : " + a.getQuantity());
			System.out.println("Weight : " + a.getWeight() + " kg");
			System.out.println("Price : RM " + a.getPrice());
		}

}
