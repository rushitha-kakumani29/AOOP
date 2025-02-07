package Java;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	public Employee(int i,String n) {
		id = i;
		name = n;
	}
	void display() {
		System.out.println("Id is: "+id+"/t"+"name is"+name);
	}
}

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			arr[i] = new Employee(id,name);
		}
		System.out.println("The Employee is: ");
		for(int i=0;i<5;i++) {
			arr[i].display();
		}
	}
}
