package javaChapter17;

import java.io.IOException;

public class Exception {
	public static void main(String[] args) throws IOException {
		System.out.println("プログラムを起動しました");
		throw new IOException();
	}

}
