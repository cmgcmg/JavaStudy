package day4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4�� ������ �Է����ּ��� : ");
		
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if(max < num) max = num;
		}
		
		System.out.printf("���� ū �� : %d\n", max);
		
	}

}
