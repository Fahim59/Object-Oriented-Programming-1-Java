public class Triangle{
	private double height;
	private double base;
	private double area;
	
	public void setHeight(double height){
	this.height=height;}
	
	public void setBase(double base){
	this.base=base;}
	
	public double getHeight(){
	return this.height;}
	
	public double getBase(){
	return this.base;}
	
	public double getArea(){
	return 0.5*height*base;}
	
	Triangle(){
	}
	
	Triangle(double height,double base){
		this.height=height;
		this.base=base;
	}
	
	public void viewResult(){
		System.out.println("Triangle Area=" +0.5*height*base);
	}
}