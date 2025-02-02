package Java;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); // array list allows duplicate elements not like 'Set'
		al.add(50); 		// add method adds new eleement into arraylist
		al.add(1, 30);		// add method adds element at particular index 
		al.add(20);
		al.add(40);
		al.add(4,50);
		al.add(5,60);
		System.out.println(al.size());		// to print the size of arrayList
		System.out.println(al.contains(50));		// to check whether the given element present in arrayList or not
		al.remove(1);				// to remove the element from ArrayList
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
