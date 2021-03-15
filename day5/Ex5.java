import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		
		System.out.printf("3 - 20사이의 정수를 입력해주세요 : ");
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input >= 3 || input <= 20) break;
			
			System.out.println("3 - 20사이의 정수를 다시 입력해주세요.");
			
		}
		
		if(input % 2 == 0) input = input - 1;
		
		for(int i = 0; i < input; i++) {
			
			for(int j = input - i - 1; j > 0; j--) {
				System.out.printf(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < input; i++) {
			
			for(int j = i; j < (input / 2) + 1; j++) {
				System.out.print("*");
			}
			
			if(i >= (input / 2) + 1) {
				
				for(int j = i - (input / 2) + 1; j > 0; j--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int high = 3;
		
		for(int i = 0; i < input; i++) {
			
			if(i >= (input / 2) + 1) {
				
				for(int j = input - i - 1; j > 0; j--) {
					
					System.out.print(" ");
				}
				
				
				for(int j = 0; j < high; j++) {
					System.out.print("*");
				}
				
				high = high + 2;
				
			}
			else {
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				
				for(int j = input - (i * 2); j > 0; j--) {
					System.out.print("*");
				}	
			}
			
			System.out.println();
			
		}
		
		
	}
}
