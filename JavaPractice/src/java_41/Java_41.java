package java_41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_41 {
	
	public static void main(String[] args) {
		//Stream
		List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
//		for (Integer sale : sales) {
//			System.out.println(sale);
//		}
		
		sales
			.stream()
			.filter(e -> e % 3 == 0)
			.map(e -> "(" + e + ")")
			.forEach(System.out::println);
	}

}
