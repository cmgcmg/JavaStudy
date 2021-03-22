
public class Circle extends Shape{

	public Circle() {
		
		super();
		
		set_Shape("원", super.get_num());
		
		
	}
	
	@Override
    public void area_Print(){
		
		double num = get_w() * get_w() * Math.PI;
		set_ans((int)num);
        super.area_Print();
        
    }
	
}
