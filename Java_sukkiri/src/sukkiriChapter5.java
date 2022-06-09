
public class sukkiriChapter5 {
//	public static void incArray(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			array[i]++;
//		}
//	}
	
	// 5-1
//	public static void introduceOneself() {
//		String name = "you";
//		int age = 24;
//		double height = 154.5;
//		char zodiac = '酉';
//		
//		System.out.println("私の名前は" + name + "です" + age + "歳で、身長は" + height + "cmで干支は" + zodiac + "です");
//	}
	
	// 5-2
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//	
//	// 5-3 5-2のコードにオーバーライド
//	public static void email(String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：無題");
//		System.out.println("本文：" + text);
//	}
//	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

//	
	public static void main(String[] args) {
//		int[] array = {1, 2, 3};
//		incArray(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
		
		// 5-1
//		introduceOneself();
		
//		// 5-2 表示の際に引数を利用する
//		String title = "hello!";
//		String address = "aaa@test.com";
//		String text = "How are you?";
//		
//		email(title, address, text);
		
//		// 5-3
//		String address = "aaa@test.com";
//		String text = "How are you? I am so good!";
//		
//		email(address, text);
		
		// 5-4
		double calcTriangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + calcTriangleArea + "㎤です");
		
		double calcCircleArea = calcCircleArea(5.0);
		System.out.println("円の面積は" + calcCircleArea + "㎤です");
	}

}
