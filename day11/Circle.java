package kr.ac.kpop.hw.day11;
public class Circle extends ShapeP{

	@Override
    public void print(){
		
		int r = get_num();
		
		System.out.println("반지름 " + r + "의 원 면적은 " + (int)(Math.PI * r * r) + "입니다");
        
    }
	
}
