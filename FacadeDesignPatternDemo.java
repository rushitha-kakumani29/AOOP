package Java;

import java.util.Scanner;

interface Menu{
	public void showMenu();
}
class VegMenu implements Menu{
	public void showMenu() {
		System.out.println("Veg Biryani");
		System.out.println("Panneer");
		System.out.println("Veg Fried rice");
	}
}
class NonVegMenu implements Menu{
	public void showMenu() {
		System.out.println("Chicken Biryani");
		System.out.println("Mutton kemma");
		System.out.println("Fish Fry");
	}
}
class HotelServiceStaff {
	VegMenu v;
	NonVegMenu nv;
	public HotelServiceStaff() {
		this.v = new VegMenu();
		this.nv = new NonVegMenu();
	}
	public void showVegMenu() {
		this.v.showMenu();
	}
	public void showNonVegMenu() {
		this.nv.showMenu();
	}
	public void showVegNonVegMenu() {
		this.v.showMenu();
		this.nv.showMenu();
	}
}
public class FacadeDesignPatternDemo {

	public static void main(String[] args) {
		HotelServiceStaff h = new HotelServiceStaff();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of menu:");
		String s = sc.next();
		if(s.equalsIgnoreCase("VEG")){
			System.out.println("'DISPLAYING VEG MENU'");
			h.showVegMenu();
		}
		else if(s.equalsIgnoreCase("NONVEG")){
			System.out.println("'DISPLAYING NON-VEG MENU'");
			h.showNonVegMenu();
		}
		else {
			System.out.println("DISPLAYING VEG & NON-VEG MENU");
			h.showVegNonVegMenu();
		}

	}

}
