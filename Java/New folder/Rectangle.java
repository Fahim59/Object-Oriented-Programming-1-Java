public class Rectangle extends Shape{
	private double length,width;
	
	public Rectangle(String name, double length, double width){
		super(name);
		this.length = length;
		this.width = width;
	}
	public double getArea(){
		return length * width;
	}
	
	public void print(){
		super.print();
		System.out.println("Area : "+this.getArea());
	}
}