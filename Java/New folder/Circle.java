public class Circle extends Shape{
	double radius;
	
	public Circle(String name,double radius){
		super(name);
		this.radius=radius;
	}
	public double getArea(){
		return 3.1416 * radius * radius;
	}
	
	public void print(){
		super.print();
		System.out.println("Area : "+this.getArea());
	}
}