package Java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("India");			// adds the element in linked list
		ll.add("Japan");
		ll.add("Pakistan");
		ll.addFirst("Russia"); 		// adds the element in linkedlist ate first
		ll.addLast("saudi");		// adds the linked list at last
		System.out.println(ll);
		ll.remove(3);		// used to remove the elements at particular index
		ll.clear(); 		// it clears every element in the linked list
		ll.add("India"); 
		ll.contains("India"); 		// checks whether the particular object is present in linkedlist or not. If it contains returns yes else return no
		
		Iterator it = ll.iterator();		// used to iterate through linked list and print the linkedlist objects
		while(it.hasNext()) {		// checks whether it has next element or not
			System.out.println(it.next());		// prints the elemnent in linkedlist
		}

	}

}
