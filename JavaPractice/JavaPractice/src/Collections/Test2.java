package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		//Iterator
		Iterator<Integer> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Arraylist
		//for(int i = 0 ; i < a1.size(); i++) {
			//System.out.println(a1.get(i));
		}
		
		//System.out.println(a1);
	//}




}
