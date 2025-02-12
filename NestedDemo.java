package Java;
class First{
	public void show() {
		System.out.println("Inside first class show method");
	}
	class Second{
		public void show() {
			System.out.println("Inside second class show method");
		}
	}
}


public class NestedDemo {

	public static void main(String[] args) {
		First f = new First();
		f.show();
		First.Second s = f.new Second();
		s.show();

	}

}
