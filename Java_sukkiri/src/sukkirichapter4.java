
public class sukkirichapter4 {
	public static void main(String[] args) {
//		int[] point = new int[4];
//		double[] weight = new double[5];
//		boolean[] answers = new boolean[3];
//		String[] names = new String[3];
//		
//		int[] moneyList = {121902, 8302, 55100};
//		
//		for (int i = 0; i < moneyList.length; i++) {
//			System.out.println(moneyList[i]);
//			
//		}
//		
//		for (int list : moneyList) {
//			System.out.println(list);
//		}
		
		int[] numbers = {3, 4, 9};
		
		System.out.println("１桁の数字を入力してください。");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == input) {
//				System.out.println("あたり");
//			}
//		}
		
		for (int n : numbers) {
			if (n == input) {
				System.out.println("あたり");
			}
		}
	}

}
