/*
*	write a java program to perform following actions on
*	Array list
*	1. insert (1, 34, 45, 11, 1001)
*	2. insert 45 at position 2
*	3. display the list
*	4. access the 3rd and 4th elements in the list
*	5. check whether the list contains element 11. 
*	6. check for the index of 1001 in the list 
*	6. sort the list
*/

import java.util.ArrayList;
import java.util.Comparator; 

public class Main {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(1); 
		numbers.add(34);
		numbers.add(45);
		numbers.add(11);
		numbers.add(1001); 
		
		System.out.println(numbers);
		
		System.out.println("Inserting 45 at pos = 2");
		numbers.add(1, 45); 
		System.out.println(numbers);
		
		System.out.println("Accessing element at pos 3"); 
		int x = numbers.get(2);
		System.out.println(x); 
		
		System.out.println("Accessing element at pos 4");
		System.out.println(numbers.get(3)); 
		
		
		System.out.println("Checking for 11 in the list"); 
		boolean check = numbers.contains(111); 
		System.out.println(check); 
		
		System.out.println(numbers.isEmpty()); 
		
		if(numbers.isEmpty() == false) {
			System.out.println(numbers.indexOf(1001)); 
      
		}
		
		numbers.sort(null);
		
		System.out.println(numbers); 
		
	}
}





