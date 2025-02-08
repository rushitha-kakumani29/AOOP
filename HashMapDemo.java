package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Long> hm = new HashMap<>();
		String str,name;
		long phno;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Phone entries \n2. Get phone number \n3. Display keys \n4.exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the name: ");
				name = sc.next();
				System.out.println("Enter the phone number: ");
				phno = sc.nextLong();
				hm.put(name,phno);
				break;
			case 2:
				System.out.println("Enter name: ");
				name = sc.next();
				phno = hm.get(name);
				System.out.println("Phone Number is: "+phno);
				System.out.println("----------------------------------");
				break;
			case 3: 
				Set<String> s = new HashSet();
				s = hm.keySet();
				System.out.println(s);
				break;
			case 4: return;
			
			}
		}

	}

}
