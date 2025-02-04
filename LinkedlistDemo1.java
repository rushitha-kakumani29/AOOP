package Java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistDemo1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int choice = 0,pos,ele;
		while(choice < 4) {
			System.out.println("Linked list operations are: ");
			System.out.println("1. Add elements \n2. Remove element \n3. Update element \n4. exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element");
				ele = sc.nextInt();
				System.out.println("Enter position");
				pos = sc.nextInt();
				ll.add(pos - 1, ele);
				break;
				
			case 2:
				System.out.println("You want to delete element at position or element. Enter your choice: ");
				String c = sc.next();
				if(c.equalsIgnoreCase("Position")) {
					System.out.println("Enter at which posotion you want to delete: ");
					pos = sc.nextInt();
					ll.remove(pos - 1);
				} else if(c.equalsIgnoreCase("Element")) {
					System.out.println("Enter the element you want to delete: ");
					ele = sc.nextInt();
					ll.remove(ele);
				}
				break;
				
			case 3:
				System.out.println("Enter position: ");
				pos = sc.nextInt();
				System.out.println("Enter new element");
				ele = sc.nextInt();
				ll.set(pos - 1, ele);
				break;
				
			default: return;
			}
			System.out.println(ll);
			System.out.println("------------------------------");
			Iterator it = ll.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
	}
}
