package javaChapter10;

import javaChapter8.Hero;

public class PoisonMatango extends Matango {
	int attackCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		
		if (this.attackCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int poisonDamage = h.hp / 5;
			h.hp -= poisonDamage;
			System.out.println(poisonDamage + "ポイントのダメージ！");
			this.attackCount--;
			
		}
	}
}
