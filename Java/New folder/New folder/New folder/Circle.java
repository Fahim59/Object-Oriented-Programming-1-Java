public class Circle implements MyShape{
	private double radius, pi=3.1416;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void Area(){
		double area = pi* radius* radius;
		System.out.println(area);
	}
	
	public void BoundaryLength(){
		double boundaryLength = 2*radius*pi;
		System.out.println(boundaryLength);
	}
}