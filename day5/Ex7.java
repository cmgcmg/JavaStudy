import java.util.Random;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		int ans = 0;
		
		int start = 100;
		int end = 1;
		int com = 0;
		int user = 0;

		while(true) {
			
			if(cnt == 0) {
				com = r.nextInt(100) + 1;
				System.out.printf("사용자가 생각하는 숫자가 [%d]입니까?(맞으면 0, 작은수면 1, 큰수면 2) ==> ", com);
				user = sc.nextInt();
				cnt++;
			}
			
			else {
				System.out.printf("사용자가 생각하는 숫자가 [%d]입니까?(맞으면 0, 작은수면 1, 큰수면 2) ==> ", com);
				user = sc.nextInt();
			}
			
			if(user == 0) break;
				
			if(user == 2) {
				
				end = com;
				com = (start + end) / 2;

			}
			
			else {
				start = com;
				com = (start + end) / 2;
			}
			
		}
		
	}

}
