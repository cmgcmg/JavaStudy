package kr.ac.kopos.day6;

import java.util.Scanner;

public class Ex1 {

   public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);
	   
	   System.out.printf("���̽�ũ�� � �����Ҳ���? : ");
	   int cnt = sc.nextInt();
	   Ice[] info = new Ice[cnt];
	   
	   for(int i = 0; i < cnt; i++) {
		   info[i] = new Ice();
	   }
	   
	   sc.nextLine();
	   
	   for(int i = 0; i < cnt; i++) {
		   
		   System.out.printf("*** %d��° ���̽�ũ�� �������� �Է� ***\n", i + 1);
		   System.out.printf("���̽�ũ���� : ");
		   info[i].name = sc.nextLine();
		   
		   System.out.printf("���̽�ũ������ : ");
		   int price = sc.nextInt();
		   info[i].price = price; 
		   
		   sc.nextLine(); //Delete buffer
		   
	   }
	   
	   System.out.printf("< �� %d���� ���̽�ũ�� �������� ��� >\n", cnt);
	   System.out.printf("��ȣ\t���̽�ũ����\t���̽�ũ������\n");
	   
	   int total = 0;
	   
	   for(int i = 0; i < cnt; i++) {
		   System.out.printf("%d\t%s\t\t%d\n", i + 1, info[i].name, info[i].price);
		   total += info[i].price;
	   }
	   
	   System.out.printf("�Ѱ� : %d\n", total);
	   
   }
}


public class Ice {
	String name;
	int price;
}