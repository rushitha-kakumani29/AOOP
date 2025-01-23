package Java;


import java.util.Scanner;

interface Shape{
	public void draw();
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Inside circle class draw method");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Inside Square class draw method");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Inside Rectangle class draw method");
	}
}
class shapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}

public class FactoryDesignDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		shapeFactory sf = new shapeFactory();
		System.out.println("Enter the Shape(Circle / Rectangle / Square): ");
		String s = sc.next();
		if(s.equalsIgnoreCase("Circle")) {
			Shape obj = sf.getShape("Circle");     // get the object of circle
			obj.draw();
		} else if(s.equalsIgnoreCase("Square")) {
			Shape obj = sf.getShape("Square");      // get the object of Square
			obj.draw();
		} else if(s.equalsIgnoreCase("Rectangle")) {
			Shape obj = sf.getShape("Rectangle");		// get the object of Rectangle
			obj.draw(); 
		} else {
			System.out.println("Invalid");
		}

	}

}
