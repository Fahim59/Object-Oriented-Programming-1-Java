public class Circle{
	private double radius;
	double circumference,area;
	
	Circle(){
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public void circumference(){
		double PI=3.1416;
		circumference=2*PI*radius;
		System.out.println("Circumference: " +circumference);
	}
	
	public void area(){
		double PI=3.1416;
		area=PI*radius*radius;
		System.out.println("\nArea: " +area);
	}
}
	