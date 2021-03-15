import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 5;
		int start = 0;
		int end = 100;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ans = r.nextInt(100) + 1;
		
		while(cnt > 0) {
			
			System.out.printf("%d - %d : ", start, end);
			int input = sc.nextInt();
			
			if(cnt == 5) {
				
				if(input == ans) {
					System.out.print("축하합니다. 정답입니다.\n");
					return;
				}
				
				else {
					if(ans < input) {
						System.out.printf("%d보다 작은수 입니다.\n", input);
						end = input;
					}
					
					else {
						System.out.printf("%d보다 큰수 입니다.\n", input);
						start = input;
					}
					
					cnt--;
					System.out.printf("기회는 %d번 남았습니다.\n", cnt);
				}
				
			}
			
			else {
				System.out.printf("%d - %d : ", start, end);
				
				if(input == ans) {
					System.out.print("축하합니다. 정답입니다.\n");
					return;
				}
				
				
				if(input == ans) {
					System.out.print("축하합니다. 정답입니다.\n");
					return;
				}
				
				else {
					if(ans < input) {
						System.out.printf("%d보다 작은수 입니다.\n", input);
						end = input;
					}
					
					else {
						System.out.printf("%d보다 큰수 입니다.\n", input);
						start = input;
					}
					
					cnt--;
					System.out.printf("기회는 %d번 남았습니다.\n", cnt);
				}
				
			}
			
			System.out.println();
			
		}
		
		System.out.printf("아쉽습니다.. 기회를 다 소진하셨습니다.\n정답은 %d입니다.", ans);
		
	}

}
