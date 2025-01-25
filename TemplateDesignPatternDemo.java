package Java;

import java.util.Scanner;

abstract class HouseTemplate{		// Same requirements for any house that's why an abstract class is created
	public final void buildHouse() {      // order of building the house (cannot be changed once it is final)
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}
	private void buildFoundation() {
		System.out.println("Step1 : Building foundation with cement,iron,chips");
	}
	public abstract void buildPillars();
	public abstract void buildWalls();
	public abstract void buildWindows();
}
class WoodenHouse extends HouseTemplate{		// building wooden house

	public void buildPillars() {
		System.out.println("Step2 : Wooden Pillars");
		
	}
	public void buildWalls() {
		System.out.println("Step3 : Wooden Walls");
		
	}
	public void buildWindows() {
		System.out.println("Step4 : Wooden windows");	
	}	
}
class GlassHouse extends HouseTemplate{				// building glass house 
	public void buildPillars() {
		System.out.println("Step2 : House Pillars");	
	}
	public void buildWalls() {
		System.out.println("Step3 : House walls");
		
	}
	public void buildWindows() {
		System.out.println("Step4 : Glass Windows");	
	}
}

public class TemplateDesignPatternDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of house: "); 		//taking user input for type of house
		String s = sc.next();
		if(s.equalsIgnoreCase("Wooden")) {
			HouseTemplate ht = new WoodenHouse();		// creating object for wooden house (loose coupling)
			ht.buildHouse();							// calling the method of wooden house
			System.out.println("Wooden house is built!!!!!");
		}
		else if(s.equalsIgnoreCase("Glass")) {
			HouseTemplate ht = new GlassHouse();		//creating object for glass house (loose coupling)
			ht.buildHouse();							// calling the method of glass house
			System.out.println("Glass house is built!!!!!");
		} else {
			System.out.println("Cannot build house");
		}

	}

}
