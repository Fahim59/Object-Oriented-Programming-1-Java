public class Cylinder extends Shape{
	private double radius,height, pi=3.1416;
	
	public Cylinder(String name, double radius, double height){
		super(name);
		this.radius = radius;
		this.height = height;
	}
	
	public double getArea(){
		return (2*pi*radius*height + 2*pi*radius*height);
	}
	public void print(){
		super.print();
		System.out.println("Area : "+this.getArea());
	}
}