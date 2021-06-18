public class Sphere extends Shape{
	private double radius,pi=3.1416;
	
	public Sphere(String name, double radius){
		super(name);
		this.radius = radius;
	}
	
	public double getArea(){
		return 4*pi*radius*radius;
	}
	
	public void print(){
		super.print();
		System.out.println("Area : "+this.getArea());
	}
}