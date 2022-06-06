package java_24;

class User {
	private String name;
	private int score;
	
	public User(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		if (score > 0) {
			this.score = score;
		}
	}
}

public class Java_24 {
	
	public static void main(String[] args) {
		User tom = new User("tom", 65);
		tom.setScore(85);
		tom.setScore(-22);
		System.out.println(tom.getScore() + tom.getName());
	}

}
