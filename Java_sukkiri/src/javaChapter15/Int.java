package javaChapter15;

public class Int {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		System.out.print(s);
		
		String[] words = s.split("[,]");
		
		for (String a : words) {
			System.out.println(a);
		}
		
	}

	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}
