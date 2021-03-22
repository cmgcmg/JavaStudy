import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			Rectangle r = new Rectangle();
			r.area_Print();
			break;
		case 2:
			Square s = new Square();
			s.area_Print();
			break;
		case 3:
			Triangle t = new Triangle();
			t.area_Print();
			break;
		case 4:
			Circle c = new Circle();
			c.area_Print();
			break;
		
		}
		
	}

}
