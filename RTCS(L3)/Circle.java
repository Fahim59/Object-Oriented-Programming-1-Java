public class Circle{
	private double radius;
	private double area;
	public double pi=3.1416;
	
	public void setRadius(double radius){
	this.radius=radius;}
	
	public double getRadius(){
	return this.radius;}
	
	public double getArea(){
	return pi*radius*radius;}
	
	public void viewResult(){
		System.out.println("Circle Area=" +pi*radius*radius);
	}
}