
public class sukkiri2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i * j);
//				System.out.print(" ");
//			}
//			
//			System.out.println("");
//		}
		
//		weight == 60;
//		(age1 + age2) * 2 >= 60;
//		age % 2 === 1;
//		name.equals("湊");
////		
//		int isHungry = 1;
//		String food = "peach";
//		
//		System.out.println("こんにちは");
//		
//		if (isHungry == 0) {
//			System.out.println("お腹がいっぱいです");
//		} else {
//			System.out.println("はらぺこです");
//			System.out.println(food + "をいただきます");
//		}
//		
//		System.out.println("ごちそうさまでした");
		
//		System.out.print("[メニュー] １：検索　２：登録　３：削除　４：変更>");
//		
//		int selected = new java.util.Scanner(System.in).nextInt();
//		
//		switch (selected) {
//		case 1:
//			System.out.println("検索します");
//			break;
//		case 2:
//			System.out.println("登録します");
//			break;
//		case 3:
//			System.out.println("削除します");
//			break;
//		case 4:
//			System.out.println("変更します");
//			break;
//		}
		
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("０～９の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if (num == ans) {
				System.out.println("あたり！");
				break;
			} else if (num != ans) {
				System.out.println("違います");
			}
			
		}
		
		System.out.println("ゲームを終了します");
	}

}
