package Java;

import java.util.ListIterator;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int a[] = {10,20,30,40,50,60};
		for(int i = 0;i < a.length;i++) {
			v.add(a[i]);
		}
		for(int i = 0;i < v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("forward direction: ");
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Backward direction:");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
