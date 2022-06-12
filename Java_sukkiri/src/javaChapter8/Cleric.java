package javaChapter8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	static final int MAXHP = 50;
	static final int MAXMP = 10;
	
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！ MPを5消費した");
		this.mp -= 5;
		System.out.println("HPを全回復した");
		this.hp = MAXHP;
	}
	
	// 処理はうまくいくけど、戻り値を返してないからダメ。
	
//	public void pray(int sec) {
//		System.out.println("勇者は、祈るを使った！");
//		int r = new java.util.Random().nextInt(3);
//		int recovery = sec + r;
//		
//		if (this.mp + recovery < MAXMP) {
//			this.mp += recovery;
//			System.out.println("MPが" + recovery + "ポイント回復した！");
//		} else {
//			this.mp = MAXMP;
//			System.out.println("MPが全回復した！");
//		}
//		
//	}
	
	public int pray(int sec) {
		System.out.println("勇者は、祈るを使った！");
//		int r = new java.util.Random().nextInt(3);
//		int recovery = sec + r;
		
		int recover = new Random().nextInt(3) + sec;
		
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
		
//		
	}

}
