package class_practice;

class User {
	String name;
	
	User(String name) {
		this.name = name;
	}
	
	void sayHi() {
		System.out.println("hi!" + this.name);
	}
}

class AdminUser extends User {
	AdminUser(String name) {
		super(name);
	}
	
	void sayHello() {
		System.out.println("hello!" + this.name);
	}
	
	@Override
	void sayHi() {
		System.out.println("[admin] hi!" + this.name);
	}
}

public class Java_20 {
	public static void main(String[] args) {
		User tom = new User("Tom");
		System.out.println(tom.name);
		tom.sayHi();
		
		AdminUser bob = new AdminUser("bob");
		System.out.println(bob.name);
		bob.sayHi();
		bob.sayHello();
	}

}
