package kr.ac.kpop.hw.day11;

public class Square extends ShapeP{
	
	@Override
    public void print(){
		
		int w = get_num();
		
		System.out.println("가로 " + w + "의 정사각형 면적은 " + (w*w) + "입니다");
        
	}
	
}
