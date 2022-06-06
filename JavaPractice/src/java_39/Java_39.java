package java_39;

import java.util.HashSet;
import java.util.Set;

public class Java_39 {
	
	public static void main(String[] args) {
		//HachSet
		
//		HashSet<Integer> sales = new HashSet<>();
		Set<Integer> sales = new HashSet<>();
		
		sales.add(10);
		sales.add(20);
		sales.add(30);
		sales.add(10);
		
		System.out.println(sales.size());
		
		for (Integer sale : sales) {
			System.out.println(sale);
		}
		
		sales.remove(30);
		
		for (Integer sale : sales) {
			System.out.println(sale);
		}
	}

}
