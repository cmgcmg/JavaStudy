
public class Square extends Shape{

	public Square() {
		
		super();
		
		set_Shape("정사각형", super.get_num());
		
		
	}
	
	@Override
    public void area_Print(){
		
        set_ans(get_w() * get_w());
        super.area_Print();
        
    }


	
}
