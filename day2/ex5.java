package kr.ac.kopo.day3;

/**
 * Assignment #4
 * @author cmg
 *
 */
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 0, j = 0; i < 9; i++) {
			
			for(int k = 0; k < j + 1; k++) {
				System.out.print("*");
			}
			
			if(i < 4) j++;
			
			else j--;
			
			System.out.println();
			
		}
	}

}
