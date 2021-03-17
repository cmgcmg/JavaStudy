package kr.ac.kopo.day7;

import java.util.Scanner;

public class Info {
	
	Scanner sc = new Scanner(System.in);
	int total;
	String[] total_info;
	int cnt;
	
	void init() {
		cnt = 0;
		
		total_info = new String[total];
		
	}
	
	void info() {
		
		getNum();
		init();
		
		for(int i = 0; i < total; i++) {
			setInfo(i + 1);
		}
		
		print();
		
		
	}
	
	void getNum() {
		
		System.out.printf("아이스크림 몇개 구입할래? ");
		
		total = sc.nextInt();
		
		sc.nextLine();
		
	}
	
	void setInfo(int num) {
		
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", num);
		System.out.printf("아이스크림명 : ");
		String name = sc.nextLine();
		System.out.printf("아이스크림가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		total_info[cnt] = name + '\t'+ Integer.toString(price);
		cnt++;
		
	}
	
	void print() {
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", total);
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		for(int i = 0; i < total; i++) {
			System.out.println(i + 1 + "\t" + "\t\t" + total_info[i]);
		}
		
	}
	
	
}
