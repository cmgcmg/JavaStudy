import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("짝수 몇개 입력 : ");
		int num = sc.nextInt();
		int[] arr1 = new int[num];

		
		System.out.print("홀수 몇개 입력 : ");
		int num1 = sc.nextInt();
		int[] arr2 = new int[num1];
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		System.out.printf("%d %d\n", arr1.length, arr2.length);
		
		for(int i = 0; i < arr1.length + arr2.length; i++) {
			
			System.out.printf("num%d : ", i + 1);
			int input = sc.nextInt();
			
			if(input % 2 == 0) {
				
				arr1[cnt1] = input;
				cnt1++;
			}
			
			else {
				arr2[cnt2] = input;
				cnt2++;
			}
			
			
		}
		
		System.out.println("< PRINT >");
		
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d ", arr1[i]);
		}
		
		for(int j = 0; j < arr2.length; j++) {
			System.out.printf("%d ", arr2[j]);
		}
		
		System.out.println();
		
		
	}

}
