public class Main{
	public static void main(String args[]){
		
		Box b1= new Box(2,3,4);
		Box b2= new Box(1,2,3);
		Box b3= new Box(2,2,5);
		
		System.out.println("\nThe Area of b1: " +b1.getArea());
		System.out.println("\nThe Area of b2: " +b2.getArea());
		System.out.println("\nThe Area of b3: " +b3.getArea());
	}
}