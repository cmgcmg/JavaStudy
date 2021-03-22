package day10;

import java.util.Scanner;

public class Manage extends Ice{
	
	Scanner sc = new Scanner(System.in);
	private String infoList[];
	
	Manage() { }
	
	public void info() {
		
		char ch = 'Y';
		
		while(ch == 'Y') {
			
			System.out.printf("아이스크림 몇개 구입할래 ? : ");
			int num = sc.nextInt();
			set_Count(num);
			infoList = new String[num];
			list_Initialization(num);
			sc.nextLine();
			
			if(num > 0) set_People();
			
			for(int i = 0; i < num; i++) {
				System.out.printf("%d 번\n", i + 1);
				String name;
				int price;
				
				System.out.printf("아이스크림 명 : ");
				name = sc.nextLine();

				System.out.printf("아이스크림 가격 : ");
				price = sc.nextInt();
				set_Total(price);
				sc.nextLine();
				
				set_Info(i, name, price);
			}
			
			System.out.println();
			System.out.printf("계속 구매할래 ? (Y/N) : ");
			ch = sc.next().charAt(0);
		}
		
		get_info();
	}
	
}
