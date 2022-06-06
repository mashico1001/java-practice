package java_24;

class User {
	protected String name;
	private static double VERSION = 1.1;
	
	
//	static {
//		User.count = 0;
//		System.out.println("Static initializer");
//	}
//	
//	{
//		System.out.println("Instance initializer");
//	}
	
	public User(String name) {
		this.name = name;
//		User.count++;
//		System.out.println("Constructor");
		User.VERSION = 1.2;
	}
	
//	public static void getInfo() {
//		System.out.println("# of instances: " + User.count);
//	}
//	
//	public String getName() {
//		return this.name;
//	}
	
//	public int getScore() {
//		return this.score;
//	}
//	
//	public void setScore(int score) {
//		if (score > 0) {
//			this.score = score;
//		}
//	}
	
	public void sayHi() {
		System.out.println("hi! " + this.name);
	}
}

class AdminUser extends User {
	public AdminUser(String name) {
		super(name);
	}
	
	@Override
	public void sayHi() {
		System.out.println("[admin]hi!" + this.name);
	}
}

public class Java_24 {
	
	public static void main(String[] args) {
//		User.getInfo();
		User tom = new User("tom");
//		User.getInfo();
//		User bob = new User("bob");
//		User.getInfo();
//		tom.setScore(85);
//		tom.setScore(-22);
//		System.out.println(tom.getScore() + tom.getName());
	}

}
