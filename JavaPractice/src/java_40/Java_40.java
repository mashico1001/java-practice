package java_40;

import java.util.HashMap;
import java.util.Map;

public class Java_40 {
	
	public static void main(String[] args) {
		// HashMap: key value
		// TreeMap
		// LinkedHashMap
		
//		HashMap<String, Integer> sales = new HashMap<>();
		Map<String, Integer> sales = new HashMap<>();
		
		sales.put("tom", 10);
		sales.put("bob", 20);
		sales.put("steve", 30);
		
		System.out.println(sales.get("tom"));
		System.out.println(sales.size());
		
		for (Map.Entry<String, Integer> sale : sales.entrySet()) {
			System.out.println(sale.getKey() + ":" + sale.getValue());
		}
		
		sales.put("tom", 100);
		sales.remove("steve");
		
		for (Map.Entry<String, Integer> sale : sales.entrySet()) {
			System.out.println(sale.getKey() + ":" + sale.getValue());
		}
	}

}
