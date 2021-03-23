package kr.ac.kpop.hw.day11;

public class Rectangle extends ShapeP{
	
	
	@Override
    public void print(){
		
		int w = get_num();
		int h = get_num();
		
		System.out.println("가로 " + w + "세로 " + h + "의 직사각형 면적은 " + (w * h) + "입니다");
        
    }
	
}
