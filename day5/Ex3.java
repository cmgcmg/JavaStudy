public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = false;
		int arr[] = new int[100];
		int cnt = 0;
		arr[cnt] = 2;
		
		for(int i = 3; i <= 100; i++) {
			
			for(int j = 0; j < cnt; j++) {
				if(i % arr[j] == 0) {
					check = true;
					break;
				}
			}
			
			if(check == false) {
				cnt++;
				arr[cnt] = i;
			}
			
			check = false;
			
		}
		
		for(int i = 0; i <= cnt; i++) {
			
			System.out.printf("%d ", arr[i]);
			
		}
		
		System.out.println();
		

		
	}

}
