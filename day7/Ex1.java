package kr.ac.kopo.day7;

import java.util.Scanner;

main() {
	
	
	
	
	
}

public class Info {
	
	Scanner sc = new Scanner(System.in);
	int total; // total_count ( length )
	String[] total_info; // name + price info array
	int cnt = 0;
	
	//total info, total cnt(length) initialization
	void init() {
		cnt = 0;
		
		total_info = new String[total]; 
		
	}
	
	//total process
	void info() {
		
		getNum();
		init();
		
		for(int i = 0; i < total; i++) {
			
			setInfo(i + 1);
		}
		
		print();
		
		
	}
	//input total count (user input)
	void getNum() {
		
		System.out.printf("아이스크림 몇개 구입할래? ");
		
		total = sc.nextInt();
		
		sc.nextLine();
		
	}
	//store info
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
	//print total info
	void print() {
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", total);
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		for(int i = 0; i < total; i++) {
			System.out.println(i + 1 + "\t" + "\t\t" + total_info[i]);
		}
		
	}
	
	
}
