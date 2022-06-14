package javaChapter17;

public class Main {
	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外を発生しました");
			System.out.println("---- スタックトレースここから ----");
			e.printStackTrace();
			System.out.println("---- スタックトレースここまで ----");
			
		}
		
		
		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外が発生しました");
		}
		
		
	}

}
