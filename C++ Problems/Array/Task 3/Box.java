public class Box{
	private double length;
	private double width;
	private double height;
	
	Box(){
	}
	
	Box(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public double getArea(){
		return length*height*width;
	}
}