package javaChapter11;

public abstract class Asset {
	String name;
	int price;
	
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public int getPrice(int price) {
		return this.price;
	}

}
