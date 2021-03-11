package kr.ac.kopo.day3;

/**
 * Assignment #6
 * @author cmg
 *
**/

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0, j = 0, t = 4; i < 9; i++) {
			
			for(int x = 0; x < t; x++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (j + 1) * 2 - 1; k++) {
				System.out.print("*");
			}
			
			if(i < 4) {
				j++;
				t--;
			}
			
			else {
				j--;
				t++;
				
			}
			
			System.out.println();
			
		}
		
	}

}
