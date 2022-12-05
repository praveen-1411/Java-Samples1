package Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class Test1 {
	
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Alex");
		a1.add("Alen");
		a1.add("Bob");
		a1.add("Clement");
		a1.add("John------");
		
		//Iterator
		Iterator<String> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Arraylist
		for(int i = 0 ; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println(a1);
	}

}
