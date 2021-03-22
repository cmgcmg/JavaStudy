
public class Rectangle extends Shape{
	
	
	public Rectangle() {
		
		super();
		
		set_Shape("직사각형", super.get_num(), super.get_num());
		
		
	}
	
	@Override
    public void area_Print(){
		
        set_ans(get_w() * get_h());
        super.area_Print();
        
    }
	
}
