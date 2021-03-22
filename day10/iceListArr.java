package day10;

public class iceListArr extends Ice {

	private int price;
	private String name;
	
	public iceListArr() {
		this.price = 0;
		this.name = "";
	}
	
	public void set_Price(int price) {
		this.price = price;
	}
	
	public void set_Name(String name) {
		this.name = name;
	}
	
	public int get_Pirce() {
		return this.price;
	}
	
	public String get_Name() {
		return this.name;
	}
}
