package Java;
class SingleObject{
	private static SingleObject instance  = new SingleObject();
	private SingleObject() {
		
	}
	public static SingleObject getInstance() {
		return instance;
	}
	public void display() {
		System.out.println("Hello I'm Rushitha Kakumani");
	}
}

public class SinglePatternDemo {

	public static void main(String[] args) {
		SingleObject obj = SingleObject.getInstance();
		obj.display();
	}

}
