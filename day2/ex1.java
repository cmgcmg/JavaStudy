package kr.ac.kopo.day02;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
	
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		
		//division by zero
		if(num2 != 0) {
			System.out.println("" + num1 + " / " + num2 + " = " + String.format("%.2f", (double)num1 / num2));
			System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		}
		
	}

}
