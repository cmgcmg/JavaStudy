package day4;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 0;
		
		int hour = 0;
		
		while(true) {
			
			hour++;
			
			start = start + 3;
			
			if(start < 50) start = start - 2;
			
			else start = start - 1;
			
			System.out.printf("%d시간 후 올라간 총 높이 : %d\n", hour, start);
			
			if(start >= 100) break;
		}
		
	}

}
