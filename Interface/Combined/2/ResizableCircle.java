public class ResizableCircle extends Circle implements IResizable{
	private int percent;
	
	public ResizableCircle(double radius){
		super(radius);
	}
	
	public int resize(int percent){
		return percent;
	}
}