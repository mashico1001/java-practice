package javaChapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		List<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);
		
		Iterator<Hero> it = heros.iterator();
		while (it.hasNext()) {
			Hero e = it.next();
			System.out.println(e.getName());
		}
		
		
		Map<Hero, Integer> killMonsters = new HashMap<Hero, Integer>();
		killMonsters.put(h1, 3);
		killMonsters.put(h2, 7);
		
		for (Hero key : killMonsters.keySet()) {
			int value = killMonsters.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}

}
