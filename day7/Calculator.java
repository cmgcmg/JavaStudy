package kr.ac.kopo.day7;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	void cal() {
		
		int num1 = input();
		int num2 = input();
		cal(num1, num2);
		prime(num1, num2);
		
	}
	
	int input() {
		System.out.printf("정수 : ");
		int num = sc.nextInt();
		sc.nextLine(); // delete buffer
		return num;
	}
	
	void cal(int num1, int num2) {
		
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		
	}
	
	void prime(int num1, int num2) {
	
		boolean check = true;
		
		for(int i = 2; i < num1; i++) {
			
			if(num1 % i == 0) check = false;
			
		}
		
		System.out.printf("%d 소수체크 : %b\n", num1, check);
		
		check = true;
		
		for(int i = 2; i < num2; i++) {
			
			if(num2 % i == 0) check = false;
			
		}
		
		System.out.printf("%d 소수체크 : %b\n",num2,  check);
		
	}
	

}
