package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<>(Collections.nCopies(10, 0));
		
		// add
		
				al.add(1);
				al.add(100);
				// add at specific index
				al.add(1, 200);
				al.add(0, 500);
				// add a List to collection
				al.addAll(Collections.nCopies(10, 0));
				// add a List at specific indext to collection
				al.addAll(0, Collections.nCopies(10, 1));
				
		
		// remove
		
				// remove element at particular index;
				al.remove(0);
				// remove Object
			
				Integer k = 500;
				al.remove(k);
				// remove a collection
				al.removeAll(Collections.nCopies(10, 0));
		
		
		// set
		
				// to update element at specific index
				al.set(0, 900);
		//size
				System.out.println(al.size());
				
		//contains
				//to know a object is exit or not
				System.out.println(al.contains(900));
			
				//to check a collection is exist or not
				System.out.println(al.containsAll(Collections.nCopies(10, 1)));	;
		//sort
					Collections.sort(al);
					System.out.println(al);
		//clear
					al.clear();
				
				System.out.println(al);
				System.out.println(al1);
		

	}

}
