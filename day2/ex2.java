package kr.ac.kopo.day02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력 : ");
		
		int num = sc.nextInt();
		
		final double pi = 3.14159;
		
		System.out.printf("반지름이 %d일때, 원둘레는 %f이고, 원넓이는 %f이다."
				, num, 2 * num * pi , num * num * pi);
	}

}
