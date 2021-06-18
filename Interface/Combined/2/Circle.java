public class Circle implements IGeometricObject{
	public double radius=1.0;
	
	public double pie=3.1416;
	public double result;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double getPerimeter(){
		return (2*pie*radius);
	}
	
	public double getArea(){
		return (pie*radius*radius);
	}
}