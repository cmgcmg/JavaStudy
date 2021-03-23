package kr.ac.kpop.hw.day11;

public class Triangle extends ShapeP{
	                     
	@Override                      
    public void print(){           
		                           
       int w = get_num();          
       int h = get_num();          
      
        System.out.println("밑변 " + w + "높이 " + h + "의 삼각형 면적은 " + (w * h) / 2 + "입니다");
        
    }
	
}
