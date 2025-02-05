package Java;

import java.util.Scanner;

interface Shape1{
	public void draw();
}
class Square1 implements Shape1{
	public void draw() {
		System.out.println("Inside Square class draw method");
	}
}
class Rectangle1 implements Shape1{
	public void draw() {
		System.out.println("Inside Rectangle class draw method");
	}
}
class RoundedSquare implements Shape1{
	public void draw() {
		System.out.println("Inside RoundedSquare class draw method");
	}
}
class RoundedRectangle implements Shape1{
	public void draw() {
		System.out.println("Inside RoundedRectangle class draw method");
	}
}
abstract class AbstractFactory{
	public abstract Shape1 getShape(String shapeType);
}
class ShapeFactory extends AbstractFactory{
	public Shape1 getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle1();
		} else {
			return new Rectangle1();
		}
		
	}
}
class RoundedShapeFactory extends AbstractFactory{
	public Shape1 getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RoundedRectangle")) {
			return new RoundedRectangle();
		} else {
			return new RoundedSquare();
		}
	}
}
class FactoryProducer{
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new ShapeFactory();
		} else {
			return new RoundedShapeFactory();
		}
	}
}
public class AbstractFactoryDesignPatternDemo {
	public static void main(String[] args) {
		
		AbstractFactory af = FactoryProducer.getFactory(false);
		
		Shape1 obj = af.getShape("Square");
		obj.draw();
		obj = af.getShape("Rectagle");
		obj.draw();
		AbstractFactory aff = FactoryProducer.getFactory(true);
		Shape1 obj1 = aff.getShape("Square");
		obj1.draw();
		obj1 = aff.getShape("REctangle");
		obj1.draw();
		

	}

}
