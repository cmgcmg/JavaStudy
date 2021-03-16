package kr.ac.kopos.day6;

import java.util.Scanner;

public class Ex1 {

   public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);
	   
	   System.out.printf("아이스크림 몇개 구입할꺼야? : ");
	   int cnt = sc.nextInt();
	   Ice[] info = new Ice[cnt];
	   
	   for(int i = 0; i < cnt; i++) {
		   info[i] = new Ice();
	   }
	   
	   sc.nextLine();
	   
	   for(int i = 0; i < cnt; i++) {
		   
		   System.out.printf("*** %d번째 아이스크림 구매정보 입력 ***\n", i + 1);
		   System.out.printf("아이스크림명 : ");
		   info[i].name = sc.nextLine();
		   
		   System.out.printf("아이스크림가격 : ");
		   int price = sc.nextInt();
		   info[i].price = price; 
		   
		   sc.nextLine(); //Delete buffer
		   
	   }
	   
	   System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", cnt);
	   System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
	   
	   int total = 0;
	   
	   for(int i = 0; i < cnt; i++) {
		   System.out.printf("%d\t%s\t\t%d\n", i + 1, info[i].name, info[i].price);
		   total += info[i].price;
	   }
	   
	   System.out.printf("총계 : %d\n", total);
	   
   }
}


public class Ice {
	String name;
	int price;
}