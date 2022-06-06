package java_29;

// 列挙型

enum Result {
	SUCCESS,
	ERROR,
}

public class Java_29 {
	
	public static void main(String[] args) {
		Result res;
		
		res = Result.ERROR;
		
		switch (res) {
		case SUCCESS:
			System.out.println("OK!");
			System.out.println(res.ordinal());
			break;
		case ERROR:
			System.out.println("NG!");
			System.out.println(res.ordinal());
			break;
		}
	}

}
