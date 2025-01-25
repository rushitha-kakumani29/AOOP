package Java;

import java.util.Scanner;

interface Shape1{
	public void draw();
}
class Circle1 implements Shape1{
	public void draw() {
		System.out.println("Inside circle class");
	}
}
class Rectangle1 implements Shape1{
	public void draw() {
		System.out.println("Inside rectangle class");
	}
}
abstract class ShapeDecorater{
	protected Shape1 decoratedShape;
	public ShapeDecorater(Shape1 decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	public void draw() {
		decoratedShape.draw();
	}
}
class RedShapeDecorater extends ShapeDecorater implements Shape1{
	public RedShapeDecorater(Shape1 decoratedShape) {
		super(decoratedShape);
	}
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	private void setRedBorder(Shape1 decoratedShape) {
		System.out.println("Border color Red");
	}
}

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape u want: ");
		String s = sc.next();
		if(s.equalsIgnoreCase("Circle")) {
			Shape1 c = new Circle1();
			Shape1 rc = new RedShapeDecorater(new Circle1());
			System.out.println("Normal circle(Without any border)");
			c.draw();
			System.out.println();
			System.out.println("Circle with border(Normal circle and border also)");
			rc.draw();
		}
		else if(s.equalsIgnoreCase("rectangle")) {
			Shape1 r = new Rectangle1();
			Shape1 rr = new RedShapeDecorater(new Rectangle1());
			System.out.println("Normal Rectangle(without any border) ");
			r.draw();
			System.out.println();
			System.out.println("Rectangle with border(Normal Rectangle and border also)");
			rr.draw();
		} else {
			System.out.println("NULL \nThe shape you entered is invalid!!!");
		}

	}

}
