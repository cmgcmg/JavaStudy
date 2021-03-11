package kr.ac.kopo.day3;

/**
 * Assignment #5
 * @author cmg
 *
**/
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0, j = 0, t = 0; i < 9; i++) {
			
			for(int x = 0; x < t; x++) {
				System.out.print(" ");
			}
			
			for(int k = j + 5; k > 0; k--) {
				System.out.print("*");
			}
			
			if(i < 4) {
				j--;
				t++;
			}
			
			else {
				j++;
				t--;
				
			}
			
			System.out.println();
			
		}
		
	}

}
