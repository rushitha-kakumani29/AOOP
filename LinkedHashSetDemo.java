package Java;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();		// to take size of elements
		for(int i = 0;i < n;i++) {
			System.out.println("Enter element: ");
			lhs.add(sc.nextInt());		// add method adds the elements into the linkedHashSet
		}
		System.out.println(lhs);		// to print all the elements
		Iterator it = lhs.iterator();		// used to iterate through linkedHashSet for printing elements
		while(it.hasNext()) {		// to check wheather next element is present or not
			System.out.println(it.next());		// to print the element
		}
		System.out.println("The size of Linked Hash Set is: "+lhs.size());		// to print the size of linkedHashSet
	}
}
