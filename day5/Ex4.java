public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] arr = new boolean[101];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = false;
		}
		
		//0, 1 Á¦¿Ü
		for(int i = 2; i <= 10; i++) {
			
			if(arr[i] == false) {
				for(int j = i + i; j < arr.length; j = j + i) {
					arr[j] = true;
				}
			}
			
		}
		
		int line = 0;
		
		for(int i = 2; i <= arr.length - 1; i++) {
			if(arr[i] == false) {
				System.out.printf("%d ", i);
				line++;
				if(line == 5) {
					line = 0;
					System.out.println();
				}
			}
		}
		
			
	}

}
