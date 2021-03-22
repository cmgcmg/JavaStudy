package day10;

public class Ice {

	private iceListArr[][] iceList;
	private int total_people;
	private int total_count;
	private int total_price;
	private int idx;
	
	public Ice() { 
		
		idx = -1; 
		iceList = new iceListArr[100][];
		total_people = 0;
		total_count = 0;
		total_price = 0;
		
	}
	
	
	public void list_Initialization(int num) {
		
		this.iceList[++idx] = new iceListArr [num];
		
		for(int i = 0; i < num; i++) {
			iceList[idx][i] = new iceListArr();
		}
		
	}
	
	public void set_Info(int num, String name , int price) {
		
		iceList[idx][num].set_Name(name);
		iceList[idx][num].set_Price(price);
		
	}
	
	public void get_info() {
		
		System.out.printf("총 %d명의 고객이 아이스크림을 구매했습니다.\n", total_people);
		System.out.printf("판매된 아이스크림 총 개수 : %d\n", total_count);
		System.out.printf("총 판매액 : %d\n", total_price);
		
	}

	public void set_Count(int num) {
		total_count += num;
		
	}
	
	public void set_People() {
		total_people++;
	}
	
	public void set_Total(int num) {
		total_price += num;
	}
	

}
