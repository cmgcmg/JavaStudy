package kr.ac.kopo.day02;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫번째 정수를 입력 : ");
			
			int num1 = sc.nextInt();		

			System.out.print("두번째 정수를 입력 : ");
			
			int num2 = sc.nextInt();
			
			//division by zero
			boolean ans = (num2 == 0) ? false : num1 % num2 == 0 ? true : false;
			
			System.out.printf("%d가 %d의 배수인지 판단결과 : %b\n", num1, num2, ans);
			
			if(ans == true) System.out.printf("%d가 %d의 배수인지 판단결과 : 참\n", num1, num2);
			
			else System.out.printf("%d가 %d의 배수인지 판단결과 : 거짓\n", num1, num2);
			
		}
		
	}

}
