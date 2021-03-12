package day4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int line = 0;
		int check = 0;
		
		for(int i = 2; i <= 100; i++) {
			
			check = 0;
			
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) check++;
			} 
			
			if(check == 0) {
				System.out.printf("%d ", i);
				line++;
				if(line == 5) {
					System.out.println();
					line = 0;
				}
			}
			
		}
	}

}
