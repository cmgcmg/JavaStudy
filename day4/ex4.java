package day4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("������ �Է����ּ��� : ");
		
		int temp = sc.nextInt();
			
		int check = 0;
		
		for(int i = 2; i < temp; i++) {
			if(temp % i == 0) check++;
		}
		
		if(check == 0) System.out.printf("%d�� �Ҽ��Դϴ�.\n", temp);
		
		else System.out.printf("%d�� �Ҽ��� �ƴմϴ�.\n", temp);
		
		
	}

}
