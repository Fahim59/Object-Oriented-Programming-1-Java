public class Rectangle{
	private double a;
	private double b;
	private double c;
	private double d;
	
	Rectangle(){
	}
	
	Rectangle(double a,double b,double c,double d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public void check(){
		if(a==b && a==c && a==d){
			System.out.println("\nThis is a Square");
		}
		else if(a==c && b==d){
			System.out.println("\nThis is a Rectangle");
		}
		else{
			System.out.println("\nThis is a Polygon");
		}
	}
}