package java_32;

// generics

//class MyInteger {
//	public void getThree(int x) {
//		System.out.println(x);
//		System.out.println(x);
//		System.out.println(x);
//	}
//}

class MyData<T> {
	public void getThree(T x) {
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
	}
}

public class Java_32 {
	
	public static void main(String[] args) {
//		MyInteger mi = new MyInteger();
//		mi.getThree(55);
		MyData<Integer> i = new MyData<>();
		i.getThree(32);
		MyData<String> s = new MyData<>();
		s.getThree("hello");
	}

}
