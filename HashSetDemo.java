package Java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
								// Hash set contains group of objects 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");		// add method adds the element into the hash set
		hs.add("China");
		hs.add("Japan");
		hs.add("Africa");
		hs.add("America");
		hs.add("India"); 		// Set does not enter duplicate values
		System.out.println("Hash set elements are:" + hs);
		System.out.println();
		Iterator<String> it = hs.iterator();  		 //Iterator is used to iterate through elements present in set 
		while(it.hasNext()) {		// checks whether the next element is present or not
			System.out.println(it.next()); 		// prints the lemenst 
		}

	}

}
