package java_36;

public class Java_36 {
	
	public static void main(String[] args) {
		
		int score = 50;
		double height = 165.8;
		String name = "taguchi";
		
		System.out.printf("name ; %s, score: %d, height: %f", name, score, height);
		
		String s = String.format("name: %10s, score %-10d, height: %5.2f", name, score, height);
		System.out.println(s);
	}

}
