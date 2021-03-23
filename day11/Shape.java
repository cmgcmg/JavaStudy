package kr.ac.kpop.hw.day11;
import java.util.Random;
import java.util.Scanner;

public class Shape {
	
	public void choice() {
			
			int type = selectMenu();
			print(type);
			
	}
	
	public void print(int type) {
		
		ShapeP s = null;
		
		switch(type) {
		case 1:
			s = new Rectangle();
			break;
		case 2:
			s = new Square();
			break;
		case 3:
			s = new Triangle();
			break;
		case 4:
			s = new Circle();
			break;
		}
		
		if(s != null) s.print();
		
	}
	
	public int get_num() {
		
		Random r = new Random();
		int num = r.nextInt(10) + 2;
		return num;
		
	}

	public int selectMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
		int no = sc.nextInt();
		return no;
	}
	
	
	
}
