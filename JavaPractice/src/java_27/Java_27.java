package java_27;

// 抽象クラス　->　具象クラス

abstract class User {
	public abstract void sayHi();
}

class JapaneseUser extends User {
	@Override
	public void sayHi() {
		System.out.println("こんにちは！");
	}
}

class AmericanUser extends User {
	@Override
	public void sayHi() {
		System.out.println("Hi!");
	}
}

public class Java_27 {
	
	public static void main(String[] args) {
		AmericanUser tom = new AmericanUser();
		JapaneseUser aki = new JapaneseUser();
		tom.sayHi();
		aki.sayHi();
	}

}
