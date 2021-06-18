public class Square{
	private double side;
	private double area;
	
	public void setSide(double side){
	this.side=side;}
	
	public double getSide(){
	return this.side;}
	
	public double getArea(){
	return side*side;}
	
	public void viewResult(){
		System.out.println("Square Area=" +side*side);
	}
}