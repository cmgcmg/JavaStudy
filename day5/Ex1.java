import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		int ans[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		while(cnt < 5) {
			
			System.out.printf("%d's 정수 : ", cnt);
			
			int num = sc.nextInt();
			
			if(num < 0 || num > 99) {
				
				System.out.println("0-99사이의 정수만 입력하세요");
				continue;
			}
			
			
			ans[cnt] = num;
			cnt++;
			
		}
		
		System.out.println("< PRINT >");
		
		for(int i = 0; i < ans.length; i++) {
			System.out.printf("%d ", ans[i]);
		}
		
		
	}

}
