public class Triangle implements MyShape{
	private double base;
	private double height;
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public void Area(){
		double area = base * height /2;
		System.out.println(area);
	}
	
	public void BoundaryLength(){
		double boundaryLength = (2*base)+ Math.sqrt(2*base*height);
		System.out.println(boundaryLength);
	}
}