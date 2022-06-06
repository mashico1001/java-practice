package java_33;

// Thred

//class MyRunnable implements Runnable {
//	@Override
//	public void run() {
//		for (int i = 0; i < 500; i++) {
//			System.out.print('*');
//		}
//	}
//}

public class Java_33 {
	
	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
	
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 500; i++) {
//					System.out.print('*');
//				}
//			}
//		}).start();
//		
		// ラムダ式
		// （引数）-> {処理}
		
		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				System.out.print('*');
			}
		}).start();
		
		
		for (int i = 0; i < 500; i++) {
			System.out.print('.');
		}
	}

}
