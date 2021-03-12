package day4;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10개 정수를 입력해주세요 : ");
		
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int total = 0;
		
		for(int i = 0; i < 10; i ++) {
			if(arr[i] % 2 == 0) {
				total = total + arr[i];
				System.out.printf("%d ", arr[i]);
			}
		}
		
		System.out.printf("짝수의 총합 : %d\n", total);
		
		total = 0;
		
		for(int i = 0; i < 10; i ++) {
			if(arr[i] % 2 != 0) {
				total = total + arr[i];
				System.out.printf("%d ", arr[i]);
			}
		}
		
		System.out.printf("홀수의 총합 : %d\n", total);
	}

}
