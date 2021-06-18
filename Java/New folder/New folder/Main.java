public class Main{
	public static void main(String args[]){
		
		Shape s1 = new Rectangle("Red",2,2);
		Shape s2 = new Triangle("Blue",3,3);
		
        System.out.println(s1.toString());
        System.out.println(s1.getArea());
		
		System.out.println(s2.toString());
        System.out.println(s2.getArea());
	}
}