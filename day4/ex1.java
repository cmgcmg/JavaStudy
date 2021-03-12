package day4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3개 정수를 입력해주세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			
			if(num2 > num3) System.out.printf("%d %d %d\n", num1, num2, num3);
			
			else System.out.printf("%d %d %d\n", num1, num3, num2);
			
		}
		
		else if((num2 > num1) && (num2 > num3)) {
			
			if(num1 > num3) System.out.printf("%d %d %d\n", num2, num1, num3);
			
			else System.out.printf("%d %d %d\n", num2, num3, num1);
			
		}
		
		else {
			if(num1 > num2) System.out.printf("%d %d %d\n", num3, num1, num2);
			
			else System.out.printf("%d %d %d\n", num3, num2, num1);
		}
		
		
		
	}

}