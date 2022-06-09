package javaChapter8;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！ MPを5消費した");
		this.mp -= 5;
		System.out.println("HPを全回復した");
		this.hp = MAXHP;
	}
	
	public void pray(int sec) {
		System.out.println("勇者は、祈るを使った！");
		int r = new java.util.Random().nextInt(3);
		int recovery = sec + r;
		
		if (this.mp + recovery < MAXMP) {
			this.mp += recovery;
			System.out.println("MPが" + recovery + "ポイント回復した！");
		} else {
			this.mp = MAXMP;
			System.out.println("MPが全回復した！");
		}
		
	}

}
