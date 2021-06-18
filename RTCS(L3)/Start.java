public class Start{
	public static void main(String[]args){
		
		Rectangle r1=new Rectangle(3,5);    //parameterised cons present thats why it can be used
		r1.viewResult();
		
		Triangle t1=new Triangle(4,4);      //parameterised cons present thats why it can be used
		t1.viewResult();
		
		Circle c1=new Circle();            //no cons thats why setting value
		c1.setRadius(4);
		c1.viewResult();
		
		Square s1=new Square();           //no cons thats why setting value
		s1.setSide(4);
		t1.viewResult();
		
		System.out.println("Area of Rectangle " +r1.getArea());
	}
}