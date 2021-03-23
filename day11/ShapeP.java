package kr.ac.kpop.hw.day11;
import java.util.Random;

public abstract class ShapeP {
	
	public abstract void print();
	
	public int get_num() {
		
		Random r = new Random();
		int num = r.nextInt(10) + 2;
		return num;
		
	}
	
}
