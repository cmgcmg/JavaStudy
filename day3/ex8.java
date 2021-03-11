package kr.ac.kopo.day3;

/**
 * Assignment #6
 * @author cmg
 *
**/


public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 5, j = 0; i > 0; i--) {
			
			for(int k = 0; k < j; k++) {
				System.out.print(" ");
			}
			
			for(int z = i * 2 - 1; z > 0; z--) {
				System.out.print("*");
			}
			
			j++
			
			System.out.println();
		}

	}

}
