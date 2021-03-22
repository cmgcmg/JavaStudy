import java.util.Random;

public class Shape {

	String name;
	private int w; // 반지름 or 직사각형 밑변
	private int h;
	private int ans;
	
	public Shape() {
		this.w = 0;
		this.h = 0;
		this.ans = 0;
	}
	
	
	public void set_Shape(String name, int w) {
		
		this.name = name;
		this.w = w;
	}
	
	public void set_Shape(String name, int w, int h) {
		
		this.name = name;
		this.w = w;
		this.h = h;
		
	}
	
	public int get_num() {
		
		Random r = new Random();
		int a = r.nextInt(10) + 2;
		return a;
		
	}
	
	public int get_w() {
		return w;
	}
	
	public int get_h() {
		return h;
	}
	
	
	public void set_ans(int ans) {
		this.ans = ans;
	}
	
	public void area_Print() {
		
		if("원".equals(this.name)) System.out.print("반지름 "+ this.w);
		
		else if("정사각형".equals(this.name)) System.out.print("가로 "+ this.w);
		
		else System.out.print("가로 " + this.w + ", 세로 " + this.h);
		
        System.out.println("의 " + name + " 면적은 " + ans +" 입니다.");
        
		
	}
	
	
	
}
