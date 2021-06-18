public class Main{
	public static void main(String args[]){
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		
		//r1.showArea();
		
		r1.setDimension(2,3);
		r2.setDimension(3,3);
		r3.setDimension(4,3);
		
		r1.showArea();
		r2.showArea();
		r3.showArea();
		
		System.out.println("The Area of R1: " +r1.getArea());
	}
}
		
		