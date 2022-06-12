package javaChapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date now = new Date();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("今日は" + day + "日です");
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		System.out.println(f.format(future));
	}

}
