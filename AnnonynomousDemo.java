package Java;

class First1{
	public void show() {
		System.out.println("Inside first class show");
	}
}
//class Second2 extends First1{
//	public void show() {
//		System.out.println("Inside Second class show");
//	}
//}
public class AnnonynomousDemo {

	public static void main(String[] args) {
		First obj = new First() {
			public void show() {
				System.out.println("Inside second class anonymous");
			}
		};
		obj.show();
	}

}
