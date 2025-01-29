package Java;
class MyClass1<T>{ 		// genric class
	static <T> void display(T[] arr){
		for(T i : arr) {		// for-each loop used to iterate through given array
			System.out.println(i);		// to print the given array elements in genric type
		}
	}
}

public class GenricMethod {
	public static void main(String[] args) {
		Integer arr1[] = {1,2,3,4,5};			// integer array elements
		System.out.println("Reading Integer values");
		MyClass1.display(arr1);		// to print array elements
		
		Float arr2[] = {1.123f, 2.123f, 3.123f, 4.123f, 5.123f};		// float array elements
		System.out.println("Reading Float Values");
		MyClass1.display(arr2);			// to print array elements 
		
	}

}
