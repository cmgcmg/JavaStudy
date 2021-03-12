package day4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수를 입력해주세요 : ");
		
		int temp = sc.nextInt();
			
		int check = 0;
		
		for(int i = 2; i < temp; i++) {
			if(temp % i == 0) check++;
		}
		
		if(check == 0) System.out.printf("%d는 소수입니다.\n", temp);
		
		else System.out.printf("%d는 소수가 아닙니다.\n", temp);
		
		
	}

}
