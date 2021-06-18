public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height){
		super(color);
		this.base = base;
		this.height = height;
	}
	public double getArea(){
		//return (base * height)/2;
		return ((double)base * (double)height)/2;
	}
	
	public String toString(){
        return "Triangle [base=" + base + " height=" +height + " "+ super.toString() + "]";
	}
}