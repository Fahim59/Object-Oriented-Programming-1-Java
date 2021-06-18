public class Rectangle{
	private double length;
	private double width;
	private double area;
	
	public void setLength(double length){
	this.length=length;
	}
	
	public void setWidth(double width){
	this.width=width;
	}
	
	public double getLength(){
	return this.length;
	}
	
	public double getWidth(){
	return this.width;
	}
	
	public double getArea(){
	return length*width;
	}
	
	Rectangle(){
	}
	
	Rectangle(double length,double width){
		this.length=length;
	    this.width=width;
	}
	
	public void viewResult(){
		System.out.println("Rectangle Area=" +length*width);
	}
}