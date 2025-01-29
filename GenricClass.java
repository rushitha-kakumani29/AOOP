package Java;
class MyClass<T>{		// genric type 
	T obj;				// genric class object 
	public MyClass(T obj) {			// genric class constructor
		this.obj = obj;
	}
	T getObj() {			// to return genric type
		return obj;
	}
}
public class GenricClass {
	public static void main(String[] args) {
		Integer i = 2;			//The type of genric class is integer 
		MyClass<Integer> obj1 = new MyClass<Integer>(i);
		System.out.println(obj1.getObj() + " is of Integer Type");
		Float f = 2.1f;			//The type of genric class is float
		MyClass<Float> obj2 = new MyClass<Float>(f);
		System.out.println(obj2.getObj() + " is of Float Type");
		Double d = 2.3;;		//The type of genric class is double
		MyClass<Double> obj3 = new MyClass<Double>(d);
		System.out.println(obj3.getObj() + " is of Double Type");

	}

}
